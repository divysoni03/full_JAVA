// 9. Static Final Variables in Hierarchical Inheritance:
//    - Problem Statement: Implement a hierarchical inheritance setup with classes 'Building', 'Office', and 'Residence'. The 'Building' class should have a static final variable 'BUILDING_TYPE', and a method 'showType()'. The 'Office' and 'Residence' classes should override 'showType()' to display specific information. Ensure correct use of static final variables and method overriding.

class Building{
    private static String BUILDING_TYPE;
    public Building(String BUILDING_TYPE) {
        Building.BUILDING_TYPE = BUILDING_TYPE;
    }
    public void showType() {
        System.out.println("Building Type : " + BUILDING_TYPE);
    }
}
class Office extends Building{
    private String officeLocation;
    private int numberOfemployees;
    private int numberOfdepartments;

    public Office(String BUILDING_TYPE, String officeLocation, int numberOfemployees, int numberOfdepartments) {
        super(BUILDING_TYPE);
        this.officeLocation = officeLocation;
        this.numberOfemployees = numberOfemployees;
        this.numberOfdepartments = numberOfdepartments;
    }

    @Override
    public void showType() {
        System.out.println("-- About Office --");
        super.showType();
        System.out.println("number of employees :" + this.numberOfemployees);
        System.out.println("number of departments : " + this.numberOfdepartments);
        System.out.println("office location : " + this.officeLocation);
    }
}
class Residence extends Building{
    private String residenceLocation;
    private int numberOfBuildings;
    public Residence(String BUILDING_TYPE, String residenceLocation, int numberOfBuildings) {
        super(BUILDING_TYPE);
        this.residenceLocation = residenceLocation;
        this.numberOfBuildings = numberOfBuildings;
    }

    @Override
    public void showType() {
        System.out.println("-- About Residence --");
        super.showType();
        System.out.println("residence Location : " + this.residenceLocation);
        System.out.println("number of buildings : "+ this.numberOfBuildings);
    }
}

public class Task9 {
    public static void main(String[] args) {
        Office f1 = new Office("Square one", "sargasan", 20, 3);
        Residence r1 = new Residence("futuristic", "sector 1", 2);

        f1.showType();
        r1.showType();
    }
}
