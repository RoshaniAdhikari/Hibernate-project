package com.hibernateproject;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session s=sf.openSession();
        Session s1=sf.openSession();
        Transaction tr=null;
        tr=s.beginTransaction(); 
        
      /*  while(true)
    	{
        	Scanner sc=new Scanner(System.in);
    		System.out.println();
            System.out.println("Menu In Employee Management System :");
            System.out.println();
            System.out.println("1. Add Book");
            System.out.println("2. Update Book ");
            System.out.println("3. Display Book");            
            System.out.println("4. Delete Book Data");
            System.out.println("5.Count Number Of Book");
            System.out.println("6. Search Book");
            System.out.println("7.Sort By Price");
            System.out.println("8.Exit");
            System.out.println();
            System.out.print("Enter Your Choice: ");
            System.out.println();
            int choice = sc.nextInt();          
            switch (choice) {
            case 1:
                addBook(s, tr, sc);
                break;
            case 2:
                updateBook(s, sc);
                break;
            case 3:
                displayBooks(s);
                break;
            case 4:
                deleteBook(s, tr, sc);
                break;
            case 5:
                countBooks(s);
                break;
            case 6:
                searchBooks(s, sc);
                break;
            case 7:
                sortByPrice(s);
                break;
            case 8:
                System.out.println("Exiting Employee Management System. Goodbye!");
                tr.commit();
                sf.close();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Choice. Please enter a valid option.");
                break;
        }
    }
}
    private static void addBook(Session s, Transaction tr, Scanner sc) {
            System.out.println("Enter Book Name:");
            String bName = sc.next();
            System.out.println("Enter Book Price:");
            int bPrice = sc.nextInt();
            Book newBook = new Book();
            newBook.setbName(bName);
            newBook.setbPrice(bPrice);
            s.save(newBook);
            tr.commit();
            System.out.println("Book added successfully!");
    }
    private static void updateBook(Session s, Scanner sc) {
    	System.out.println("Enter Book ID to update:");
        int bookId = sc.nextInt();
        Book bookToUpdate = s.get(Book.class, bId);

        if (bookToUpdate != null) {
            System.out.println("Current Book Details:");
            System.out.println("Book ID: " + bookToUpdate.getbId());
            System.out.println("Current Book Name: " + bookToUpdate.getbName());
            System.out.println("Current Book Price: " + bookToUpdate.getbPrice());

            System.out.println("Enter New Book Name");
            String newBookName = sc.nextLine(); // Consume the newline character from the previous input
            newBookName = sc.nextLine(); // Read the actual input

            System.out.println("Enter New Book Price");
            int newBookPrice = sc.nextInt();

            if (!newBookName.isEmpty()) {
                bookToUpdate.setbName(newBookName);
            }

            if (newBookPrice != 0) {
                bookToUpdate.setbPrice(newBookPrice);
            }
            s.update(bookToUpdate);
            System.out.println("Book updated successfully!");
        } else {
            System.out.println("Book not found with ID: " + bookId);
        }
    }
    private static void displayBooks(Session s) {
        // Implement code to display books
        // You can query the database and print the details of all books
    }
    private static void deleteBook(Session s, Transaction tr, Scanner sc) {
        // Implement code to delete book
        // You can take input from the user, load the book from the database, and delete it
    }
    private static void countBooks(Session s) {
        // Implement code to count books
        // You can execute a query to get the count of books and print the result
    }
    private static void searchBooks(Session s, Scanner sc) {
        // Implement code to search books
        // You can take input from the user, execute a query, and print the search results
    }
    private static void sortByPrice(Session s) {
        // Implement code to sort books by price
        // You can execute a query with an order by clause on the price field and print the results
    }
}*/
    
    		
//        Book b=new Book();
//        b.setbName("Core Java");
//        b.setbPrice(300);
//        Book b1=new Book();
//        b1.setbName("Adv. Java");
//        b1.setbPrice(500);
//        s.save(b);
//        s.save(b1);
//        Book b2=new Book("c++", 400);
//        s.save(b2);
//        Book b3=new Book("Hibername", 4000);
//        s.save(b3);
//        Book b4=new Book("Oops", 3300);
//        s.save(b4);     
//      Book b = new Book();
//      b.setbId(2);
//      s.delete(b);
//      update
//      Book b = new Book();
//    b.setbId(3);
//    b.setbName("Java");
//    b.setbPrice(400);
//    s.update(b);
//      Query q=s.createQuery("from Book");
//      List<Book> li=q.list();
//      for(Book bk:li)
//      {
//      	System.out.println(bk);
//      }
//        System.out.println("Book updated Successfully");
//        Query qr1=s.getNamedQuery("findBooksBetweenNames");
//        qr1.setString("bName", "Java");
//        qr1.setString("bName", "c++");
//        List<Book> ls=qr1.list();
//        for(Book bk:ls)
//        {
//        	System.out.println(bk);
//        }    
//        List count=s.getNamedQuery("getBookCount").list();
//        System.out.println("Total No Of Books"+count.get(0));
//        tr.commit();
//        sf.close();
 //   Criteria crit = s.createCriteria(Book.class);
//      crit.add(Restrictions.eq("bName",".Net"));
//      crit.add(Restrictions.le("bPrice", 400));     // le means <=
//      crit.add(Restrictions.between("bPrice", 100, 500));
//      crit.addOrder(Order.desc("bPrice"));
//      crit.addOrder(Order.asc("bPrice"));   
//      crit.setFirstResult(1);
//      crit.setMaxResults(4);
//      List results = crit.list();
//     crit.setProjection(Projections.rowCount()); // To get total row count.
//     System.out.println(crit.list().get(0));
//      crit.setProjection(Projections.avg("bPrice"));// To get average of a property.
//      crit.setProjection(Projections.countDistinct("firstName")); // To get distinct count of a property.
//      crit.setProjection(Projections.max("bPrice"));      // To get maximum of a property.
//      System.out.println(crit.list().get(0));

//      crit.setProjection(Projections.min("salary"));//      To get minimum of a property.
//      crit.setProjection(Projections.sum("salary"));//      To get sum of a property.
  
     
//         Query query = s.createQuery("select bPrice,count(bPrice) from Book group by bPrice having bPrice>300");
//         List<Object[]> li = query.list();
//         li.forEach(item-> System.out.println("bPrice : "+item[0]+"\t count : "+item[1])); 
//      List<Book> list = crit.list();
//      System.out.println("Record Found");
//      for(Book b1: list) {
//      	System.out.println(b1);
//      }	
//      }
//    }
        
        Book b=(Book) s.load(Book.class, new Integer(3));
        System.out.println(b.getbName());
        
       /* we can not disable the first-level cache in hibernate, we can 
        * certainly remove some of the objects from it when needed. 
        * This is done using two methods :
        	Session.evict()
        	Session.clear() 
        	Here Session.evict() is used to remove a particular object from the cache
        	 associated with a session, and a clear() method is used to remove all 
        	 cached objects associated with a session. So they are essentially like
        	  removing one and removing all.*/
       // s.clear();
        s.evict(b);
        Book b1=(Book) s.load(Book.class, new Integer(3));
        System.out.println(b1.getbName());
    }
}
