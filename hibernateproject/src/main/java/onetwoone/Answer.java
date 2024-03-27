package onetwoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	private int anId;
	private String anName;
	public Answer(int anId, String anName) {
		super();
		this.anId = anId;
		this.anName = anName;
	}
	public int getAnId() {
		return anId;
	}
	public void setAnId(int anId) {
		this.anId = anId;
	}
	public String getAnName() {
		return anName;
	}
	public void setAnName(String anName) {
		this.anName = anName;
	}
	

}
