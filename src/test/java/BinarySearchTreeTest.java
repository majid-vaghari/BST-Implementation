import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {
    BinarySearchTree<Integer> bst;

    @Before
    public void init() {
        bst = new BinarySearchTreeImpl<>();
    }

    @Test
    public void testFields() {
        assertEquals(1, bst.getClass().getDeclaredFields().length);
    }

    @Test
    public void testEmptySize() {
        assertEquals(0, bst.size());
    }

    @Test
    public void testContains() {
        bst.add(42);
        assertTrue(bst.contains(42));
    }

    @Test
    public void testAddSize() {
        bst.add(42);
        assertEquals(1, bst.size());
    }

    @Test
    public void testRemove() {
        bst.add(42);
        bst.remove(42);
        assertFalse(bst.contains(42));
    }

    @Test
    public void testRemoveSize() {
        bst.add(42);
        bst.remove(42);
        assertEquals(0, bst.size());
    }

    @Test
    public void testMultipleInput() {
        bst.add(56);
        bst.add(89);
        assertFalse(bst.contains(88));
        bst.add(82);
        bst.add(88);
        assertFalse(bst.contains(33));
        assertTrue(bst.contains(89));
        bst.add(17);
        assertTrue(bst.contains(17));
        bst.add(44);
        assertEquals(6, bst.size());
        bst.add(33);
        bst.add(71);
        assertEquals(8, bst.size());
    }

    @Test
    public void testMultipleInputRemove() {
        bst.remove(73);
        bst.add(22);
        assertTrue(bst.contains(22));
        bst.remove(22);
        assertFalse(bst.contains(22));
        assertEquals(0, bst.size());
        bst.add(71);
        bst.remove(73);
        bst.add(22);
        assertTrue(bst.contains(22));
        bst.remove(22);
        bst.remove(71);
        bst.add(39);
        bst.add(25);
        bst.remove(25);
        bst.remove(59);
        bst.add(51);
        bst.add(31);
        bst.add(55);
        bst.add(93);
        assertEquals(6, bst.size());
    }

    @Test
    public void testInOrder() {
        bst.add(4);
        bst.add(5);
        bst.add(3);
        bst.add(17);
        bst.add(37);
        bst.add(15);
        bst.add(6);
        bst.add(1);
        bst.add(25);
        bst.add(8);
        bst.add(11);
        bst.add(14);
        final Queue<Integer> expecteds = new LinkedList<>(Arrays.asList(4, 3, 1, 5, 17, 15, 6, 8, 11, 14, 37, 25));
        bst.preOrder().forEachRemaining(e -> assertEquals(expecteds.poll(), e));
    }
}
