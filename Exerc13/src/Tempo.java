import java.util.Scanner;
public class Tempo {
    int dias, horas, minutos, segundos,
    totalSegundos;
    public void lerDados()
    {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a quantidade de dias    : ");
        dias = leitor.nextInt();
        System.out.print("Digite a quantidade de horas   : ");
        horas = leitor.nextInt();
        System.out.print("Digite a quantidade de minutos : ");
        minutos = leitor.nextInt();
        System.out.print("Digite a quantidade de segundos: ");
        segundos = leitor.nextInt();
    }

    public void converterParaSegundos()
    {
       totalSegundos = dias * 86400 + horas * 3600 + minutos * 60 + segundos;
    }

    public void exibirResultados()
    {
        System.out.println("Esses dados correspondem a :"+totalSegundos+ "segundos.");
    }
}
