import java.util.ArrayDeque;
import java.util.Queue;

public class LabQueue01 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        for (int number = 101; number <= 105; number++) {
            q.add(number);
            System.out.println("Enqueue: " + number);
        }

        System.out.println("Queue => " + q);
        System.out.println();

        while (!q.isEmpty()) {
            int calling = q.peek();
            System.out.println("Calling number: " + calling);

            int serving = q.poll();

            System.out.println("Providing service number: " + serving);
            System.out.println();
        }

        System.out.println("Queue => " + q);

    }
}

