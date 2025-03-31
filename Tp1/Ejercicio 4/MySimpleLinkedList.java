
import java.util.Iterator;

public class MySimpleLinkedList<T extends Comparable<T>> implements Iterable<T> {
    private Node<T> first;
    private int size;

    public MySimpleLinkedList() {
        this.first = null;
    }

    public MySimpleLinkedList(Node<T> first) {
        this.first = first;
    }

    public void insertFront(T info) {
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

    public void insertarOrdenado(T info) {
        Node<T> newNode = new Node<>(info, null);

        // Caso 1: Lista vacia o el nuevo nodo es menor que el primero
        if (first == null || info.compareTo(first.getInfo()) == 0) {
            this.insertFront(newNode.getInfo());
        } else {
            Node<T> aux = this.first;
            // si no se quedo sin numeros y el siguiente es < a info
            while (aux.getNext() != null && info.compareTo(aux.getNext().getInfo()) < 0) {
                aux = aux.getNext();
            }
            if (aux.getNext() == null) { // si no hay proximo inserto ultimo al next aux
                aux.setNext(newNode);
            } else { // aux es < info
                // al 4 le seteo el 5 como next, al 3 le seteo como proximo el 4
                newNode.setNext(aux.getNext());
                aux.setNext(newNode);
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return new MyIterator<>(this.first);
    }

    @Override
    public String toString() {
        return "MySimpleLinkedList{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
