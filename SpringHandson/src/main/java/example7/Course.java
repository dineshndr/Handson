package example7;

import org.springframework.stereotype.Component;

@Component
public class Course {
	private String name;
	private String mentor;
	private double fee;
public Course()
{
	
}
public Course(String name, String mentor, double fee) {
	super();
	this.name = name;
	this.mentor = mentor;
	this.fee = fee;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMentor() {
	return mentor;
}
public void setMentor(String mentor) {
	this.mentor = mentor;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
public void display()
{
	System.out.println("name:"+getName());
	System.out.println("mentor:"+getMentor());
	System.out.println("fee:"+getFee());
}
}
