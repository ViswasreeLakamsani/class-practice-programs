package org.kodnest.spring04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.beans.University;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
       University u1 =(University) context.getBean("university");
       System.out.println(u1);
    }
}
