// class myThread extends Thread {
//     private int limit;
//     private int interval;

//     public myThread(){}

//     public myThread(int limit, int interval) {
//         this.limit = limit;
//         this.interval = interval;
//     }
// 
//     public void run() {
//         for(int i=0;i<this.limit; i++) {
//             System.out.println(Thread.currentThread().getName()+ " " + i);
//             try{
//                 Thread.sleep(this.interval);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class thread {
//     public static void main(String[] args) {
//         // myThread one = new myThread(11,1000);
//         // myThread two = new myThread(6,2000);

//         // System.out.println(one.getState());
//         // System.out.println(two.getState());
//         // one.start();
//         // two.start();
//         // System.out.println(one.getState());
//         // System.out.println(two.getState());

//         try{
//             System.out.println("-> Starting the thread : ");
//             for(int i=1;i<=5;i++) {
//                 System.out.println(i);
//                 Thread.sleep(1000);
//             }
//         } catch(InterruptedException e){
//             e.printStackTrace();
//         } finally {
//             System.out.println("exiting the thread.");
//         }
//     }
// }

// class Shape{
//     protected String name;
//     protected String color;

//     Shape(){}
//     Shape(String name, String color){
//         this.name = name;
//         this.color = color;
//     }
//     void printDetail() {
//         System.out.println("Name : " + this.name +"\ncolor : " + this.color);
//     }
// }

// class myException extends Exception{
//     public void notFound(){
//         super("not found!");
//     }
// }

// class Circle extends Shape{
//     protected double radius;
//     Circle(){}
//     Circle(String name, String color, double radius){
//         super(name, color);
//         this.radius = radius;
//     }

//     @Override
//     void printDetail() {
//         super.printDetail();
//         System.out.println(super.name);
//         System.out.println("Area : " + 3.14*radius*radius);
//     }

//     public float divide(int a, int b) throws ArithmeticException {
//         return a/b;
//     }
// }

// public class thread {
//     public static void main(String [] args) {
//         // Circle c1 = new Circle("first", "black", 5);
//         // // c1.printDetail();
//         // System.out.println(c1.divide(4, 0));

//         /*write a program that finds a greatest of 4 integer number using ternary operator. the number values are entered by command line arguments */

//         int a = Integer.parseInt(args[0]);
//         int b = Integer.parseInt(args[1]);
//         int c = Integer.parseInt(args[2]);
//         int d = Integer.parseInt(args[3]);
//         System.out.println((a>b) ? ( (a>c)? (a>d)?a:d :(c>d)?c:d ) : 
//                                    ( (b>c)? (b>d)?b:d : (c>d)?c:d )
//                         );
//     }
// }

// Custom Exception for Insufficient Funds
// class InsufficientFundsException extends Exception {
//     public InsufficientFundsException(String message) {
//         super(message);
//     }
// }

// BankAccount Class
// class BankAccount {
//     private double balance;

//     // Constructor to initialize balance
//     public BankAccount(double balance) {
//         this.balance = balance;
//     }

//     // Method to withdraw money
//     public void withdraw(double amount) throws InsufficientFundsException {
//         if (amount > balance) {
//             throw new InsufficientFundsException("Insufficient funds! Available balance: $" + balance);
//         }
//         balance -= amount;
//         System.out.println("Withdrawal successful! New balance: $" + balance);
//     }

//     // Method to display balance
//     public void displayBalance() {
//         System.out.println("Current balance: $" + balance);
//     }
// }

// // Main class to test BankAccount
// public class thread {
//     public static void main(String[] args) {
//         BankAccount account = new BankAccount(500); // Initial balance: $500

//         account.displayBalance();

//         try {
//             account.withdraw(200); // Successful withdrawal
//             account.withdraw(400); // This will throw InsufficientFundsException
//         } catch (InsufficientFundsException e) {
//             System.out.println("Exception: " + e.getMessage());
//         }

//         account.displayBalance();
//     }
// }


// import java.util.concurrent.ExecutorService;
// import java.util.concurrent.Executors;

// class newThread implements Runnable {
//     String name;
//     newThread(String name) {this.name = name;}

//     @Override
//     public void run() {
//         try {
//             for(int i=0;i<=5; i++) {
//                 System.out.println(name + " : " + i);
//                 Thread.sleep(1000);
//             }
//         } catch(InterruptedException e) {
//             System.out.println(e);
//         }
//     }
// }

// public class thread {
//     public static void main(String []args) {
//         // newThread one = new newThread("one");
//         // newThread two = new newThread("two");
        
//         // Thread t1 = new Thread(one);
//         // Thread t2 = new Thread(two);
        
//         // t1.start();
//         // t2.start();
        
//         Runnable two = new newThread("two");
//         Runnable one = new newThread("one");

//         ExecutorService pool = Executors.newFixedThreadPool(1);
//         pool.execute(one);
//         pool.execute(two);

//         pool.shutdown();
//     }
// }

class print {
    public void printIt(String n) {
        try {
            for(int i=0;i<=5;i++) {
                System.out.println(n + " " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread1 extends Thread{
    print p;
    Thread1(print p) {
        this.p = p;
    }
    public void run() {
        synchronized (p) {
            p.printIt("thread1");
        }
    }
}

class Thread2 extends Thread{
    print p;
    Thread2(print p) {
        this.p = p;
    }
    public void run() {
        synchronized(p) {
            p.printIt("thread2");
        }
    }
}

public class thread {
    public static void main(String[] args) {
        print p = new print();

        Thread1 t1 = new Thread1(p);
        Thread2 t2 = new Thread2(p);

        t1.start();
        t2.start();
    }
}