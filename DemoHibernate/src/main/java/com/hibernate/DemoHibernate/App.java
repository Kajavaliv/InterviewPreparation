package com.hibernate.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student student = new Student();
    	student.setId(1);
    	student.setName("Kajavali");
    	student.setAddress("Gonugunta");
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
    	
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	session.save(student);
    	tx.commit();
        System.out.println( "Hello World!" );
    }
}
