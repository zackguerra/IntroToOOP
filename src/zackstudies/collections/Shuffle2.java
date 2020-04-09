package zackstudies.collections;

import java.util.HashSet;
import java.util.Set;

public class Shuffle2 {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(74);
        mySet.add(12);
        mySet.add(74);
        mySet.add(7);
        mySet.remove(74);
        mySet.remove(999);
        mySet.add(12);
        mySet.add(999);
        System.out.println(mySet);

    }
}
