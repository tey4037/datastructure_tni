public class TrainLinklist {
    public static void main(String[] args){
        LinkedList greenline = new LinkedList();
        greenline.insert(0, "Mo-Chit");
        greenline.insert(1, "Ari");
        greenline.insert(2, "Sanam-pao");
        System.out.print("All Stations : " + greenline.traversal());

        System.out.println();
        greenline.insert(2,"Rachakru");
        System.out.print("All Stations :" + greenline.traversal());

        System.out.println();
        System.out.print("Total Stations : " + greenline.length());

        System.out.println();
        System.out.print("Frist Stations : " + greenline.get(0));

        System.out.println();
        greenline.set(0,"Mo-Chit (Central Lardprao)");
        System.out.print("All Stations : " + greenline.traversal());

        System.out.println();
        greenline.remove(2);
        System.out.print("All Stations : " + greenline.traversal());

        System.out.println();
        greenline.removeLastElement();
        System.out.print("All Stations : " + greenline.traversal());

        System.out.println();
        greenline.clear();
        System.out.print("Total Stations : " + greenline.length());

        System.out.println();
        System.out.print("Total Stations : " + greenline.traversal());
    }
}
