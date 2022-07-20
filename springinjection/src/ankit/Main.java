package ankit;
import org.springframework.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Main {
public static void main(String[] args) {
	Resource r=new ClassPathResource("spring.xml");
	BeanFactory b= new XmlBeanFactory(r);//ads xml in IOC container
	Product p=(Product)b.getBean("p1");
	System.out.println(p);
	Product p1=(Product)b.getBean("p2");
	System.out.println(p1);
}
}
