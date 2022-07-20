package ankit;

public class byname {
int id;
String name;
int price;
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "byname [id=" + id + ", name=" + name + ", price=" + price + "]";
}


}
