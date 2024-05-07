package org.TAD;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinhaPilhaEncadeadaTest {

    @Test
    public void testPush() {
        MinhaPilhaEncadeada pilha = new MinhaPilhaEncadeada();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        assertEquals(3, pilha.size());
    }

    @Test
    public void testPop() {
        MinhaPilhaEncadeada pilha = new MinhaPilhaEncadeada();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        assertEquals(3, pilha.pop());
        assertEquals(2, pilha.size());
    }

    @Test
    public void testPopFromEmptyStack() {
        MinhaPilhaEncadeada pilha = new MinhaPilhaEncadeada();
        assertThrows(RuntimeException.class, pilha::pop);
    }
}
