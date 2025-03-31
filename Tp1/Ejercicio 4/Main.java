import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MySimpleLinkedList<Integer> l1 = new MySimpleLinkedList<>();
        l1.insertFront(5);
        l1.insertFront(4);
        l1.insertFront(3);
        l1.insertFront(2);
        l1.insertFront(1);
        System.out.println("l1: " + l1);

        MySimpleLinkedList<Integer> l2 = new MySimpleLinkedList<>();
        l2.insertFront(8);
        l2.insertFront(3);
        l2.insertFront(9);
        l2.insertFront(1);
        l2.insertFront(4);
        System.out.println("l2: " + l2);

        // ej5ConIterable

        // listas ordenadas

    }

    public static MySimpleLinkedList<Integer> ElementosComunes(MySimpleLinkedList<Integer> l1,
            MySimpleLinkedList<Integer> l2) {
        Iterator<Integer> i1 = l1.iterator();
        Iterator<Integer> i2 = l2.iterator();
        // Listas desordenadas
        MySimpleLinkedList<Integer> listadesordenada = new MySimpleLinkedList<Integer>();
        while (i1.hasNext()) {
            Integer value = i1.next();
            while (i2.hasNext()) {
                Integer value2 = i2.next();
                if (value.equals(value2)) {
                    listadesordenada.insertFront(value2);
                }
            }
        }
        return listadesordenada;
    }

    public static MySimpleLinkedList<Integer> ElementosComunesOrdenadas(MySimpleLinkedList<Integer> l1,
            MySimpleLinkedList<Integer> l2) {
        MySimpleLinkedList<Integer> l = new MySimpleLinkedList<Integer>();
        Iterator<Integer> i1 = l1.iterator();
        Iterator<Integer> i2 = l2.iterator();
        Integer value = i1.next();
        Integer value2 = i2.next();
        while (i1.hasNext() && i2.hasNext()) {
            if (value.equals(value2)) {
                l.insertFront(value2);
                i1.next();
                i2.next();
            } else if (value < value2) {
                i1.next();
            } else if (value > value2) {
                i2.next();
            }
        }
        return l;
    }
}