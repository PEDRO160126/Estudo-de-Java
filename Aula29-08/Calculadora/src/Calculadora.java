package Calculadora.src;
import java.util.Scanner;
public class Calculadora {
    double priNumero = 0.0,
           segNumero = 0.0,
           resultado = 0.0;

    public Calculadora(){   //Construtor
        priNumero = segNumero = resultado = 0.0;
    }

    public void ligar() { //método ligar
        limparVisor();
        System.out.println("Calculadora Ligada!\nDigite os números desejados.");
    }

    public void desligar() { //método desligar
        limparVisor();
    }

    public void obterNumeros() { //método obter Numeros
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o 1º valor: ");
        priNumero = leitor.nextDouble();
        System.out.print("Digite o 2º valor: ");
        segNumero = leitor.nextDouble();
    }

    public void somar() { //método somar
        resultado = priNumero + segNumero;
    }

    public void subtrair(){ //método subtrair
        resultado = priNumero - segNumero;
    }

    public void multiplicaçao(){ //Método multiplicação
        resultado = priNumero * segNumero;
    }

    public void divisao(){ //método divisão
        resultado = priNumero / segNumero;
    }

    public void exibirResultado() //método exibir resultado
    {
        System.out.println("O resultado da operação matemática é :" + resultado);
    }

    public void  limparVisor() //método limpar visor 
    {
        for (int linha=0; linha < 25; linha++); //for linha in range(0,26,1) em python
    }
}
