package org.TAD;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinhaFilaTest {

    @Test
    public void testEnqueue() {
        MinhaFila fila = new MinhaFila(5);
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        assertEquals(3, fila.size());
    }

    @Test
    public void testDequeue() {
        MinhaFila fila = new MinhaFila(5);
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        assertEquals(1, fila.dequeue());
        assertEquals(2, fila.size());
    }

    @Test
    public void testDequeueFromEmptyQueue() {
        MinhaFila fila = new MinhaFila(5);
        assertThrows(RuntimeException.class, fila::dequeue);
    }
}
