package Calculadora_projeto;

import org.junit.Assert;
import org.junit.Test;

public class CalculosMatemáticosTest {

    public CalculosMatemáticosTest() {
    }

    /**
     * Teste do método somar da classe CalculosMatemáticos.
     */
    @Test
    public void testSomar() {
        System.out.println("somar");
        int num1 = 8;
        int num2 = 7;
        int resultadoEsperado = num1 + num2;
        CalculosMatemáticos instance = new CalculosMatemáticos();
        instance.somar(num1, num2);
        instance.equals(resultadoEsperado);
    }

    /**
     * Teste do método subtracao da classe CalculosMatemáticos.
     */
    @Test
    public void testSubtracao() {
        System.out.println("subtracao");
        int num1 = 4;
        int num2 = 1;
        int resultadoEsperado = num1 - num2;
        CalculosMatemáticos instance = new CalculosMatemáticos();
        instance.subtracao(num1, num2);
        instance.equals(resultadoEsperado);
    }

    /**
     * Teste do método multiplicacao da classe CalculosMatemáticos.
     */
    @Test
    public void testMultiplicacao() {
        System.out.println("multiplicacao");
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = num1 * num2;
        CalculosMatemáticos instance = new CalculosMatemáticos();
        instance.multiplicacao(num1, num2);
        instance.equals(resultadoEsperado);
    }

    /**
     * Teste do método divisao da classe CalculosMatemáticos.
     */
    @Test
    public void testDivisao() {
        System.out.println("divisao");
        float dividendo = 40;
        float divisor = 2;
        float resultadoEsperado = dividendo / divisor;
        CalculosMatemáticos instance = new CalculosMatemáticos();
        instance.divisao(dividendo, divisor);
        instance.equals(resultadoEsperado);
    }

    /**
     * Teste do método raiz da classe CalculosMatemáticos.
     */
    @Test
    public void testRaiz() {
        System.out.println("raiz");
        double num1 = 124;
        double resultadoEsperado = Math.sqrt(num1);
        CalculosMatemáticos instance = new CalculosMatemáticos();
        instance.raiz(num1);
        instance.equals(resultadoEsperado);
    }

    /**
     * Teste do método potencia da classe CalculosMatemáticos.
     */
    @Test
    public void testPotencia() {
        System.out.println("potencia");
        double num1 = 4;
        double num2 = 2;
        double resultadoEsperado = Math.pow(num2, num1);
        CalculosMatemáticos instance = new CalculosMatemáticos();
        instance.potencia(num1, num2);
        instance.equals(resultadoEsperado);
    }

    /**
     * Teste do método media da classe CalculosMatemáticos.
     */
    @Test
    public void testMedia() {
        System.out.println("media");
        int num1 = 35;
        int num2 = 55;
        int num3 = 75;
        int resultadoEsperado = (num1 + num2 + num3) / 3;
        CalculosMatemáticos instance = new CalculosMatemáticos();
        instance.media(num1, num2, num3);
        instance.equals(resultadoEsperado);
    }
}
