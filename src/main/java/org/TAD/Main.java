package org.TAD;

public class Main {
    public static void main(String[] args) {
        // Teste Conjunto dinamico
        MeuConjuntoDinamico conjuntoDinamico = new MeuConjuntoDinamico(10);
        conjuntoDinamico.add(1);
        System.out.println(conjuntoDinamico.contains(1));  // imprime true

        // Teste Conjunto dinamico encadeado
        MeuConjuntoDinamicoEncadeado conjuntoDinamicoEncadeado = new MeuConjuntoDinamicoEncadeado();
        conjuntoDinamicoEncadeado.add(2);
        System.out.println(conjuntoDinamicoEncadeado.contains(2));  // imprime true

        // Teste Minha Fila
        MinhaFila fila = new MinhaFila(10);
        fila.enqueue(3);
        System.out.println(fila.dequeue());  // imprime3

        // Teste Minha Fila Encadeada
        MinhaFilaEncadeada filaEncadeada = new MinhaFilaEncadeada();
        filaEncadeada.enqueue(4);
        System.out.println(filaEncadeada.dequeue());  // imprime 4

        // Teste Lista Encadeada Impl
        ListaEncadeadaImpl listaEncadeada = new ListaEncadeadaImpl();
        listaEncadeada.add(5);
        System.out.println(listaEncadeada.contains(5));  // imprime true

        // Teste Lista Duplamente Encadeada Impl
        ListaDuplamenteEncadeadaImpl listaDuplamenteEncadeada = new ListaDuplamenteEncadeadaImpl();
        listaDuplamenteEncadeada.add(6);
        System.out.println(listaDuplamenteEncadeada.contains(6));  // imprime true

        // Teste Minha Pilha
        MinhaPilha pilha = new MinhaPilha(10);
        pilha.push(7);
        System.out.println(pilha.pop());  // imprime 7

        // Teste Minha Pilha Encadeada
        MinhaPilhaEncadeada pilhaEncadeada = new MinhaPilhaEncadeada();
        pilhaEncadeada.push(8);
        System.out.println(pilhaEncadeada.pop());  // imprime 8
    }
}
