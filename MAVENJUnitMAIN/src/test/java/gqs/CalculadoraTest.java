package gqs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    void testDoisSomaDoisEsperaQuatro() {
        Calculadora c = new Calculadora();
        assertEquals(4, c.somaInteiros(2, 2));
    }

    @Test
    void testTresSomaSeteEsperaDez() {
        Calculadora c = new Calculadora();
        assertTrue(c.somaInteiros(3, 7) == 10);
    }

    @Test
    void testCincoSubtraiTresEsperaDois() {
        Calculadora c = new Calculadora();
        assertEquals(2, c.subtraiInteiros(5, 3));
    }

    @Test
    void testQuatroMultiplicaDoisEsperaOito() {
        Calculadora c = new Calculadora();
        assertEquals(8, c.multiplicaInteiros(4, 2));
    }

    @Test
    void testOitoDivideQuatroEsperaDois() {
        Calculadora c = new Calculadora();
        assertEquals(2, c.divideInteiros(8, 4));
    }

    @Test
    void testDivisaoPorZeroDeveLancarExcecao() {
        Calculadora c = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> c.divideInteiros(10, 0));
    }
}
