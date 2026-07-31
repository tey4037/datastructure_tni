import java.util.Stack;

public class LabStack02 {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        System.out.println("Push in track : " + stacks.push(1));
        System.out.println("Push in track : " + stacks.push(2));
        System.out.println("Push in track : " + stacks.push(3));
        System.out.println("Push in track : " + stacks.push(4));
        System.out.println("Push in track : " + stacks.push(5));
        System.out.println("Train car after into dead-end track : " + stacks);

        System.out.println();
        while (!stacks.empty()) {
            System.out.println("Pop from track : "+stacks.pop());
        }
        System.out.println("Train car after out of dead-end track : " + stacks);
    }
}
