import java.util.Scanner;
public class Circulo {
    // atributos dessa classe:
    double raio, area, comprimento, diametro;

    // métodos da classe:
    public void lerRaio() {
        System.out.print("Digite o valor do raio do círculo: ");
        Scanner leitor = new Scanner(System.in);
        raio = leitor.nextDouble();
    }

    public void calcularArea() {
        area = Math.PI * raio * raio;
    }

    public void calcularComprimento() {
        comprimento = 2 * Math.PI * raio;
    }

    public void calcularDiametro() {
        diametro = 2 * raio;
    }

    public void exibirResultados() {
        System.out.println("Resultados:");
        System.out.println("==========\n");
        System.out.println("Area:        "+area);
        System.out.println("Comprimento: "+comprimento);
        System.out.println("Diâmetro:    "+diametro);
    }
}
