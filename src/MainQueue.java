import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Alice");
        // queue.offer("Chris");
        // queue.offer("Pete");

        String result = queue.poll();

        System.out.println(result);
    }
}
