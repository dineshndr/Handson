
import java.io.*;

public class Main {
	public static Employee[] getEmployeeData() throws NumberFormatException, IOException {
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of Employees");
		n = Integer.parseInt(br.readLine());
		String[] empRecords = new String[n];
		Employee[] empArray = new Employee[n];
		for (int i = 0; i < n; i++) {
			
			empRecords[i] = br.readLine();
		}
		for (int i = 0; i < n; i++) {
			String[] a = empRecords[i].split(",");
			Employee c = new Employee();
			c.setEmp_code(Integer.parseInt(a[0]));
			c.setEmp_name(a[1]);
			c.setB_date(a[2]);
			c.setDept(Employee.allot_dept(c, a[3]).getDept());
			c.setDesignation(a[4]);
			c.setSalary(Integer.parseInt(a[5]));
			empArray[i] = c;
		}
		return empArray;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee[] empArray = Main.getEmployeeData();
		System.out.println("Enter dept code");
		String dept_code = br.readLine();
		Employee.countPeople(empArray, dept_code);

	}

}
