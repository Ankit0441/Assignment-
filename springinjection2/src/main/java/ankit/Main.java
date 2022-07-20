package ankit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext ac= new ClassPathXmlApplicationContext("sp1.xml");
        Sum s=(Sum)ac.getBean(Sum.class);
        s.d();
    }
}