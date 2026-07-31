import java.util.Stack;

public class StackTest3 {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        stacks.push(10);
        stacks.push(11);
        stacks.push(12);
        System.out.println(stacks);
        while (!stacks.empty()) {
            System.out.println(stacks.pop());
        }
    }
}
