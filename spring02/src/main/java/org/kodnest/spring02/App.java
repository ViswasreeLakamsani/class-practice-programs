package org.kodnest.spring02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Laptop;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml"); 
		  Laptop l1 =  (Laptop) context.getBean("l1");
		  System.out.println("---> Object created by Spring = "+ l1);
		  Laptop l2 =  (Laptop) context.getBean("l2");
		  System.out.println("---> Object created by Spring = "+ l2);
    }
}
