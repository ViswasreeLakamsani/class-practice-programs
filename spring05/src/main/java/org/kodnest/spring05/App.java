package org.kodnest.spring05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.beans.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
        Person p1=(Person) context.getBean("person");
        System.out.println(p1);
    }
}
