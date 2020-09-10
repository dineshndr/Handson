import java.io.*;
public class Main {
	public static Employee[] getEmp_Data() throws NumberFormatException, IOException {
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of Employees");
		n = Integer.parseInt(br.readLine());
		String emp_Records[] = new String[n];
		Employee emp_Array[] = new Employee[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter " +(i+1)+" record");
			System.out.println("Enter birthday in yy/mm/dd format");
			emp_Records[i] = br.readLine();
		}
		for (int k = 0; k < n; k++) {
			String[] e = emp_Records[k].split(",");
			emp_Array[k] = new Employee(Integer.parseInt(e[0]), e[1], e[2], e[3], e[4],
					Integer.parseInt(e[5]));
		}
		return emp_Array;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Employee[] emp_Array = Main.getEmp_Data();
		Employee.wishBirthday(emp_Array);
	}

}
