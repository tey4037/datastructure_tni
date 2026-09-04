import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

public class TraversePostorder {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree3();    // Try to test with createTree2() and createTree3()
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("Postorder = " + traversal(tree.getRoot()));
	}

	public static ArrayList<Integer> traversal(node Node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Deque<node> stack = new ArrayDeque<node>();
		Queue<Integer> queue = new ArrayDeque<Integer>();
		
		stack.push(Node);
		while(!stack.isEmpty()) {
			node current_node = stack.pop();
			queue.add(current_node.data);
			if(current_node.left != null) {
				stack.push(current_node.left);
			}
			if (current_node.right != null) {
				stack.push(current_node.right);
			}
			list.addFirst(current_node.data);
		}
	
		return list;
	}
}