package example3;

public class Box {
	private User user;
	private int length;
	private int breadth;
public Box()
{
	
}
public Box(User user, int length, int breadth) {
	super();
	this.user = user;
	this.length = length;
	this.breadth = breadth;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getBreadth() {
	return breadth;
}
public void setBreadth(int breadth) {
	this.breadth = breadth;
}

}
