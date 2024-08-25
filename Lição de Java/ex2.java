//Peça ao usuário que digite quatro notas bimestrais, calcule e mostre sua média aritmética.

import java.util.Scanner;
public class Media{
    public static void main(String[] args){
        Scanner leitor = new (Scanner.in);
        System.out.println("Digite o valor da nota 1 :");
        int nota1 = leitor.nextInt();

        System.out.println("Digite o valor da nota 2 :");
        int nota2 = leitor.nextInt();

        System.out.println("Digite o valor da nota 3 :");
        int nota3 = leitor.nextInt();

        System.out.println("Digite o valor da nota 4 :");
        int nota4 = leitor.nextInt;

        int calculo = (nota1 + nota2 + nota3 + nota4) / 4 ;

        System.out.println("A nota final do aluno é :" + calculo);

        leitor.close()
    }
}