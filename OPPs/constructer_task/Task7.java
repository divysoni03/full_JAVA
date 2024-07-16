// 7. Employee Class: Implement an `Employee` class with a constructor to store an employee's name, employee ID, and salary.
class Employees{
    private String employeeName;
    private long employeeId;
    private double employeeSalary;

    public Employees() {
        this.employeeName = "";
        this.employeeId = 0;
        this.employeeSalary = 0.0;
    }
    public Employees(String employeeName,long employeeId, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
    }

    void displayEmployee() {
        System.out.println("Employee Details");
        System.out.print("\n\nEmployee Name :"+this.employeeName+", Employee I'd :"+this.employeeId+", Employee Salary :"+this.employeeSalary);
    }
}

public class Task7 {
    public static void main(String []args) {
        Employees e1 = new Employees("divy",101,10000);
        Employees e2 = new Employees("shrey k",102,50000);

        e1.displayEmployee();
        e2.displayEmployee();
    }    
}
