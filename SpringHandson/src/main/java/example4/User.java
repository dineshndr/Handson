package example4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("user")
public class User {

	private String name;
	private int age;
	private String city;
	
	private Order order;

	public User() {
	}

	public User(String name, int age, String city, Order order) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Order getOrder() {
		return order;
	}

	
	@Autowired
	public void setOrder(@Qualifier("order2") Order order) {
		this.order = order;
	}

	public void display() {
		System.out.println("Name: " + this.name + "\n" + "age: " + this.age + "\n" +"City: "+this.city+"\n"+this.order);
	}
}