package example6;
import java.util.*;

import org.springframework.stereotype.Component;
@Component
public class Employee {
	private String empName;
	private String empMail;
	private Address address;
	private List<String> mobileNo;
	private long salary;
	public Employee()
	{
		
	}
	public Employee(String empName, String empMail, Address address, List<String> mobileNo, long salary) {
		super();
		this.empName = empName;
		this.empMail = empMail;
		this.address = address;
		this.mobileNo = mobileNo;
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<String> getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(List<String> mobileNo) {
		this.mobileNo = mobileNo;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public void display()
	{
		System.out.println("Name:"+getEmpName());
		System.out.println("Email:"+getEmpMail());
		System.out.println(getMobileNo());
		System.out.println("Salary:"+getSalary());
	}
	
	
}

