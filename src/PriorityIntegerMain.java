import java.util.PriorityQueue;

public class PriorityIntegerMain {

    public static void main(String[] args) {

        PriorityQueue<PriorityInteger> pq = new PriorityQueue<>();

        pq.add(new PriorityInteger(100,101));
        pq.add(new PriorityInteger(2, 102));
        pq.add(new PriorityInteger(10, 103));

        System.out.println(pq);

    }
}
