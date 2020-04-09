package zackstudies;

import java.util.Random;

public class RandomWord {

    public RandomWord(String[] wordArray) {
    }

    public static void main(String[] args) {

        String[] words = new String[]{"French Fries", "Eggs", "Pizza", "Lasagna", "Pasta", "Snacks"};

        Random r = new Random();
        int food = r.nextInt(words.length);

        System.out.println(
                "Something to Eat: " + words[food]);


    }
}
