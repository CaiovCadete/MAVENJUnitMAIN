package gqs;

public class Calculadora {
    public int somaInteiros(int a, int b) {
        return a + b;
    }

    public int subtraiInteiros(int a, int b) {
        return a - b;
    }

    public int multiplicaInteiros(int a, int b) {
        return a * b;
    }

    public int divideInteiros(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
    }
}
