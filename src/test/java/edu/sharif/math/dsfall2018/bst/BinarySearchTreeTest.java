package edu.sharif.math.dsfall2018.bst;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {
    BinarySearchTree<Integer> bst;

    @Before
    void init() {
        bst = new BinarySearchTreeImpl<>();
    }

    @Test
    void testSize() {
        assertEquals(0, bst.size());
    }
}
