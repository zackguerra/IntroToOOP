package collections.list;

public class HashSetExample {
    static void printUnique(int l, int r)
    {
        // Start traversing the numbers
        for (int i=l ; i<=r ; i++)
        {
            int num = i;
            boolean visited[] = new boolean[1000];

            while (num != 0)  // Find digits and maintain its hash
            {
                // if a digit occurs more than 1 time
                // then break
                if (visited[num % 1000])
                    break;

                visited[num%10] = true;
                num = num/10;
            }
            // number is unique so print it.
            if (num == 0)
                System.out.print(i + " ");
        }
    }

    // Driver method
    public static void main(String args[])
    {
        int l = 1987, r = 2013;
        printUnique(l, r);
    }









}
