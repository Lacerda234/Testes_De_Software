package Calculadora_projeto;

public class CalculosMatemáticos {
    
    public void somar(int num1, int num2){
        int soma = num1+num2;
        System.out.println("O resultado da soma é: "+num1+" + "+num2+" = "+soma);
    }
    
    public void subtracao(int num1, int num2){
        int sub = num1-num2;
        System.out.println("O resultado da subtração é: "+num1+" - "+num2+" = "+sub);
    }
    
    public void multiplicacao(int num1, int num2){
        int mult = num1*num2;
        System.out.println("O resultado da multiplicação é: "+num1+" * "+num2+" = "+mult);
    }
    
    public void divisao(float dividendo, float divisor){
        if(divisor==0){
            System.out.println("Não é possivel divisões por zero");
        }
        float div = dividendo/divisor;
        System.out.println("O resultado da divisão é: "+dividendo+" / "+divisor+" = "+div);
    }
    
    public void raiz(double num1){
        double raizq = Math.sqrt(num1);
        System.out.println("O resultado da raiz quadrada de "+num1+" é: "+raizq);
    }
    
    public void potencia(double num1, double num2){
        double poten = Math.pow(num1, num2);
        System.out.println("O resultado da potência de "+num1+"^"+num2+" é: "+poten);
    }
    
    public void media(int num1, int num2, int num3){
        int soma = num1+num2+num3;
        float media = soma/3;
        System.out.println("O resultado da média dos números é: "+num1+" + "+num2+" + "+num3+" = "+media);
    }
}
