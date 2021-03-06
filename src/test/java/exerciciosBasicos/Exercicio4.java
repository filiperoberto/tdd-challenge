package exerciciosBasicos;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio4 {

    /**
     * Exercício 4
     *
     * Antecessor e sucessor de um número qualquer
     */

    @Ignore
    @Test
    public void antecessorESucessorDeTres() {

        assertEquals(2,antecessor(3));
        assertEquals(4,sucessor(3));
    }

    @Ignore
    @Test
    public void antecessorESucessorDeQuatro() {

        assertEquals(3,antecessor(4));
        assertEquals(5,sucessor(4));
    }

    @Ignore
    @Test
    public void antecessorESucessorDeVinte() {

        assertEquals(19,antecessor(20));
        assertEquals(21,sucessor(20));
    }

    private int antecessor(int numero) {

        // Escreva sua lógica abaixo


        return 0;
    }

    private int sucessor(int numero) {

        // Escreva sua lógica abaixo


        return 0;
    }

}
