package org.TAD;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinhaFilaEncadeadaTest {

    @Test
    public void testEnqueue() {
        MinhaFilaEncadeada fila = new MinhaFilaEncadeada();
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        assertEquals(3, fila.size());
    }

    @Test
    public void testDequeue() {
        MinhaFilaEncadeada fila = new MinhaFilaEncadeada();
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        assertEquals(1, fila.dequeue());
        assertEquals(2, fila.size());
    }

    @Test
    public void testDequeueFromEmptyQueue() {
        MinhaFilaEncadeada fila = new MinhaFilaEncadeada();
        assertThrows(RuntimeException.class, fila::dequeue);
    }
}
