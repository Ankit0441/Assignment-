package ankit;
import javax.persistence.*;
@Entity
@DiscriminatorValue(value="regemployee")

@Table(name="regemp")

public class reg extends empl {
	
	@Column(name="empsalary", length=10)
int salary;
	@Column(name="empbonous", length=10)
int bonous;
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getBonous() {
	return bonous;
}
public reg() {
	super();
}
public void setBonous(int bonous) {
	this.bonous = bonous;
}
public reg(int salary, int bonous) {
	super();
	this.salary = salary;
	this.bonous = bonous;
}

}
