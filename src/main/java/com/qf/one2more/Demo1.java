package com.qf.one2more;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class Demo1 {
    private static SqlSessionFactory factory = null;
    static {
        Reader resourceAsReader = null;
        try {
            resourceAsReader = Resources.getResourceAsReader("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        factory = new SqlSessionFactoryBuilder().build(resourceAsReader);

    }

    public static void select1() {
        SqlSession session = factory.openSession();
        DepartmentDao mapper = session.getMapper(DepartmentDao.class);
        Department byDid1 = mapper.findByDid1(3);
        System.out.println(byDid1);
        session.commit();
        session.close();
    }

    public static void main(String[] args) {
        select1();
    }
}
