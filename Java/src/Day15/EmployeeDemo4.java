package Day15;
import java.util.Scanner;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;

public class EmployeeDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeServiceImpl service = new EmployeeServiceImpl();

        try {
            // Add multiple employees
            Employee e1 = new Employee(101, "Divya", 45000, "Programmer");
            e1.setInsuranceScheme("Gold");
            service.displayEmployee(e1);

            Employee e2 = new Employee(102, "Bharathi", 55000, "Manager");
            e2.setInsuranceScheme("Premium");
            service.displayEmployee(e2);

            Employee e3 = new Employee(103, "Kathy", 25000, "System Associate");
            e3.setInsuranceScheme("Silver");
            service.displayEmployee(e3);

            service.displayAllEmployees();

            // Accept scheme from user
            System.out.print("\nEnter Insurance Scheme to filter: ");
            String scheme = sc.nextLine();
            service.displayByScheme(scheme);

            // Delete employee
            System.out.print("\nEnter Employee ID to delete: ");
            int id = sc.nextInt();
            service.deleteEmployee(id);

            System.out.println("\nAfter Deletion:");
            service.displayAllEmployees();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
