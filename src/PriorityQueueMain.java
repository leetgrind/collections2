import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMain {

    public static void main(String[] args) {

        stringQueue();
    }

    public static void stringQueue() {
        PriorityQueue<String> queue = new PriorityQueue<>((s1, s2) -> s1.length() - s2.length());

        queue.add("Zlice2423432");
        queue.add("Caratsdasdf");
        queue.add("Bobsadf ");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

}
