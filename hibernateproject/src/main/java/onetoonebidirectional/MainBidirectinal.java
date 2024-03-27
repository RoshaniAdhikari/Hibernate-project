package onetoonebidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import onetwoone.Answer;
import onetwoone.Question;

public class MainBidirectinal {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
	    Session s=sf.openSession();
	    Transaction tr=null;
	    tr=s.beginTransaction();
	    Ques q=new Ques();
	    q.setQname("What id JVM");  
	    Ans a=new Ans(101, "Java Virtual Machine");
	    q.setA1(a);
	    a.setQue(q);
	    s.save(q);
	    s.persist(a);
	    tr.commit();
	    System.out.println("record inserted Successfully");
	    sf.close();
	  
		}
}
