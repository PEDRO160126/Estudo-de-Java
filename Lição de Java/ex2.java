//Peça ao usuário que digite quatro notas bimestrais, calcule e mostre sua média aritmética.

import java.util.Scanner;
public class Media{
    public static void main(String[] args){
        Scanner leitor = new Scanner(Scanner.in);
        System.out.println("Digite o valor da nota 1 :");
        double nota1 = leitor.nextDouble();

        System.out.println("Digite o valor da nota 2 :");
        double nota2 = leitor.nextDouble();

        System.out.println("Digite o valor da nota 3 :");
        double nota3 = leitor.nextDouble();

        System.out.println("Digite o valor da nota 4 :");
        double nota4 = leitor.nextDouble();

        double calculo = (nota1 + nota2 + nota3 + nota4) / 4 ;

        System.out.println("A nota final do aluno é :" + calculo);

        leitor.close();
    }
}
