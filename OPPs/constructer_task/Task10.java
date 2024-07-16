// 10. Computer Class: Create a `Computer` class with a constructor to store information about a computer, including its brand, model, and price.

class Computer {
    private String computerBrand;
    private String computerModel;
    private double computerPrice;

    public Computer() {
        this.computerBrand = "";
        this.computerModel = "";
        this.computerPrice = 0.0;
    }
    public Computer(String computerBrand,String computerModel,double computerPrice) {
        this.computerBrand = computerBrand;
        this.computerModel = computerModel;
        this.computerPrice = computerPrice;
    }

    void displayComputer() {
        System.out.println("Computer Details");
        System.out.println("Computer Brand : " + this.computerBrand);
        System.out.println("Computer Model : " + this.computerModel);
        System.out.println("Computer Price : " + this.computerPrice);
    }
}

public class Task10 {
    public static void main(String[] args) {
        Computer c1 = new Computer("lenovo","ideapad gaming 3",82000);
        c1.displayComputer();
    }
}
