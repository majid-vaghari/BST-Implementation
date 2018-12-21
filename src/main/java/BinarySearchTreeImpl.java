import java.util.Iterator;

class TreeNode<E extends Comparable<E>> {
    TreeNode<E> left, right;
    E element;
}

public class BinarySearchTreeImpl<E extends Comparable<E>> implements BinarySearchTree<E> {
    private TreeNode root;

    public int size() { return 0; }

    public boolean contains(E e) { return true; }

    public Iterator<E> preOrder() { return null; }

    public void add(E e) { }

    public void remove(E e) { }

    private class TreeNode {
        TreeNode left, right;
        E e;
    }
}