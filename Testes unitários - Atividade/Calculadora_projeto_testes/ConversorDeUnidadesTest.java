package Calculadora_projeto;

import org.junit.Test;

public class ConversorDeUnidadesTest {

    public ConversorDeUnidadesTest() {
    }

    /**
     * Teste do método ConverterComprimento da classe ConversorDeUnidades.
     */
    @Test
    public void testConverterComprimento() {
        System.out.println("ConverterComprimento");
        double metros = 41;
        double resultadoEsperado = 41000;
        ConversorDeUnidades instance = new ConversorDeUnidades();
        instance.ConverterComprimento(metros);
        instance.equals(resultadoEsperado);
    }

    /**
     * Teste do método converterTemperatura da classe ConversorDeUnidades.
     */
    @Test
    public void testConverterTemperatura() {
        System.out.println("converterTemperatura");
        double celcius = 48;
        double resultadoEsperado = 118.4;
        ConversorDeUnidades instance = new ConversorDeUnidades();
        instance.converterTemperatura(celcius);
        instance.equals(resultadoEsperado);
    }

    /**
     * Teste do método ConverterVolume da classe ConversorDeUnidades.
     */
    @Test
    public void testConverterVolume() {
        System.out.println("ConverterVolume");
        double litros = 15;
        double resultadoEsperado = 15000;
        ConversorDeUnidades instance = new ConversorDeUnidades();
        instance.ConverterVolume(litros);
        instance.equals(resultadoEsperado);
    }

    /**
     * Teste do método ConverterMassa da classe ConversorDeUnidades.
     */
    @Test
    public void testConverterMassa() {
        System.out.println("ConverterMassa");
        double quilogramas = 26.3;
        double resultadoEsperado = 26300;
        ConversorDeUnidades instance = new ConversorDeUnidades();
        instance.ConverterMassa(quilogramas);
        instance.equals(resultadoEsperado);
    }

    /**
     * Teste do método ConverterTempo da classe ConversorDeUnidades.
     */
    @Test
    public void testConverterTempo() {
        System.out.println("ConverterTempo");
        double minutos = 2400;
        double resultadoEsperado = 40;
        ConversorDeUnidades instance = new ConversorDeUnidades();
        instance.ConverterTempo(minutos);
        instance.equals(resultadoEsperado);
    }
}
