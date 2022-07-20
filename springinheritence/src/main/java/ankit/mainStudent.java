package ankit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainStudent {
	public static void main( String[] args )
    {
        ApplicationContext ac= new ClassPathXmlApplicationContext("sp1.xml");
        Student s=(Student)ac.getBean("p1");
        System.out.println(s);
    }
}
