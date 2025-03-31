
import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private Node<T> actual;

    public MyIterator(Node<T> actual) {
        this.actual = actual;
    }
     

    public T get(){
        return actual.getInfo();
    }
    @Override
    public boolean hasNext() {
        return actual.getNext() != null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        T dato = actual.getInfo();
        actual = actual.getNext();
        return dato;
    }

}
