import java.util.Scanner;
public class Conversor {
    double emCelsius, emFahreinheit;

    public void converterParaFahreinhet()
    {
        emFahreinheit = 9 / 5 * emCelsius + 32;
    }

    public void escreverResultado()
    {
        System.out.println(emCelsius+"oC = "+emFahreinheit+"oF");
    }

    public void lerCelsius()
    {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus centígrados: ");
        emCelsius = leitor.nextDouble();
    }
}
