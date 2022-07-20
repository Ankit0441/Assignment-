package ankit;

public class Product {
	int id;
	String name;
	int price;
	public void setId(int id) {
		System.out.println("inside id setter");
		this.id = id;
	}
	public void setName(String name) {
		System.out.println("inside name setter");
		this.name = name;
	}
	public void setPrice(int price) {
		System.out.println("inside price setter");
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}
