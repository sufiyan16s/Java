package gptcourse;

class EmployeeD{
    String name;
    int id;
    int salary;

    EmployeeD(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
public class EmpLoyeeDemo {
    public static void main(String[] args) {
        EmployeeD emp1 = new EmployeeD("Sufiyan", 258, 5000000);
        emp1.display();
    }
}
