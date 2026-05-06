package Day13;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;
import com.cg.eis.exception.EmployeeException;
public class EmployeeDemo2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Employee Designation: ");
        String designation = sc.nextLine();

        // Use your existing Employee class
        Employee emp = new Employee(id, name, salary, designation);

        // Use your existing Service implementation
        EmployeeServiceImpl service = new EmployeeServiceImpl();

        try {
            service.findInsuranceScheme(emp);
            service.displayEmployee(emp);

            // File handling methods you added earlier
            service.writeEmployeeToFile(emp, "employee.dat");
            Employee empFromFile = service.readEmployeeFromFile("employee.dat");
            System.out.println("Employee read from file: " + empFromFile);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
