public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        Tree tree = new Tree(root);
        tree.insert(root, 3);
        tree.insert(root, 2);
        tree.insert(root, 4);
        tree.insert(root, 7);
        tree.insert(root, 6);
        tree.insert(root, 8);
        // System.out.println(tree.getSumTot(root));
        // tree.imprimirNumerosMayoresAK(root, 5);
    }
}
