package gptcourse;

class Employees{
    String name;
    int salary;

    Employees(String n, int s){
        name = n;
        salary = s;
    }

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
public class Employee {
    public static void main(String[] args){
        Employees emp1 = new Employees("Sufiyan", 20000);
        emp1.displayDetails();
    }
    
}
