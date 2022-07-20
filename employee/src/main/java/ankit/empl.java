package ankit;


import javax.persistence.*;
@Inheritance(strategy= InheritanceType.JOINED)
@DiscriminatorColumn(name="type",discriminatorType= DiscriminatorType.STRING)
//@DiscriminatorValue(value="employee")
@Entity
@Table(name="empdetails")

public class empl {
	@Id
	@Column(name="empid", length=10)
	@GeneratedValue(strategy= GenerationType.AUTO)
int id;
	@Column(name="empname", length=10)
String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public empl() {
	super();
}
public empl(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

}
