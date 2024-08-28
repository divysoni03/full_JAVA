
public class Stringss {
    public static void main(String[] args) {
        /*
        String s1 = new String("Kathan");   // -1138507785
        String s2 = "kathani";   // -2054640617

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        */

        String str = "Welcome_to_Java_World";

        // System.out.println(str.charAt(19));
        // System.out.println(str.length());
        // System.out.println(str.substring(10));
        // System.out.println(str.substring(10, 15));
        // System.out.println(str.indexOf('_', 8));
        // System.out.println(str.indexOf("or", 8));
        // System.out.println(str.lastIndexOf("a", 13));
        // System.out.println(str.startsWith("Welcome"));
        // System.out.println(str.startsWith("to", 8));
        // System.out.println(str.endsWith("World"));
        // System.out.println("HeLlO".toLowerCase());
        // System.out.println("HeLlO".toUpperCase());
        // str = "   sd sd    ";
        // System.out.println("\n" + str + " -> " + str.length() + "\n" + str.trim() + " -> " + str.trim().length());
        // System.out.println(str.replace('a', 'A'));
        // System.out.println(str.replace("Java", "python".toUpperCase()));
        // System.out.println(str.toLowerCase().contains("java".toLowerCase()));
        // String s = new String();
        // String s = "";
        // System.out.println(s.isEmpty());
        
        // Integer _i = 123;    //creates an object
        // System.out.println(_i + " -> " + _i.getClass().getSimpleName());
        
      //   int i = 2345;   //creates a variable
      //   String s = String.valueOf(i);
      //   System.out.println(s + "abc");
        // System.out.println(i + " -> " + ((Object) i).getClass().getSimpleName());
        // System.out.println(s + " -> " + s.getClass());

        // int ab = Integer.valueOf(s);
        // System.out.println(ab + " -> " + ((Object)ab).getClass().getName());

        // System.out.println("Hello ".concat("World."));
        // char a[] = new char[10];
        // a = str.substring(0, 10).toCharArray();
        
        // for (char c : a) {
        //     System.out.print(c + " ");
        // }
        // System.out.println();

        // System.out.println("Hello".equals("hello"));
        // System.out.println("Hello".equalsIgnoreCase("hElLo"));
        // System.out.println("Hello".compareToIgnoreCase("hello"));
        // str = "Dhruv";
        // System.out.println(String.format("this is a string example -> %s\n\n%d %d", str, 1, 2));

    }
}
/*
String is an immutable class.

Java Wrapper Classes:
int -> Integer
float -> Float
double -> Double
boolean -> Boolean
String -> String


String Methods:
1. charAt(int index): Returns the character at the specified index.
2. length(): Returns the length of the string.
3. substring(int beginIndex): Returns a substring starting from the specified index.
4. substring(int beginIndex, int endIndex): Returns a substring within the specified range.
5. indexOf(int ch): Returns the index of the first occurrence of a specified character.
6. indexOf(int ch, int fromIndex): Returns the index of the first occurrence of a specified character starting from the given index.
7. indexOf(String str): Returns the index of the first occurrence of a specified substring.
8. lastIndexOf(int ch): Returns the index of the last occurrence of a specified character.
9. lastIndexOf(int ch, int fromIndex): Returns the index of the last occurrence of a specified character before the given index.
10. lastIndexOf(String str): Returns the index of the last occurrence of a specified substring.
11. startsWith(String prefix): Checks if the string starts with the specified prefix.
12. endsWith(String suffix): Checks if the string ends with the specified suffix.
13. toLowerCase(): Converts the string to lowercase.
14. toUpperCase(): Converts the string to uppercase.
15. trim(): Removes leading and trailing white spaces.
16. replace(char oldChar, char newChar): Replaces all occurrences of a character with another character.
17. replace(CharSequence target, CharSequence replacement): Replaces all occurrences of a specified CharSequence.
18. contains(CharSequence s): Checks if the string contains the specified sequence of characters.
19. isEmpty(): Checks if the string is empty.
20. valueOf(Object obj): Returns the string representation of an object.
*/
