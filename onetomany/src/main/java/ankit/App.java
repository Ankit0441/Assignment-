package ankit;
import java.util.*;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration c= new Configuration();
        c.configure("hibernate.cfg.xml");
        SessionFactory sf=c.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        Student s1= new Student();
        s1.setSname("amit");
        
        s1.setCource("b.tech");
        Student s2= new Student();
        s2.setSname("amitesh");
        s2.setCource("bca");
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(s2);al.add(s1);
        University u= new University();
        u.setUname("AKTU");
        u.setUcountry("India");
        s1.setUniversity(u);s2.setUniversity(u);
        u.setLs(al);
        s.save(u);
        t.commit();
        s.close();
        System.out.println("1:m and m:1 mapping done!!");
        
        
    }
}
