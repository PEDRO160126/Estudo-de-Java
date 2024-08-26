//Peça o raio de um círculo, calcule e mostre sua área.

import java.util.Scanner;
public class ex4{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do raio do circulo: ");
        int raio = leitor.nextInt();

        double area = 3.14 * (raio * raio);

        System.out.println("A área do circulo é:" + area);

        leitor.close();
    }
}
