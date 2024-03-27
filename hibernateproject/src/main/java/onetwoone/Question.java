package onetwoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@GeneratedValue
	private int qid;
	private String Qname;
@OneToOne
@JoinColumn
	private Answer a1;
public int getQid() {
	return qid;
}
public void setQid(int qid) {
	this.qid = qid;
}
public String getQname() {
	return Qname;
}
public void setQname(String qname) {
	Qname = qname;
}
public Answer getA1() {
	return a1;
}
public void setA1(Answer a1) {
	this.a1 = a1;
}
}
