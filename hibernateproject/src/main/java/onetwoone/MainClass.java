package onetwoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
    Session s=sf.openSession();
    Transaction tr=null;
    tr=s.beginTransaction();
    Question q=new Question();
    q.setQname("What id JDK");
    
    Answer a=new Answer(100, "Java Development kit");
    q.setA1(a);
    s.save(q);
    s.persist(a);
    tr.commit();
    System.out.println("record inserted Successfully");
    sf.close();
    

    
	}
}
