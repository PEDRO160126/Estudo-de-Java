import java.util.Scanner;
public class Calculadora {
    double priNumero,
           segNumero,
           resultado;

    public Calculadora()    // Construtor
    {
        priNumero = segNumero = resultado = 0.0;
    }

    public void ligar() {
        limparVisor();
        System.out.println("Calculadora Ligada!\nDigite os números desejados.");
    }

    public void desligar() {
        limparVisor();
    }

    public void obterNumeros() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o 1º valor: ");
        priNumero = leitor.nextDouble();
        System.out.print("Digite o 2º valor: ");
        segNumero = leitor.nextDouble();
    //    leitor.close();
        leitor = null;
    }

    public void somar() {
        resultado = priNumero + segNumero;
    }

    public void subtrair() {
        resultado = priNumero - segNumero;
    }

    public void multiplicar() {
        resultado = priNumero * segNumero;
    }

    public void dividir() {
        resultado = priNumero / segNumero;
    }

    public void exibirResultado() {
        System.out.println("A operação anterior resultou em :"+resultado);
    }

    public void  limparVisor()
    {
        for (int linha=0; linha < 25; linha++)  // python: for linha in range(0,26,1):
        {
            System.out.println();
        }    
    }
}
