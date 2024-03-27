package cascadeexample;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=null;
		t=s.beginTransaction();
		
		Learner l=new Learner();
//		l.setlId(4);
//		l.setlName("Sona");
//		
//		Mobile m=new Mobile();
//		m.setMid(103);
//		m.setMno("9689617090");
//		
//		List<Mobile> li=new ArrayList<Mobile>();
//		li.add(m);
//		l.setLi(li);
//		
//		l.addMobileNo(m);
	//	s.persist(l);
		l.setlId(4);
		s.delete(l);
		
//		Mobile m=new Mobile();
//		m.setMid(103);
//		s.delete(m);
		
		t.commit();
		sf.close();

	}

}
