package Calculadora_projeto;

public class ConversorDeUnidades {
    public void ConverterComprimento(double metros){
        double centimetros = metros*100;
        System.out.println(metros+" metros equivalem a "+centimetros+" centímetros");
    }
    
    public void converterTemperatura(double celcius){
        double fahrenheit = (celcius*1.8) + 32;
        System.out.println(celcius+"C° equivalem a "+fahrenheit+"F°");
        
    }
    
    public void ConverterVolume(double litros){
        double mililitros = litros*1000;
        System.out.println(litros+" litros equivalem a "+mililitros+" mililitros");
    }
    
    public void ConverterMassa(double quilogramas){
        double gramas = quilogramas*1000;
        System.out.println(quilogramas+" quilos equivalem a "+gramas+" gramas"); 
    }
    
    public void ConverterTempo(double minutos){
        double horas = minutos/60;
        System.out.println(minutos+" minutos equivalem a "+horas+" horas");
    }
}
