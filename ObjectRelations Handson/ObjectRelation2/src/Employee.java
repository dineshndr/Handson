import java.time.LocalDate;

public class Employee {

	private int emp_code;
	private String emp_name;
	private String b_date;
	private Department dept;
	private String designation;
	private int salary;

	public Employee() {
	}

	public Employee(int employee_code, String employee_name, String birth_date, Department dept, String designation,
			int salary) {
		super();
		this.emp_code = emp_code;
		this.emp_name = emp_name;
		this.b_date = b_date;
		this.dept = dept;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmp_code() {
		return emp_code;
	}

	public void setEmp_code(int emp_code) {
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

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
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

	public static Employee allot_dept(Employee e, String dcode) {
		Department d = new Department();
		d.setDept_code(dcode);
		e.setDept(d);
		return e;
	}

	public static void countPeople(Employee[] e_array, String dept_code) {
		int count = 0;
		for (int i = 0; i < e_array.length; i++) {
			if (e_array[i].getDept().getDept_code().equals(dept_code)) {
				count++;
			}
		}
		System.out.println("Count of Employees in " + dept_code + " is :" + count);
	}

	public static void wishBirthday(Employee[] employeeArray) {
		LocalDate localDate = LocalDate.now();
		String locDate = localDate.toString();
		String[] locDayMonth = locDate.split("-");
		for (int i = 0; i < employeeArray.length; i++) {
			String[] bdayMonth = employeeArray[i].getB_date().split("-");
			if (locDayMonth[1].equals(bdayMonth[1]) && locDayMonth[2].equals(bdayMonth[2])) {
				System.out.println("Happy Birthday, " + employeeArray[i].getEmp_name());
			}
		}
	}

	@Override
	public String toString() {
		return String.format(
				"Employee [employee_code=%s, employee_name=%s, birth_date=%s, dept=%s, designation=%s, salary=%s]",
				emp_code, emp_name, b_date, dept.getDept_code(), designation, salary);
	}

}
