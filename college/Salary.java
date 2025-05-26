package college;

import java.util.*;

class EmployeeSalary{
    String name;
    double empId;
    double basicSalary;
    double hra;
    double da;
    double grossSalary;

    public void calculatehra(){
        hra = basicSalary * 0.20;
    }

    public void calculateda(){
        da = basicSalary * 0.50;
    }

    public void calculateGrossSalary(){
        grossSalary = basicSalary + hra + da;
    }

    public void displaySalarySlip(){
        System.out.println("---Salary Slip---");
        System.out.println("Employee Name:" + name);
        System.out.println("Employee ID:" + empId);
        System.out.println("Basic Salary:" + basicSalary);
        System.out.println("HRA:" + hra);
        System.out.println("DA:" + da);
        System.out.println("Gross Salary:" + grossSalary);
    }
}
public class Salary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeSalary emp = new EmployeeSalary();
        
        System.out.println("Enter employee's name:");
        emp.name = sc.nextLine();

        System.out.println("Enter employee ID:");
        emp.empId = sc.nextDouble();

        System.out.println("Enter Employee's basic salary:");
        emp.basicSalary = sc.nextDouble();


        emp.calculatehra();
        emp.calculateda();
        emp.calculateGrossSalary();
        emp.displaySalarySlip();

        
    }
}
