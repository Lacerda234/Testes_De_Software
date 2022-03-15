package Calculadora_projeto;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        CalculosMatemáticos testador = new CalculosMatemáticos();
        ConversorDeUnidades tester = new ConversorDeUnidades();

        int menu;
        int menuCalculos;
        int menuCalcUnid;
        int Exit = 1;
        int exitCalc = 1;
        int exitcalcUnid = 1;

        do {
            exibirMenu();
            menu = entrada.nextInt();
            switch (menu) {
                case 1:
                    exitCalc = 1;
                    while (exitCalc != 0) {
                        exibirMenuCalculos();
                        menuCalculos = entrada.nextInt();
                        switch (menuCalculos) {
                            case 1:
                                System.out.println("soma");
                                testador.somar(8, 7);
                                break;
                            case 2:
                                System.out.println("subtracao");
                                testador.subtracao(10, 5);
                                break;
                            case 3:
                                System.out.println("divisao");
                                testador.divisao(87, 8);
                                break;
                            case 4:
                                System.out.println("multiplicacao");
                                testador.multiplicacao(10, 2);
                                break;
                            case 5:
                                System.out.println("raizquadrada");
                                testador.raiz(144);
                                break;
                            case 6:
                                System.out.println("potencia");
                                testador.potencia(4, 2);
                                break;
                            case 7:
                                System.out.println("Media");
                                testador.media(35, 55, 75);
                                break;
                            case 8:
                                System.out.println("Retornando ao menu anterior...");
                                exitCalc--;
                                break;
                            default:
                                System.out.println("Opção Inválida! Tente outra");
                                break;
                        }
                    }
                    break;
                case 2:
                    exitcalcUnid = 1;
                    while (exitcalcUnid != 0) {
                        exibirMenuConversorDeUnidades();
                        menuCalcUnid = entrada.nextInt();
                        switch (menuCalcUnid) {
                            case 1:
                                System.out.println("Converter metros em centímetros:");
                                tester.ConverterComprimento(41);
                                break;
                            case 2:
                                System.out.println("Converter graus Celcius em Fahrenheit:");
                                tester.converterTemperatura(48);
                                break;
                            case 3:
                                System.out.println("Converter litros em mililitros:");
                                tester.ConverterVolume(15);
                                break;
                            case 4:
                                System.out.println("Converter quilogramas em gramas:");
                                tester.ConverterMassa(26.3);
                                break;
                            case 5:
                                System.out.println("Converter minutos em horas:");
                                tester.ConverterTempo(2400);
                                break;
                            case 6:
                                System.out.println("Retornando ao menu anterior...");
                                exitcalcUnid--;
                                break;
                            default:
                                System.out.println("Opção Inválida! Tente outra");
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nSaindo do programa...");
                    Exit--;
                    break;
                default:
                    System.out.println("Opção Inválida! Tente outra");
                    break;
            }

        } while (Exit != 0);
    }

    static void exibirMenu() {
        System.out.println("============ Calculadora ============");
        System.out.println("====|1| Calculos Basicos");
        System.out.println("====|2| Conversão de unidades");
        System.out.println("====|3| Sair");
        System.out.println("========================================");
        System.out.print("Escolha uma opção: ");
    }

    static void exibirMenuCalculos() {
        System.out.println("============ Calculos Básicos ============");
        System.out.println("====|1| Soma");
        System.out.println("====|2| Subtracao");
        System.out.println("====|3| Divisao");
        System.out.println("====|4| Multiplicacao");
        System.out.println("====|5| Raiz Quadrada");
        System.out.println("====|6| Potencia");
        System.out.println("====|7| Media");
        System.out.println("====|8| Sair");
        System.out.println("========================================");
        System.out.print("Escolha uma opção: ");
    }

    static void exibirMenuConversorDeUnidades() {
        System.out.println("============ Conversões ============");
        System.out.println("====|1| Converter metros em centímetros");
        System.out.println("====|2| Converter celcius em fahrenheit");
        System.out.println("====|3| Converter litros em mililitros");
        System.out.println("====|4| Converter quilogramas em gramas");
        System.out.println("====|5| Converter minutos em horas");
        System.out.println("====|6| Sair");
        System.out.println("========================================");
        System.out.print("Escolha uma opção: ");
    }
}
