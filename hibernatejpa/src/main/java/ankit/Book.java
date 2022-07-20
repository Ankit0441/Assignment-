package ankit;
import javax.persistence.*;
import java.util.*;
public class Book {
	
		int id;
		int name;
		int price;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getName() {
			return name;
		}
		public void setName(int name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public Book(int name, int price) {
			super();
			this.name = name;
			this.price = price;
		}
		public Book() {
			super();
		}
		
	

}
