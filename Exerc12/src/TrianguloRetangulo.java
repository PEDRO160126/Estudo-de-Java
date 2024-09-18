import java.util.Scanner;
public class TrianguloRetangulo {
    double cateto1 = 0, cateto2 = 0;
    Scanner leitor = new Scanner(System.in);

    public void lerCateto1()
    {
        System.out.print("Digite a medida do primeiro cateto: ");
        cateto1 = leitor.nextDouble();
    }

    public void lerCateto2()
    {
        System.out.print("Digite a medida do segundo cateto: ");
        cateto2 = leitor.nextDouble();
    }

    public double hipotenusa()
    {
        double hipo = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
        return hipo;
    }
}
