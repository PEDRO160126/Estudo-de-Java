//Converta um valor digitado em metros para centímetros e exiba o resultado.

import java.util.Scanner;
public class Conversor{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor em métros:" );
        int valor = leitor.nextInt();

        int converter = valor * 100;

        System.out.println("O valor de" + valor + "em centimetros é de :" + converter);

        leitor.close();
    }
}
