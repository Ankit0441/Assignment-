package ankit1;
import javax.persistence.*;
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="type",discriminatorType= DiscriminatorType.STRING)
@DiscriminatorValue(value="book")
@Entity
@Table(name="books")

public class Book {
	@Id
	@Column(name="bookid", length=10)
	@GeneratedValue(strategy= GenerationType.AUTO)
 int id;
	@Column(name="bookname", length=10)
 String name;
	@Column(name="bookprice", length=10)
 int price;
 @Column(name="authorname", length=10)
 String author;
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
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Book( String name, int price, String author) {
	super();
	//this.id = id;
	this.name = name;
	this.price = price;
	this.author = author;
}
public Book() {
	super();
}
 
}
