package ankit;
import javax.persistence.*;
@Entity
@Table(name="studentm1")
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="sid", length=2)
	int sid;
	@Column(name="sname", length=22)
	String sname;
	@Column(name="cource", length=22)
	String cource;
	@ManyToOne
	@JoinColumn(name="uid")
	University university;
	public Student(String sname, String cource, University university) {
		super();
		this.sname = sname;
		this.cource = cource;
		this.university = university;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	public Student() {
		super();
	}
	

}
