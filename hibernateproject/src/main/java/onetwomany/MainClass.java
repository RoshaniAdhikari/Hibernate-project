package onetwomany;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernateproject.Book;

public class MainClass {
public static void main(String[] args) {
	
	//the SessionFactory in Hibernate is responsible for the creation of Session objects. The Hibernate Session provides methods such as save, delete and update, all of which are used to perform CRUD-based operations on the database to which the SessionFactory connects.
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=null;
	t=s.beginTransaction();
	
//	Category c=new Category();
//	c.setcName("Clothing");
//	s.save(c);
//	
//	Product p=new Product(101, "Womens ware", c);
//	Product p1=new Product(102, "mens ware", c);
//	Product p2=new Product(103, "childrens ware", c);
//	s.save(p);
//	s.save(p1);
//	s.save(p2);
//	
//	List<Product>li=new ArrayList<Product>();
//	li.add(p);
//	li.add(p1);
//	li.add(p2);
//	c.setPlist(li);
//	t.commit();
//	System.out.println("Record Inserted Successfully");
//		
//	List<?> l1 = s.createQuery("from Product").list();
//    for(Iterator<Product> i1 = (Iterator<Product>) l1.iterator(); i1.hasNext();) {
//    	Product ques = i1.next();
//    	System.out.println("Product - "+ques.getpId()+" : "+ques.getpName());
//    }
//    List<?> l2 = s.createQuery("from Category").list();
//    for(Iterator<Category> i2 = (Iterator<Category>) l2.iterator(); i2.hasNext();) {
//    	Category ans = i2.next();
//    	System.out.println("Category - "+ans.getcId()+" : "+ans.getcName());
//    }
//	Query q=s.createQuery("from Product");
//    List<Product> l=q.list();
//    for(Product pd:l)
//    {
//    	System.out.println(pd);
//    }
	
	Query q=s.createQuery("select p.pId,p.pName,c.cId from Product p left join p.Category c");
  List l=q.list();
  Iterator itr=l.iterator();
  while(itr.hasNext())
  {
	  Object rows[] = (Object[])itr.next();
      System.out.println(rows[0]+ " -- " +rows[1] + "--"+rows[2]+"--"+rows[3]);
  }
 

	
}
}
