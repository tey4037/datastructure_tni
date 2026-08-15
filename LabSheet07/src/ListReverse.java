import java.util.ArrayList;

public class ListReverse {

    public static ArrayList<Integer> reverseList(ArrayList<Integer> arr) {

        ArrayList<Integer> reversed = new ArrayList<Integer>();

        for (int i = arr.size() - 1; i >= 0; i--) {
            reversed.add(arr.get(i));
        }


        return reversed;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 11; i <= 20; i++) {
            arr.add(i);
        }

        System.out.println("Original Sequence: " + arr);

        ArrayList<Integer> reverse = reverseList(arr);

        System.out.println("Reverse  Sequence: " + reverse);
    }

}