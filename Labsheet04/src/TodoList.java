package src;
public class TodoList {
    public static void main(String[] args) {
        DoublyLinkedList todolist = new DoublyLinkedList();

        todolist.insert("Finish Homework");

        todolist.insert("Laungry");
        todolist.insert("Group Meeting");
        System.out.println("To-Do List = " + todolist.traversal());

        todolist.insert(0,"Submit Report");
        System.out.println("To-Do List = " + todolist.traversal());

        todolist.insert(2, "Buy Food");
        System.out.println("To-Do List = " + todolist.traversal());

        todolist.insert("Go to Gym");
        System.out.println("To-Do List = " + todolist.traversal());

        todolist.remove(3);
        todolist.remove(4);
        todolist.remove(0);
        System.out.println("To-Do List = " + todolist.traversal());

        System.out.println();
        System.out.println("Backward Traversal = " + todolist.backwardTraversal());
    }
}