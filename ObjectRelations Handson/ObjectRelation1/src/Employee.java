import java.time.LocalDate;

public class Employee {
	private int salary;
	private int emp_code;
	private String emp_name;
	private String b_date;
	private String dept_code;
	private String designation;
	

	

	public Employee(int emp_code, String emp_name, String b_date, String dept_code, String designation,
			int salary) {
		super();
		this.emp_code = emp_code;
		this.emp_name = emp_name;
		this.b_date = b_date;
		this.dept_code = dept_code;
		this.designation = designation;
		this.salary = salary;
	}
	public Employee() {
	}
	public int getEmployee_code() {
		return emp_code;
	}

	public void setEmployee_code(int emp_code) {
		this.emp_code = emp_code;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getB_date() {
		return b_date;
	}

	public void setB_date(String b_date) {
		this.b_date = b_date;
	}

	public String getDept_code() {
		return dept_code;
	}

	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void wishBirthday(Employee[] empArray) {
		LocalDate localDate = LocalDate.now();
		String locDate = localDate.toString();
		String[] locDayMonth = locDate.split("-");
		for (int i = 0; i < empArray.length; i++) {
			String[] bdayMonth = empArray[i].getB_date().split("-");
			if (locDayMonth[1].equals(bdayMonth[1]) && locDayMonth[2].equals(bdayMonth[2])) {
				System.out.println("Happy Birthday, " + empArray[i].getEmp_name());
			}
		}
	}

}
