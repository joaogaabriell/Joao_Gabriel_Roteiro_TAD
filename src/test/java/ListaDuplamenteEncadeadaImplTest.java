package org.TAD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListaDuplamenteEncadeadaImplTest {
    private ListaDuplamenteEncadeadaImpl lista;

    @BeforeEach
    public void setUp() {
        lista = new ListaDuplamenteEncadeadaImpl();
    }

    @Test
    public void testAdd() {
        lista.add(1);
        assertEquals(1, lista.size());
        assertTrue(lista.contains(1));
    }

    @Test
    public void testContains() {
        lista.add(2);
        assertTrue(lista.contains(2));
        assertFalse(lista.contains(3));
    }

    @Test
    public void testSize() {
        assertEquals(0, lista.size());
        lista.add(4);
        assertEquals(1, lista.size());
    }
}
