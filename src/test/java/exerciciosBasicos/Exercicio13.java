package exerciciosBasicos;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio13 {

    /**
     * Exercício 13
     *
     * Maior que 10
     *
     * Crie uma função que descubra se um valor é maior ou menor que 10.
     *
     */
    @Ignore
    @Test
    public void verificaSeDoisEhMaiorQueDez() {

        assertFalse(ehMaiorQueDez(2));
    }

    @Ignore
    @Test
    public void verificaSeTrinteEhMaiorQueDez() {

        assertTrue(ehMaiorQueDez(30));
    }

    @Ignore
    @Test
    public void verificaSeDozeEhMaiorQueDez() {

        assertTrue(ehMaiorQueDez(12));
    }

    @Ignore
    @Test
    public void verificaSeDezEhMaiorQueDez() {

        assertFalse(ehMaiorQueDez(10));
    }

    private boolean ehMaiorQueDez(int numero) {

        // Escreva sua lógica abaixo

        return false;
    }

}
