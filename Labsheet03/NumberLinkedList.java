
public class NumberLinkedList {
	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		
		numbers.insert(0, 37);
		numbers.insert(0, 7);
		numbers.insert(0, 4);
		numbers.insert(0, 16);
		System.out.print("All elemnent = " + numbers.traversal());

        System.out.println();
		numbers.insert(2,20);
		System.out.print("Insert 20 to index = " + numbers.traversal());

        System.out.println();
		numbers.insert(25);
		System.out.print("Append 25 into list = " + numbers.traversal());

        System.out.println();
        numbers.remove(0);
        System.out.print("Delete the first element  = " + numbers.traversal());

        System.out.println();
        numbers.remove(2);
        System.out.print("Delete element index 2 = " + numbers.traversal());

        System.out.println();
        numbers.removeLastElement();
        System.out.print("Delete the last element = " + numbers.traversal());
        System.out.println();

        System.out.println();
        System.out.print("Length of elements in list  = " + numbers.length());

        System.out.println();
        numbers.get(1);
        System.out.print("Element in index 1   = " + numbers.get(1));

        System.out.println();
        numbers.set(1,100);
        System.out.print("Update index 1 to 100  = " + numbers.traversal());

        System.out.println();
        numbers.clear();
        System.out.print("Clear Linked List  = " + numbers.traversal());
	}
}
