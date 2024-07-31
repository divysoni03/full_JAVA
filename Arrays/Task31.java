// 31. Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true.

public class Task31 {
    public static void main(String []args) {
        int[]arr = {1,2,10,5,10,2,24};

        int flag =0 ;
        for(int ele : arr) {
            if(ele == 10 ) {
                flag += ele;
            }
        }
        System.out.println(flag==10 ? "True" : "False");
    }    
}
