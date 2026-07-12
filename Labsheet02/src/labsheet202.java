import java.util.ArrayList;
public class labsheet202 {

	public static void main(String[] args) {
		int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i=0; i<initial_numbers.length; i++) {
			numbers.add(initial_numbers[i]);
		}
		numbers.add(20);
        numbers.add(9, 135);
		numbers.remove(7);
		numbers.set(0, 10);
		System.out.println("Final numbers = " + numbers);
        System.out.println("Size of ArrayList = " + numbers.size());
	}

}
