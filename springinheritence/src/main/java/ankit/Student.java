package ankit;

public class Student {
 int id;
 String name;
 String course;
 String country;

public void setId(int id) {
	this.id = id;
}

public void setName(String name) {
	this.name = name;
}

public void setCourse(String course) {
	this.course = course;
}

public Student() {
	super();
}

public void setCountry(String country) {
	this.country = country;
}
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Student(int id, String name, String course, String country) {
	super();
	this.id = id;
	this.name = name;
	this.course = course;
	this.country = country;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", course=" + course + ", country=" + country + "]";
}
 
}
