import java.util.Random;

public class Segret {
    public static void main(String[] args) {
        StringBuffer name1 = new StringBuffer("Adityarajsingh");
        String name2 = "divy";
        String name3 = "pratham";

        String finalWord = "";

        for (int i = name1.length() / 2; i >= 0; i--) {
            finalWord += name1.charAt(i);
        }

        Random rand = new Random();
        StringBuilder tempWord = new StringBuilder(finalWord); // Using StringBuilder for mutable string

        for (int i = 0; i < name2.length(); i += 2) {
            int index = rand.nextInt(tempWord.length());
            tempWord.setCharAt(index, name2.charAt(i)); // Replace character at random index with character from name2
        }

        System.out.println("Modified FinalWord: " + tempWord.toString());
    }
}
