package Calculadora.src;
import java.util.Scanner;
public class Calc {

    private static Calculadora minhaCalc;

    public static void main(String[] args) {

        minhaCalc = new Calculadora();
        seletorDeOperacoes();
        minhaCalc.desligar();
    }

    public static void seletorDeOperacoes(){
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        do{
            minhaCalc.ligar();
            System.out.println("Operações");
            System.out.println("0 - Parar e Desligar");
            System.out.println("1 - Digitar Números");
            System.out.println("2 - Somar Números");
            System.out.println("3 - Subtrair Números");
            System.out.println("4 - Multiplicar Números");
            System.out.println("5 - Dividir Números");
            opcao = leitor.nextInt();
            switch(opcao){
                case 1 : minhaCalc.obterNumeros();break;
                case 2 : minhaCalc.somar();
                        minhaCalc.exibirResultado();
                        System.out.println("");
                        break;
                case 3 : minhaCalc.subtrair();
                        minhaCalc.exibirResultado();
                        System.out.println("");
                        break;
                case 4 : minhaCalc.multiplicaçao();
                        minhaCalc.exibirResultado();
                        System.out.println("");
                        break;
                case 5 : minhaCalc.divisao();
                        minhaCalc.exibirResultado();
                        System.out.println("");
                        break;
            }
        }
        while (opcao != 0);
        leitor.close();
    }
}
