import java.awt.*;
import java.util.Scanner;
public class Programa {

    public static void main(String[] args) throws Exception {
        seletorDeOpcoes();
    }

    static void seletorDeOpcoes() throws Exception {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("\nExercícios Java-02.pdf Slide 31\n");
            System.out.println("0 - Terminar programa");
            System.out.println("1 - Classe Pessoa");
            System.out.println("2 - Classe Porta");
            System.out.println("3 - Classe Casa");
            System.out.println("4 - Exercício 2");
            System.out.print("\nDigite o número da opção desejada:");
            opcao = leitor.nextInt();
            leitor.nextLine();  // ler o [Enter] e tirá-lo do buffer de teclado

            switch (opcao)
            {
                case 1 : fazerClassePessoa(leitor); break;
                case 2 : fazerClassePorta(leitor); break;
                case 3 : fazerClasseCasa(leitor); break;
                case 4 : fazerExercicio2(leitor); break;
            }
        } while (opcao != 0);
    }

    private static void fazerExercicio2(Scanner teclado) throws Exception
    {
        System.out.println("\nVamos criar um Ponto.\n");
        System.out.print("Digite o valor do componente x desse ponto: ");
        int meuX = teclado.nextInt();
        System.out.print("Digite o valor do componente y desse ponto: ");
        int meuY = teclado.nextInt();
        Ponto meuPrimeiroPonto = new Ponto(meuX, meuY);

        System.out.println("\nVamos criar um Círculo.\n");
        System.out.print("Digite o valor do componente x central do círculo: ");
        int xCirc = teclado.nextInt();
        System.out.print("Digite o valor do componente y central do círculo: ");
        int yCirc = teclado.nextInt();
        System.out.print("Digite a medida do raio do círculo: ");
        int rCirc = teclado.nextInt();
        Circulo meuPrimeiroCirculo = new Circulo(xCirc, yCirc, rCirc);

        System.out.println("\nVamos criar um Pixel.\n");
        System.out.print("Digite o valor do componente x do pixel: ");
        int xPixel = teclado.nextInt();
        System.out.print("Digite o valor do componente y do pixel: ");
        int yPixel = teclado.nextInt();
        // ler e ignorar o [Enter] que ficou depois da leitura do inteiro acima
        teclado.nextLine();
        System.out.print("Digite a cor do pixel (R, Y, C, M, B, G, W, K): ");
        String letraCor = teclado.nextLine();
        Color cor;
        switch (letraCor.toUpperCase())
        {
            case "R": cor = Color.RED; break;
            case "Y": cor = Color.YELLOW; break;
            case "C": cor = Color.CYAN; break;
            case "M": cor = Color.MAGENTA; break;
            case "B": cor = Color.BLUE; break;
            case "G": cor = Color.GREEN; break;
            case "W": cor = Color.WHITE; break;
            case "K": cor = Color.BLACK; break;
            default : cor = Color.PINK; break;
        }
        Pixel meuPrimeiroPixel = new Pixel(xPixel, yPixel, cor);

        System.out.println("Meu primeiro ponto  : "+meuPrimeiroPonto);
        System.out.println("Meu primeiro circulo: "+meuPrimeiroCirculo);
        System.out.println("Circuferência do meu primeiro círculo: "+
                meuPrimeiroCirculo.circunferencia() );
        Circulo copiaDoCirculo = meuPrimeiroCirculo;
        System.out.println("Cópia do círculo: "+copiaDoCirculo+
                " circunfenrência: "+copiaDoCirculo.circunferencia()
        );
        System.out.println("Meu primeiro pixel  : "+meuPrimeiroPixel);
        System.out.print("\nTecle S e [Enter]");
        String resp = teclado.nextLine();
    }

    private static void fazerClasseCasa(Scanner teclado) throws Exception {
        System.out.print("Qual o nome do proprietário da casa? ");
        String nomeProp = teclado.nextLine();
        System.out.print("Qual o número da casa? ");
        int numCasa = teclado.nextInt();
        System.out.print("Quantas portas há na casa? ");
        int qtasPortas = teclado.nextInt();
        teclado.nextLine(); // para tirar o [Enter~] do buffer do teclado

        Porta[] asPortas = new Porta[qtasPortas];
        for (int indicePorta = 0; indicePorta < qtasPortas; indicePorta++)
        {
            System.out.printf("A porta %d está aberta (A) ou fechada (F)? ",
                    indicePorta);
            String estado = teclado.nextLine();
            if (estado.toUpperCase().equals("A"))
                asPortas[indicePorta] = new Porta(true);
            else
                asPortas[indicePorta] = new Porta(false);
        }
        Pessoa dona = new Pessoa(nomeProp);
        Casa minhaCasaMinhaVida = new Casa(dona,  numCasa, asPortas);
        System.out.println("Situação da casa "+minhaCasaMinhaVida);
        System.out.print("Tecle S e [Enter]");
        String resp = teclado.nextLine();
    }

    private static void fazerClassePorta(Scanner teclado) {
        Porta umaPorta = new Porta(false);
        System.out.println("Deseja abrir a porta (S/N)?");
        String resp = teclado.nextLine();
        if (resp.toUpperCase().equals("S"))
            umaPorta.abrir();
        System.out.println("Situação: "+umaPorta.situacaoDaPorta());
        System.out.print("Tecle S e [Enter]");
        resp = teclado.nextLine();
    }

    static void fazerClassePessoa(Scanner teclado) throws Exception {
        System.out.print("Digite seu nome, por favor: ");
        String oNome = teclado.nextLine();
        Pessoa aPessoa = new Pessoa(oNome);
        System.out.println("Bem vindo(a) seja, "+aPessoa.getNome());
        System.out.print("Tecle S e [Enter]");
        String resp = teclado.nextLine();
    }
}
