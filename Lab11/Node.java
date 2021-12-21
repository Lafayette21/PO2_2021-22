public class Node<T> {
    public T obj;
    public Node prev;

    Node(T x, Node<T> temp) {
        obj = x;
        prev = temp;
    }

    @Override
    public String toString() {
        return "{" + obj + "}";
    }
}
