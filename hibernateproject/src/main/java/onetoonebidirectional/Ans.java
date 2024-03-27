package onetoonebidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ans {
	@Id
	private int ansid;
	private String ansname;
	@OneToOne
	private Ques que;
	public Ans(int ansid, String ansname) {
		super();
		this.ansid = ansid;
		this.ansname = ansname;
	//	this.que = que;
	}
	public int getAnsid() {
		return ansid;
	}
	public void setAnsid(int ansid) {
		this.ansid = ansid;
	}
	public String getAnsname() {
		return ansname;
	}
	public void setAnsname(String ansname) {
		this.ansname = ansname;
	}
	public Ques getQue() {
		return que;
	}
	public void setQue(Ques que) {
		this.que = que;
	}
	
}