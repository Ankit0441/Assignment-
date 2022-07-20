package ankit;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="university1m")
public class University {
	@Id
	@Column(name="uid", length=2)
	@GeneratedValue(strategy= GenerationType.AUTO)
	int uid;
	@Column(name="uname", length=22)
	String uname;
	@Column(name="ucountry", length=12)
	String ucountry;
	@OneToMany(mappedBy="university", cascade=CascadeType.ALL)
	List<Student> ls;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUcountry() {
		return ucountry;
	}
	public void setUcountry(String ucountry) {
		this.ucountry = ucountry;
	}
	public List<Student> getLs() {
		return ls;
	}
	public void setLs(List<Student> ls) {
		this.ls = ls;
	}
	public University(String uname, String ucountry, List<Student> ls) {
		super();
		this.uname = uname;
		this.ucountry = ucountry;
		this.ls = ls;
	}
	public University() {
		super();
	}
	

}
