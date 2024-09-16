import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Manutencao {
    private static Estudante[] estud;       // vetor de estudantes
    private static int quantosEstudantes;   // tamanho lógico do vetor estud
    private static BufferedReader arquivoDeEntrada;
    private static BufferedWriter arquivoDeSaida;
    static Scanner leitor = new Scanner(System.in);
    static boolean continuarPrograma = true;
    static int onde; // índice resultante da pesquisa binária

    public static void main(String[] args) throws Exception {
        estud = new Estudante[3];  // 50 - tamanho físico
        for (int ind=0; ind < 3; ind++)
            estud[ind] = new Estudante(); // criar objetos Estudante vazios no vetor
        quantosEstudantes = 0; // tamanho lógico (vetor vazio)
        preencherVetorPorArquivo();
        if (continuarPrograma) {
            seletorDeOpcoes();
            salvarVetorNoArquivo();
        }
        System.out.println("\nPrograma encerrado.");
    }

    public static void preencherVetorPorArquivo() {
        try {
            arquivoDeEntrada = new BufferedReader(
                    new FileReader("c:\\temp\\dadosEstudantes.txt")
            );
            String linhaDoArquivo = "";
            try
            {
                boolean parar = false;
                while (! parar)
                {
                    Estudante novoEstudante = new Estudante();
                    try
                    {
                        if (novoEstudante.leuLinhaDoArquivo(arquivoDeEntrada) ) {
                            estud[quantosEstudantes] = novoEstudante;
                            quantosEstudantes++;
                        }
                        else
                            parar = true;
                    }
                    catch (Exception erroDeLeitura)
                    {
                        System.out.println(erroDeLeitura.getMessage());
                        parar = true;
                    }
                }
                arquivoDeEntrada.close();
            }
            catch (IOException erroDeIO)
            {
                System.out.println(erroDeIO.getMessage());
                continuarPrograma = false;
            }
        }
        catch (FileNotFoundException erro) {
            System.out.println(erro.getMessage());
            continuarPrograma = false;
        }
    }

    public static void salvarVetorNoArquivo() throws IOException {
        arquivoDeSaida = new BufferedWriter(
                new FileWriter("c:\\temp\\dadosEstudantes.txt"));
        // percorro o vetor de estudantes para gravar, no arquivo de saída,
        // os objetos da classe Estudante armazenados no vetor estud
        for (int indice=0; indice < quantosEstudantes; indice++)
            arquivoDeSaida.write(estud[indice].formatoDeArquivo());
        arquivoDeSaida.close();
    }

    public static void seletorDeOpcoes() throws Exception {
        int opcao = 0;
        do {
            System.out.println("Opções:\n");
            System.out.println("0 - Terminar programa");
            System.out.println("1 - Incluir estudante");
            System.out.println("2 - Listar estudantes");
            System.out.println("3 - Excluir estudante");
            System.out.println("4 - Listar situações");
            System.out.print("\nSua opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();
            switch(opcao) {
                case 1 : incluirEstudante(); break;
                case 2 : listarEstudantes(); break;
                case 3 : excluirEstudante(); break;
                case 4 : listarSituacoes();  break;
            }
        }
        while (opcao != 0);
    }

    // compareTo()   == 0 primeiro dado igual outro dado
    // compareTo()   < 0  primeiro dado < outro dado
    // compareTo()   > 0  dado this > outro dado
    // esse método guarda no atributo "onde" o índice de inclusão ou
    // o índice em que o estudante procurado foi encontrado
    public static boolean existeEstudante(Estudante estProcurado) {
        int inicio = 0;
        int fim = quantosEstudantes - 1;
        boolean achou = false;
        while (! achou && inicio <= fim) {
            onde = (inicio + fim) / 2;
            String raDoMeioDoTrechoDoVetor = estud[onde].getRa();
            String raDoProcurado = estProcurado.getRa();
            if (raDoMeioDoTrechoDoVetor.compareTo(raDoProcurado) == 0)
                achou = true;
            else
                if (raDoProcurado.compareTo(raDoMeioDoTrechoDoVetor) < 0)
                    fim = onde - 1;
            else
                inicio = onde + 1;
        }
        if (!achou)
            onde = inicio;   // posição de inclusao do RA em ordem crescente
        return achou;
    }

    public static void incluirEstudante() throws Exception {
        System.out.println("Incluir Estudante\n");
        System.out.print("Curso : ");
        String curso = leitor.nextLine();
        System.out.print("RA    : ");
        String ra = leitor.nextLine();
        System.out.print("Nome  : ");
        String nome = leitor.nextLine();
        Estudante umEstudante = new Estudante(curso, ra, nome);
        if (existeEstudante(umEstudante))  // ajusta a variável onde
          JOptionPane.showMessageDialog(null,"Estudante repetido!");
        else
        {
            incluirEmOrdem(umEstudante);  // última posição usada
        }
    }

    private static void expandirVetor() {
        Estudante[] novoVetor = new Estudante[estud.length * 2];
        for (int indice=0; indice<quantosEstudantes; indice++)
            novoVetor[indice] = estud[indice];
        estud = novoVetor;
    }
    private static void incluirEmOrdem(Estudante novo) {
        if (quantosEstudantes >= estud.length)
            expandirVetor();
        // desloco para a direita os estudantes com RA > RA do novo
        for (int indice = quantosEstudantes; indice > onde; indice--)
            estud[indice] = estud[indice-1];
        estud[onde] = novo;
        quantosEstudantes++;  // temos mais um estudante no vetor
    }

    public static void excluirEstudante() throws Exception {
        System.out.println("Excluir Estudante\n");
        System.out.print("RA    : ");
        String ra = leitor.nextLine();
        Estudante umEstudante = new Estudante(" ", ra, " ");
        if (!existeEstudante(umEstudante))  // ajusta a variável onde
            JOptionPane.showMessageDialog(null,"Estudante não encontrado!");
        else  // achou o estudante procurado, no índice "onde" do vetor
        {
            excluir(onde);  // última posição usada
        }
    }

    private static void excluir(int indiceDeExclusao) {
        quantosEstudantes--;
        for (int indice=indiceDeExclusao; indice < quantosEstudantes; indice++)
            estud[indice] = estud[indice+1];
    }

    public static void listarEstudantes() {
        System.out.println("\n\nListagem de Estudantes\n");
        int contLinha = 0;  // contador de linhas
        for (int ind = 0; ind < quantosEstudantes; ind++)
        {
            System.out.println(estud[ind]);

            if (++contLinha >= 20) {       // se exibiu 20 linhas, espera Enter
                System.out.print("\n\nTecle [Enter] para prosseguir: ");
                leitor.nextLine();
                contLinha = 0;      // reinicia o contador de linhas
            }
        }
        System.out.print("\n\nTecle [Enter] para prosseguir: ");
        leitor.nextLine();
    }

    public static void listarSituacoes() {
        System.out.println("\n\nSituação estudantil\n");
        String situacao = "";
        for (int indice = 0; indice < quantosEstudantes; indice++)
        {
            double mediaDesseEstudante = estud[indice].mediaDasNotas();
            if (mediaDesseEstudante < 5)
                situacao = "Não promovido(a)";
            else
                situacao = "Promovido(a)    ";

            System.out.printf(
                    "%4.1f %16s "+estud[indice]+"\n", mediaDesseEstudante,
                    situacao);
        }
        System.out.print("\n\nTecle [Enter] para prosseguir: ");
        leitor.nextLine();
    }

    // codificar um método digitarNotas:
    // pedir um RA
    // procurar o RA no vetor estud
    // se não existir, avisa o usuário
    // se existir:
    //      pergunta quantas notas serão digitadas
    //      percorre o vetor de notas do estudante encontrado e
    //      pergunta ao usuário qual a nota dessa posição
    //      valide a nota entre 0 e 10.0, peça de novo se a nota não
    //      estiver nesse intervalo
}
