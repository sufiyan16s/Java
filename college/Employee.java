package college;

import java.util.*;

class Emp{
    String name;
    String title;
    double salary;
    int work;

    public void displayEmpDetails(){
        System.out.println("Name:" + name);
        System.out.println("Title:" + title);
        System.out.println("Salary:" + salary);
    }

    public void updateSalary(){
        if(work == 12){
            salary = salary + 15000;
        } else if(work == 10){
            salary = salary + 10000;
        } else if(work == 8){
            salary = salary + 8000;
        } else if(work == 6){
            salary = salary + 5000;
        } else if(work == 4){
            salary = salary + 3000;
        } else{
            salary = salary;
        }
    }

    public void calculateSalary(){
        salary = salary * 12;
        System.out.println("Annual Salary:" + salary);
    }
    
    
}
public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Emp employee = new Emp();

        System.out.println("Enter employee's name:");
        employee.name = sc.nextLine();

        System.out.println("Enter employee's title:");
        employee.title = sc.nextLine();

        System.out.println("Enter employee's salary:");
        employee.salary = sc.nextDouble();

        System.out.println("Enter employee's work hours:");
        employee.work = sc.nextInt();

        employee.updateSalary();
        employee.calculateSalary();
        employee.displayEmpDetails();
    }
}
