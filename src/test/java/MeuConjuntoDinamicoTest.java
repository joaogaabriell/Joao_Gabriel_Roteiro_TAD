package org.TAD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MeuConjuntoDinamicoTest {
    private MeuConjuntoDinamico conjunto;

    @BeforeEach
    public void setUp() {
        conjunto = new MeuConjuntoDinamico(10);
    }

    @Test
    public void testAdd() {
        conjunto.add(1);
        assertEquals(1, conjunto.size());
        assertTrue(conjunto.contains(1));
    }

    @Test
    public void testContains() {
        conjunto.add(2);
        assertTrue(conjunto.contains(2));
        assertFalse(conjunto.contains(3));
    }

    @Test
    public void testRemove() {
        conjunto.add(3);
        assertTrue(conjunto.contains(3));
        conjunto.remove(3);
        assertFalse(conjunto.contains(3));
    }

    @Test
    public void testSize() {
        assertEquals(0, conjunto.size());
        conjunto.add(4);
        assertEquals(1, conjunto.size());
    }
}
