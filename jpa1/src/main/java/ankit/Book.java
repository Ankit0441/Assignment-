package ankit;
import javax.persistence.*;
@Entity
@Table(name="bookjpa")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String name;
int price;

@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
}
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
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}


}
