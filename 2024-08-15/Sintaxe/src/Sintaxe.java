import java.util.Scanner;
public class Sintaxe {
    public static void main(String[] args) {
        String resposta = "S";
        do {
            Scanner leitor = new Scanner(System.in);
            System.out.print("Digite um número inteiro:");
            int numero = leitor.nextInt();
            if (numero % 2 == 0) {
                System.out.println(numero + " é par.");
                if (numero == 2)
                    System.out.println("É primo!");
            } else {
                System.out.println(numero + " é ímpar.");
                System.out.println("Ímpares são legais.");
                int resto = 1;
                int divisor = 3;
                while (resto != 0 && divisor <= Math.sqrt(numero)) {
                    resto = numero % divisor;
                    divisor += 2;
                }
                if (resto != 0)
                    System.out.println(numero + " é primo!");
            }
            System.out.print("Continuar? (S/N");
            resposta = leitor.next();
        }
        while (!resposta.toUpperCase().equals("N"));
        System.out.println("\nFim deste programa.\n");
    }
}