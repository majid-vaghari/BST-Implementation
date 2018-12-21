import java.util.Iterator;

public interface BinarySearchTree<E extends Comparable<E>> {
    /**
     * Returns the number of elements in this collection.  If this collection
     * contains more than {@code Integer.MAX_VALUE} elements, returns
     * {@code Integer.MAX_VALUE}.
     *
     * @return the number of elements in this collection
     */
    int size();

    boolean contains(E e);

    /**
     * Returns an iterator over the elements in this collection. The
     * order of elements is
     * <a href="https://en.wikipedia.org/wiki/Tree_traversal#Pre-order_(NLR)">pre-order traversal</a>.
     *
     * @return an {@code Iterator} over the elements in this collection
     */
    Iterator<E> preOrder();

    void add(E e);

    void remove(E e);
}
