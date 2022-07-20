package ankit;
import javax.persistence.*;
@Entity
@DiscriminatorValue(value="contemployee")

@Table(name="contemp")
public class cont extends empl {
	@Column(name="empsalar", length=10)
int salar;
	@Column(name="empbono", length=10)
int bono;
public cont() {
	super();
}
public cont(int salar, int bono) {
	super();
	this.salar = salar;
	this.bono = bono;
}
public int getSalar() {
	return salar;
}
public void setSalar(int salar) {
	this.salar = salar;
}
public int getBono() {
	return bono;
}
public void setBono(int bono) {
	this.bono = bono;
}


}
