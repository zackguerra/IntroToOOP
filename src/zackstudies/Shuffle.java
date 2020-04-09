package zackstudies;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.Queue;

public class Shuffle {
    public static void main(String[] args) {

        Queue<Integer> myQueue = new LinkedList<>();
        for (int i = 1; i <= 6; i++) {
            myQueue.add(i);
        }
        for (int i = 0; i < myQueue.size(); i++) {
            System.out.println(myQueue.poll() + " ");
        }
        System.out.println(myQueue + " size: " + myQueue.size());

    }
}

