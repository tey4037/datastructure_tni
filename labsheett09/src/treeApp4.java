import java.util.Scanner;
public class treeApp4 {
    public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.createTree6();

            System.out.println("--- Tree from createTree6 ---");
            tree.printTree(tree.getRoot(), 0);

            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter N: ");
            int n = sc.nextInt();
            sc.close();

            tree.searchDeleteNode(n);
            node found = tree.getDeleteNode();

            if (found == null) {
                System.out.println("Cannot found Node(data=" + n + ")");
                return;
            }

            if (found.left != null) {
                System.out.println("Left Child of " + n + " = " + found.left.data);
            } else {
                System.out.println("No Left Child");
            }

            if (found.right != null) {
                System.out.println("Right Child of " + n + " = " + found.right.data);
            } else {
                System.out.println("No Right Child");
            }

            if (found.left == null && found.right == null) {
                System.out.println(n + " is Leaf Node");
            } else {
                System.out.println(n + " is not Leaf Node");
            }
    }
}