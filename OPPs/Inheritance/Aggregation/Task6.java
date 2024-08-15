// 6. Multilevel Inheritance:
//    Develop a Java application to represent employees in an organization. Create a base class "Employee," a derived class "Manager," and another class "Director" derived from "Manager."

class Employees{
    private String employeeName;
    private int employeeId;
    private double salary;

    public Employees(String employeeName, int employeeId, double salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println("-- About Employee --");
        System.out.println("Employee Id :" + this.employeeId);
        System.out.println("Employee Name :" + this.employeeName);
        System.out.println("Employee Salary :" + this.salary);
    }
}
class Manager extends Employees{
    private int managerId;
    private String managerName;
    private double salary;

    public Manager(int managerId, String managerName, double managerSalary, String employeeName, int employeeId, double salary) {
        super(employeeName, employeeId, salary);
        this.managerId = managerId;
        this.managerName = managerName;
        this.salary = managerSalary;
    }

    public void showInfo() {
        System.out.println("-- About Manager --");
        System.out.println("Manager Id :" + this.managerId);
        System.out.println("Manager Name :"  + this.managerName);
        System.out.println("Manager Salary :" + this.salary);
        System.out.println("-- Employee Under This Manager --");
        super.showInfo();
    }
}
class Director{}

public class Task6 {
    public static void main(String [] args) {

    }
}
