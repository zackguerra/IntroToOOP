package collections.list;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
//        Queue<String> q = new ArrayDeque<>();
//        Queue<String> pq = new PriorityQueue<>();

        Queue<String> queue = new LinkedList<>(); // most common
        queue.offer("Coke");
        queue.offer("Pepsi");
        queue.offer("Ginger Ale");
        queue.offer("Sprite");
        queue.offer("Fanta");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }


    public static void stutter(Queue<Integer> q) {


    }

    public static void mirror(Queue<String> q) {

    }
}