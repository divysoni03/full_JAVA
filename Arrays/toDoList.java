import java.util.Scanner;

public class toDoList {
    static int MAX_TASK = 10;
    static int CUR_TASK = 0;

    public static void addTask(String[] tasks,Scanner sc) {
        sc.nextLine();
        System.out.print("\nEnter Tasks :");
        String todoTask = sc.nextLine();
        tasks[CUR_TASK++] = todoTask;
        System.out.println("\nTask Added Successfully !");
    }
    public static void removeTask(String[] tasks,Scanner sc) {
        sc.nextLine();
        System.out.print("\nEnter Position of Task :");
        int pos = sc.nextInt(); pos--;
        System.out.println(tasks[pos] +"\nTask Done !! ");
        for(int i=pos;i<tasks.length-1;i++) {
            tasks[i] = tasks[i+1];
        }
        CUR_TASK--;
    }
    public static void displayTask(String[] tasks) {
        System.out.println("\n\n--- To Do List ---");
        for(int i=0;i<CUR_TASK;i++) {
            System.out.println((i+1)+ ". " +tasks[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tasks = new String[10];

        int choice = 0;
        do{
            System.out.print("\n1.Enter Task,\n2.Tick Task Done,\n3.Display Tasks,\n0.Exit\nEnter Your choice :");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    addTask(tasks,sc);
                    break;
                case 2:
                    removeTask(tasks,sc);
                    break;
                case 3:
                    displayTask(tasks);
                    break;
                default:
                    System.out.println("\n\nERROR : Invalid Input, Try Again.");
                    break;
            }
        }while(choice != 0);

        sc.close();
    }    
}
