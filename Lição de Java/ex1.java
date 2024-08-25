/* EXERCICIO 1 : Declare as variáveis abaixo como inteiras e lhes atribua valores para exibir o valor de x
usando os detalhes abaixo:
x = y + (a * b / c)
y = a + 151
b = c * (144 + y)
a = 10
c = 7
pedir ao usuário que informe o valor de a*/

import java.util.Scanner;
public class Equacao{
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor de a : ");
        int a = leitor.nextInt();

        int c = 7;
        int y = a + 151 ; 
        int b = c * (144 + y) ;
        int x = y + (a * b / c);

        System.out.println("O valor de x é :" + x);

        leitor.close()
        }
    }
