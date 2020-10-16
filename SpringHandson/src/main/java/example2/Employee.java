package example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	private String empName;
	private String empMob;
	private String empMail;
	private Address empAddress;
	private long  empSal;
public Employee()
{
	
}
public Employee(String empName, String empMob, String empMail, Address empAddress, long empSal) {
	super();
	this.empName = empName;
	this.empMob = empMob;
	this.empMail = empMail;
	this.empAddress = empAddress;
	this.empSal = empSal;
}
public String getEmpName() {
	return empName;
}
@Autowired
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpMob() {
	return empMob;
}
@Autowired
public void setEmpMob(String empMob) {
	this.empMob = empMob;
}
public String getEmpMail() {
	return empMail;
}
@Autowired
public void setEmpMail(String empMail) {
	this.empMail = empMail;
}
public Address getEmpAddress() {
	return empAddress;
}

public void setEmpAddress(Address empAddress) {
	this.empAddress = empAddress;
}
public long getEmpSal() {
	return empSal;
}
public void setEmpSal(long empSal) {
	this.empSal = empSal;
}

}
