package Ejercicio1;

public class NySimpleLinkedList<T> {
    private Node<T> first;
    private int size;

    public NySimpleLinkedList() {
        this.first = null;
    }

    public NySimpleLinkedList(Node<T> first) {
        this.first = first;
    }

    public void insertFrotn(T info) {
        Node<T> tmp = new Node<T>(info, null);
        tmp.setNext(this.first);
        this.first = tmp;
    }

    public T extractFront() {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public T get(int index) {
        return null;
    }

    public int size() {
        return 0;
    }

    public int indexIf(T info) {
        Node<T> first = this.first;
        for (int i = 0; i < this.size; i++) {
            if (first.getInfo().equals(info)) {
                return i;
            }
            first = first.getNext();
        }
        return -1;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return " ";
    }

}
