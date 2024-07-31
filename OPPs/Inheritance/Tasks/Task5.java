// 5. Static Members in Multilevel Inheritance:
//    - Problem Statement: Create a multilevel inheritance structure with classes 'Company', 'Department', and 'Employee'. The 'Company' class should have a static attribute 'companyName' and a method 'showCompany()'. The 'Department' class should add 'departmentName', and the 'Employee' class should add 'employeeName' and 'employeeID'. Ensure proper initialization and use static members effectively.

class Company {
    private String companyName;

    public Company(String companyName) {
        this.companyName = companyName;
    }
    public void showCompany() {
        System.out.println("Company name -> " + this.companyName);
    }
}

class Department extends Company{
    private String departmentName;

    public Department(String departmentName,String companyName) {
        super(companyName); 
        this.departmentName = departmentName;
    }
    public void showDepartment() {
        super.showCompany();
        System.out.println("Department Name -> " + this.departmentName);
    }
}
class Employee extends Department{
    private String employeeName;
    private int employeeID;

    public Employee(String employeeName, int employeeID,String departmentName, String companyName) {
        super(departmentName, companyName);
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }
    public void printDetails() {
        System.out.println("--Employee Details--");
        super.showDepartment();
        System.out.print("Employee Name :"+ this.employeeName);
        System.out.print("\nEmployee I'd :"+ this.employeeID);
    }
}

public class Task5 {
    public static void main(String []args) {
        Employee e1 = new Employee("bob", 101 ,"SDE", "Amazon");
        e1.printDetails();
    }
}
