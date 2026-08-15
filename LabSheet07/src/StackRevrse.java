import java.util.ArrayDeque;
import java.util.Deque;

public class StackRevrse {
    public static String reverseCharacter(String text) {
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String txt = "Hello World";

        System.out.println("Original => " + txt);

        String reverse = reverseCharacter(txt);

        System.out.println("Reverse  => " + reverse);
    }
}