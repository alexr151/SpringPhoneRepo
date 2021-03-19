package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fName;
	private String lName;
	private String age;
	@Autowired
	private Phone phone;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}
	
	public User(String fName, String lName, String age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}
	
	public User(int id, String fName, String lName, String age) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fName=" + fName + ", lName=" + lName + ", age=" + age + ", phone=" + phone + "]";
	}
	
	
}
