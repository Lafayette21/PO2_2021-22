import java.util.*;

public class Stos<T> {
    private T obj;
    Node<T> head;

    public Stos() {
        head = null;
    }

    public void push(T x) {
        head = new Node<T>(x, head);
    }

    public void pop() {
        T val = head.obj;
        head = head.prev;
    }

    @Override
    public String toString() {
        var help = new StringBuilder();
        Node<T> cursor = head;
        while (cursor != null) {
            help.append(cursor.toString() + " ");
            cursor = cursor.prev;
        }
        return help.toString();
    }
}