package com.dfz.test;

import com.dfz.dao.GradeMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SSM_Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring-dao.xml");
        GradeMapper mapper1=context.getBean(GradeMapper.class);
        System.out.println(mapper1);
    }
}
