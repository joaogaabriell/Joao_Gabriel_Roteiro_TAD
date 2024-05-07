package org.TAD;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinhaPilhaTest {

    @Test
    public void testPush() {
        MinhaPilha pilha = new MinhaPilha(5);
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        assertEquals(3, pilha.size());
    }

    @Test
    public void testPop() {
        MinhaPilha pilha = new MinhaPilha(5);
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        assertEquals(3, pilha.pop());
        assertEquals(2, pilha.size());
    }

    @Test
    public void testPopFromEmptyStack() {
        MinhaPilha pilha = new MinhaPilha(5);
        assertThrows(RuntimeException.class, pilha::pop);
    }
}
