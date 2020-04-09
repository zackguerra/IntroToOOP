package collections.set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // create an empty HashSet
        HashSet<String> food = new HashSet<>();
        food.add("Sushi");
        food.add("Pizza");
        food.add("Hotdog");
        food.add("Taco");
        food.add("Taco");
        food.add("Taco");
        food.add("Feijoada");
        food.add("Feijoada");
        food.add("Feijoada");
        food.add("Coxinha");
        food.add("Sushi");
        food.add("Sushi");
        // duplicates will not be added

        // size
        System.out.println(food.size());
        System.out.println(food);

        HashSet<String> food2 = new HashSet<>();
        food2.add("Ramen");
        food2.add("Poutine");
        food2.add("Ajiaco");
        food2.add("Hamburger");
        food2.add("Sushi");
        food2.add("Taco");

//        food.addAll(food2); // union
//        System.out.println(food);

//        food.retainAll(food2); // intersection
        food.removeAll(food2);
        System.out.println(food);

        // checks if the set has "Sushi"
        if (food.contains("Sushi")) { // O(1)
            System.out.println(true);
        }
    }
}