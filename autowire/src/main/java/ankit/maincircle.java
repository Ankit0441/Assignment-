package ankit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class maincircle {
	public static void main( String[] args )
    {
        ApplicationContext ac= new ClassPathXmlApplicationContext("sp2.xml");
        circle s=(circle)ac.getBean("p1");
        s.d();
    }
}
