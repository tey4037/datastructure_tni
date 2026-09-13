public class treeApp3 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createTree5();

        System.out.println("-----------------------------------------");
        System.out.println("Binary Tree from createtree5()");
        System.out.println("-----------------------------------------");
        tree.printTree(tree.getRoot(), 0);

        System.out.println("-----------------------------------------");
        System.out.println("Delete Leaf Node 25()");
        System.out.println("-----------------------------------------");
        tree.delete(25);
        tree.printTree(tree.getRoot(), 0);

        System.out.println("-----------------------------------------");
        System.out.println("Delete Node with 1 Child 40");
        System.out.println("-----------------------------------------");
        tree.delete(40);
        tree.printTree(tree.getRoot(), 0);

        System.out.println("-----------------------------------------");
        System.out.println("Delete Node with 2 Children 60");
        System.out.println("-----------------------------------------");

        tree.delete(60);
        tree.printTree(tree.getRoot(), 0);
    }
}