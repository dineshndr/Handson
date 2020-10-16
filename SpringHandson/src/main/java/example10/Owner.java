package example10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Owner {
	private String name;
	private String mobile;
	private String pwd;
public Owner()
{
	
}
public Owner(String name, String mobile, String pwd) {
	super();
	this.name = name;
	this.mobile = mobile;
	this.pwd = pwd;
}

public void SetDetails(String name,String pwd,String mobile)
{
	this.name = name;
	this.mobile = mobile;
	this.pwd = pwd;
}
public void display()
{
	System.out.println("Name:"+name);
	System.out.println("Mobile:"+mobile);
}

}
