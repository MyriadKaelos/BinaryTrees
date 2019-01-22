public class Runner {
    public static void main(String[] args) {
        BinaryTree bt = createBinaryTree();
        bt.delete(8);
        bt.traverseInOrder(bt.root);
        bt.traversePostOrder(bt.root);
        bt.traversePreOrder(bt.root);
        bt.traverseLevelOrder();
        System.out.println(bt.containsNode(10));
        System.out.println(bt.containsNode(9));

    }
    private static BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }

}
