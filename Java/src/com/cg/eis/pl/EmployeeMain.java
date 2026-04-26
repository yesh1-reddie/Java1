package com.cg.eis.pl;
import java.util.Scanner;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;
public class EmployeeMain {
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

        Employee emp = new Employee(id, name, salary, designation);

        EmployeeService service = new EmployeeServiceImpl();
        service.findInsuranceScheme(emp);
        service.displayEmployee(emp);

        sc.close();
    }
}
