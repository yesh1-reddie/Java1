package Day14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;
import com.cg.eis.exception.EmployeeException;
public class EmployeeDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Employee details
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

        try {
            service.findInsuranceScheme(emp);
            service.displayEmployee(emp);

            service.writeEmployeeToFile(emp, "employee.dat");
            Employee empFromFile = service.readEmployeeFromFile("employee.dat");
            System.out.println("Employee read from file: " + empFromFile);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Product names stored in ArrayList
        ArrayList<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Mobile");
        products.add("Tablet");
        products.add("Camera");
        products.add("Headphones");

        Collections.sort(products);

        System.out.println("\nSorted Product Names:");
        for (String product : products) {
            System.out.println(product);
        }

        sc.close();
    }
}
