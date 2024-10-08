// 2. Text Processing:
//    Create a search engine algorithm that reads and analyzes a text file, enabling users to input a word or phrase to find all occurrences and their respective positions within the document.

public class Task2 {
    public static String searchOccurences(String text, String query) {
        StringBuilder result = new StringBuilder();
        int start = 0, count = 0;
        text = text.toLowerCase();
        query = query.toLowerCase();

        while(true) {
            start = text.indexOf(query, start);

            if (start == -1) break;

            if (count > 0) result.append(", ");
            result.append(start);

            start += query.length();
            count++;
        }
        return "Positions found at [" + result.toString() + "]";
    }
        
    public static void main(String[] args) {
        String inputText = "Java is a popular programming language. Java is used for various applications.";
        String searchQuery = "jaVa";

        String resultPositions = searchOccurences(inputText, searchQuery);

        System.out.println(resultPositions);
    }
}
