package Day15;
import com.cg.eis.bean.Employee;
import java.util.*;

public class EmployeeSreviceImpl2 {
    private HashMap<Integer, Employee> employeeMap = new HashMap<>();

    // i) Add employee details to HashMap
    public void addEmployee(Employee emp) throws Exception {
        if (emp.getSalary() < 3000) {
            throw new Exception("Salary below 3000 is not allowed!");
        }
        employeeMap.put(emp.getId(), emp);
        System.out.println("Employee added successfully.");
    }

    // ii) Display employees based on Insurance Scheme
    public void displayByScheme(String scheme) {
        System.out.println("Employees with Insurance Scheme: " + scheme);
        for (Employee emp : employeeMap.values()) {
            if (emp.getInsuranceScheme() != null &&
                emp.getInsuranceScheme().equalsIgnoreCase(scheme)) {
                System.out.println(emp);
            }
        }
    }

    // iii) Delete employee details from map
    public boolean deleteEmployee(int id) {
        if (employeeMap.containsKey(id)) {
            employeeMap.remove(id);
            System.out.println("Employee with ID " + id + " deleted.");
            return true;
        } else {
            System.out.println("Employee not found.");
            return false;
        }
    }

    // Utility: Display all employees
    public void displayAllEmployees() {
        System.out.println("All Employees:");
        for (Employee emp : employeeMap.values()) {
            System.out.println(emp);
        }
    }
}