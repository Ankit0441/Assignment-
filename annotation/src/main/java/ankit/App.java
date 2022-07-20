package ankit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext ac= new ClassPathXmlApplicationContext("sp1.xml");
         emp s=(emp)ac.getBean("e2");
         s.m();
         emp s1=(emp)ac.getBean("e1");
         s1.m1();
         
         
    }
}
