package onetoonebidirectional;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ques {
@Id
@GeneratedValue
private int qid;
private String qname;
@OneToOne(mappedBy = "que")
private Ans a1;
public int getQid() {
	return qid;
}
public void setQid(int qid) {
	this.qid = qid;
}
public String getQname() {
	return qname;
}
public void setQname(String qname) {
	this.qname = qname;
}
public Ans getA1() {
	return a1;
}
public void setA1(Ans a1) {
	this.a1 = a1;
}

}