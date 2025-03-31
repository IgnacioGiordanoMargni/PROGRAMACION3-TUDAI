public class TreeNode {
    private Integer value;
    private TreeNode izq;
    private TreeNode der;

    public TreeNode(Integer value) {
        this.value = value;
        this.izq = null;
        this.der = null;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public TreeNode getIzq() {
        return izq;
    }

    public void setIzq(TreeNode izq) {
        this.izq = izq;
    }

    public TreeNode getDer() {
        return der;
    }

    public void setDer(TreeNode der) {
        this.der = der;
    }
}
