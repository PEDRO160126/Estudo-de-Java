import java.util.Scanner;
public class Calc {

    private static Calculadora minhaCalc;  // Atributo da classe --> global

    public static void main(String[] args) {
        minhaCalc = new Calculadora(); // var global
        minhaCalc.ligar();
        seletorDeOperacoes();
        minhaCalc.desligar();
    }

    public static void seletorDeOperacoes() {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        do {
            minhaCalc.limparVisor();
            System.out.println("Operações:");
            System.out.println("0 - Parar e desligar");
            System.out.println("1 - Digitar números");
            System.out.println("2 - Somar números");
            System.out.println("3 - Subtrair números");
            System.out.println("4 - Dividir números");
            System.out.println("5 - Multiplicar números");
            System.out.print("\nNúmero da operação desejada:");
            opcao = leitor.nextInt();
            switch (opcao)
            {
                case 1: minhaCalc.obterNumeros(); 
                        break;
                case 2: minhaCalc.somar();
                        break;
                case 3: minhaCalc.subtrair();
                        break;
                case 4: minhaCalc.dividir();
                        break;
                case 5: minhaCalc.multiplicar();
                        break;
            }
            if (opcao > 1) {
                minhaCalc.exibirResultado();
                System.out.print("\nTecle [C] e [Enter] para continuar:");
                leitor.next();
            }
        }
        while (opcao != 0);
        leitor.close();
    }
}
