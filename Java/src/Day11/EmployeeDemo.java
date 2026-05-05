package Day11;
import java.util.Scanner;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;
import Day11.EmployeeException;

public class EmployeeDemo {
	public static void main(String[] args) throws EmployeeException {
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

        Employee emp = new Employee(id, name, salary, designation);
        EmployeeServiceImpl service = new EmployeeServiceImpl();
        if (emp.getSalary() < 3000) {
            throw new EmployeeException("Salary below 3000 is not allowed!");
        }

        try {
            service.findInsuranceScheme(emp);
            service.displayEmployee(emp);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
