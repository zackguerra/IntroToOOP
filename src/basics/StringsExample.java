package basics;

import java.sql.SQLOutput;

public class StringsExample {
    public static void main(String[] args) {
        // String - a sequence of characters ""
        // (Reference type)
        // 1. String literal
        // (data segment - read only)
        String name = "Derrick";
        String name1 = "Derrick";
        // (heap segment - dynamically allocate memory)
        String name2 = new String("Derrick");

        System.out.println(name == name1); // true
        System.out.println(name == name2); // true

        // compares contents
        System.out.println(name.equals(name));
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name2));

        // Get the lenght of String
        String coffee = "Starbucks";
        System.out.println(coffee.length());

        // Get the substring
        // In python coffee[0:2] --> "St"
        System.out.println(coffee.substring(0, 4));

        // Get the index of String
        System.out.println(coffee.indexOf("Bucks"));

        // String with for-loop (print every char)
        for (int i = 0; i < coffee.length(); i++) {
            // 'char' (primitive)
            System.out.println(coffee.charAt(i));
            // 'Strint'
            System.out.println(coffee.substring(i, i + 1));
        }

        // Converting String to char array
        char[] chars = coffee.toCharArray();
        for (char ch : coffee.toCharArray()) {
            System.out.println(ch);
        }


    }

}
