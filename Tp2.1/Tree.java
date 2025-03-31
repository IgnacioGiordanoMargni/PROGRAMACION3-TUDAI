import java.util.ArrayList;

public class Tree {
    private TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
    // consigna 1

    public Integer getRoot() {
        return root.getValue();
    }

    public boolean hasElem(Integer v, TreeNode actual) {
        if (actual.getValue() == v) { // complejidad O(n)
            return true;
        } else {
            if (v > actual.getValue()) {
                if (actual.getDer() != null) {
                    return hasElem(v, actual.getDer());
                } else {
                    return false;
                }
            } else {
                if (actual.getIzq() != null) {
                    return hasElem(v, actual.getIzq());
                } else {
                    return false;
                }
            }
        }
    }

    public boolean isEmpty(TreeNode actual) {
        if (actual.getDer() != null || actual.getDer() != null) { // complejidad O(A), constante
            return false;
        } else {
            return false;
        }
    }

    public void insert(TreeNode n, Integer v) {
        if (n.getValue() != null) {
            if (n.getValue() > v) {
                if (n.getIzq() == null) {
                    n.setIzq(new TreeNode(v));
                } else {
                    this.insert(n.getIzq(), v);
                }
            } else if (n.getValue() < v) {
                if (n.getDer() != null) {
                    this.insert(n.getDer(), v);
                } else {
                    n.setDer(new TreeNode(v));
                }
            }
        }

    }

    public int getHeight() { // hago este metodo para poder llamarlo sin pasar el nodo raiz como parametro
        return this.getHeight(this.root);
    }

    public int getHeight(TreeNode n) {
        int value1 = 0;
        int value2 = 0;

        if (n.getIzq() != null) {
            value1 = 1 + this.getHeight(n.getIzq());
        } else if (n.getDer() != null) {
            value2 = 1 + this.getHeight(n.getDer());
        }

        if (value1 > value2) {
            return value1;
        } else {
            return value2;
        }
    };

    public void ImprimiPostOrder() {
        this.ImprimiPostOrder(this.root);
    }

    public void ImprimiPostOrder(TreeNode actual) {
        if (actual == null) {
            return;
        }
        if (actual.getIzq() != null) {
            this.ImprimiPostOrder(actual.getIzq());
        } else {
            System.out.println("-");
        }
        if (actual.getDer() != null) {
            this.ImprimiPostOrder(actual.getDer());
        } else {
            System.out.println("-");
        }
        System.out.println(actual.getValue() + " ");

    }

    public void ImprimirPreOrder() {
        this.ImprimirPreOrder(this.root);
    }

    private void ImprimirPreOrder(TreeNode root2) {
        if (root2 == null) {
            return;
        }
        System.out.println(root2.getValue() + " ");
        if (root2.getIzq() != null) {
            this.ImprimirPreOrder(root2.getIzq());
        } else {
            System.out.println("-");
        }
        if (root2.getDer() != null) {
            this.ImprimirPreOrder(root2.getDer());
        }
    }

    public void ImprimirOrder() {
        this.ImprimirOrder(this.root);
    }

    public void ImprimirOrder(TreeNode root2) {
        if (root2 == null) {
            return;
        }
        if (root2.getIzq() != null) {
            this.ImprimirOrder(root2.getIzq());
        } else {
            System.out.println("-");
        }
        System.out.println(root2.getValue() + " ");
        if (root2.getDer() != null) {
            this.ImprimirOrder(root2.getDer());
        } else {
            System.out.println("-");

        }
    }

    public ArrayList<Integer> getFrontera() {
        return this.getFrontera(this.root);
    }

    public ArrayList<Integer> getFrontera(TreeNode nodo) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (nodo != null) {
            if (nodo.getIzq() != null) {
                list.addAll(this.getFrontera(nodo.getIzq()));
            } else if (nodo.getDer() != null) {
                list.addAll(this.getFrontera(nodo.getDer()));
            } else {
                list.add(nodo.getValue());
                return list;
            }
        } else {
            return list;
        }
        return list;
    }

    public Integer getMaxElement(TreeNode nodo) {
        int valueIzq = 0;
        int valueDer = 0;
        int valueActual = 0;
        if (nodo != null) {
            if (nodo.getIzq() != null) {
                valueIzq = this.getMaxElement(nodo.getIzq());
            } else if (nodo.getDer() != null) {
                valueDer = this.getMaxElement(nodo.getDer());
            }
            if (valueDer < valueActual && valueIzq < valueActual) {
                return valueActual;
            } else if (valueDer < valueIzq && valueActual < valueIzq) {
                return valueIzq;
            } else {
                return valueDer;
            }
        } else {
            return null;
        }
    }
    // el getelemAtLevel y el delete lo dejo para despues
    // public ArrayList<Integer> getElemAtLevel() {
    // return this.getElemAtLevel(this.root, 0);
    // }

    // public ArrayList<Integer> getElemAtLevel(TreeNode nodo, Integer lvl) {
    // ArrayList<Integer> list = new ArrayList<Integer>();
    // Integer nivelActual=0;

    // }
    // ejercicio 2
    public int getSumTot(TreeNode nodo) {
        int value = nodo.getValue();
        if (nodo.getDer() != null) {
            value += this.getSumTot(nodo.getDer());
        }
        if (nodo.getIzq() != null) {
            value += this.getSumTot(nodo.getIzq());
        }
        return value;
    }

}
