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
       ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");
       product p= new product(2,"laptop",122000);
       productDao pd=(productDao)ac.getBean("mydao");
       System.out.println(pd.save(p)+" row inserted!!!");
       // create a table in mysql manaually
    }
}
