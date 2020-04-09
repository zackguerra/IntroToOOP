package zackstudies.finalexam;

import java.util.*;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

public class Part3 {
    /**
     * Returns true if the integers in the digits ArrayList are in strictly non-decreasing order.
     * false otherwise.
     * <p>
     * Examples)
     * isStrictlyNonDecreasing([7]) -> true
     * isStrictlyNonDecreasing([1, 3, 4, 5]) -> true
     * isStrictlyNonDecreasing([1, 2, 2, 5]) -> true
     * isStrictlyNonDecreasing([3, 2, 2, 5, 6]) -> false
     * isStrictlyNonDecreasing([1, 2, 6, 5, 8]) -> false
     */
    public static boolean isStrictlyNonDecreasing(ArrayList<Integer> digits) {

        boolean nondecreasing = true, descending = false;

        for (int i = 1; i < digits.size() && (nondecreasing || descending); i++) {
            nondecreasing = nondecreasing && digits.get(i) >= digits.get(i - 1);

            descending = descending && digits.get(i) <= digits.get(i - 1);
        }
        return nondecreasing;
    }

    /**
     * Prints the elements in the given country HashMap.
     * (Order does not matter)
     *
     * Examples)
     * printMapElements({"AB": "Edmonton", "BC": "Victoria"})
     * prints -> "AB: Edmonton, BC: Victoria, "
     *
     * printMapElements({"NY": "Albany", "CA": "Sacramento"})
     * prints -> "NY: Albany, CA: Sacramento, "
     * @param country
     */
    public static void printMapElements(HashMap<String, String> country) {
        Iterator<String> key = country.keySet().iterator();
        String keyvalue = country.get(country.keySet().iterator());

        while (key.hasNext()) {
            System.out.println(key.next() + ": " + keyvalue);
        }

    }

    /**
     * Test cases
     */
    public static void main(String[] args) {
        // isStrictlyNonDecreasing
        ArrayList<Integer> input1 = new ArrayList<>(Arrays.asList(7));
        System.out.println(isStrictlyNonDecreasing(input1));

        ArrayList<Integer> input2 = new ArrayList<>(Arrays.asList(1, 3, 4, 5));
        System.out.println(isStrictlyNonDecreasing(input2));

        ArrayList<Integer> input3 = new ArrayList<>(Arrays.asList(1, 2, 2, 5));
        System.out.println(isStrictlyNonDecreasing(input3));

        ArrayList<Integer> input4 = new ArrayList<>(Arrays.asList(3, 2, 2, 5, 6));
        System.out.println(isStrictlyNonDecreasing(input4));

        ArrayList<Integer> input5 = new ArrayList<>(Arrays.asList(1, 2, 6, 5, 8));
        System.out.println(isStrictlyNonDecreasing(input5));

        // printMapElements
        HashMap<String, String> canada = new HashMap<>();
        canada.put("AB", "Edmonton");
        canada.put("BC", "Victoria");
        printMapElements(canada);
        System.out.println();

        HashMap<String, String> usa = new HashMap<>();
        usa.put("NY", "Albany");
        usa.put("CA", "Sacramento");
        printMapElements(usa);
    }
}