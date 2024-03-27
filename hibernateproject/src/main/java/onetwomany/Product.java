package onetwomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Product {
	@Id
	private int pId;
	private String pName;
	
	@ManyToOne
	private Category ct;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Category getCt() {
		return ct;
	}

	public void setCt(Category ct) {
		this.ct = ct;
	}

	public Product(int pId, String pName, Category ct) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.ct = ct;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", ct=" + ct + "]";
	}
	

}
