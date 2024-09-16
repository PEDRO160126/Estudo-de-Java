import java.io.*;
public class Estudante {
    private String curso;
    private String ra;
    private String nome;
    private double[] notas;
    private int quantasNotas; // tamanho lógico do vetor notas

    public Estudante() {
        // limpa todos os atributos com cadeia vazia, null e zeros
    }

    public Estudante(String c, String r, String n) throws Exception {
        setCurso(c);
        setRa(r);
        setNome(n);
        setNotas(15);   // 15 é o tamanho máximo de Notas[]
        setQuantasNotas(0);
    }

    public boolean leuLinhaDoArquivo(BufferedReader arq) throws Exception {
        if (arq != null)    // arquivo de entrada está aberto
        {
            String linhaDoArquivo = arq.readLine();
            if (linhaDoArquivo != "")  // conseguiu ler linha do arquivo
            {
                String c = linhaDoArquivo.substring( 0,  2);
                String r = linhaDoArquivo.substring( 2,  7);
                String n = linhaDoArquivo.substring( 7, 37);
                String sqn = linhaDoArquivo.substring(37, 39);  // string
                int qn = Integer.parseInt(sqn);  // converte sqn para int
                setNotas(15);  // cria vetor de notas do estudante com 15 posições

                // atribuímos os valores já conhecidos para os campos (atributos)
                // da classe Estudante
                setCurso(c);
                setRa(r);
                setNome(n);
                setQuantasNotas(qn);

                // separamos da linha do arquivo, tantas notas quanto o valor de
                // qn e cada nota é atribuida a uma posição do vetor interno notas
                int inicioNota = 39;  // início da primeira nota
                for (int indNota = 0; indNota < qn; indNota++)
                {
                    String umaNota =  linhaDoArquivo.substring(inicioNota, inicioNota+4);
                    notas[indNota] = Double.parseDouble(umaNota);
                    inicioNota += 4;  // posicionar no inicio da próxima nota
                }
                return true;  // consegui ler uma linha e separar os campos
            }
            else
                return false;

        }
        else
            return false;  // arquivo fechado, não consegui ler nada
    }

    public String formatoDeArquivo()
    {
        String saida =
                String.format("%2s%5s%30s%2d", curso, ra, nome, quantasNotas);

        for (int indNota = 0; indNota < quantasNotas; indNota++)
            saida += String.format("%4.1f", notas[indNota]);

        return saida+"\n";
    }

    public void setCurso(String c) throws Exception
    {
        if (c.equals("") || c.toCharArray().length > 2)
            throw new Exception("Curso inválido.");
        curso = String.format("%2s",c);
    }

    public void setRa(String r) throws Exception
    {
        if (r.equals("") || r.toCharArray().length > 5)
            throw new Exception("RA inválido.");
        ra = String.format("%5s",r);
    }

    public void setNome(String n) throws Exception
    {
        if (n.equals("") || n.toCharArray().length > 30)
            throw new Exception("Nome inválido.");
        nome = String.format("%-30s",n);
    }

    public void setNotas(int qn) throws Exception
    {
        if (qn <= 0)
            throw new Exception("Conjunto de notas errado.");
        notas = new double[qn];
        setQuantasNotas(0);
    }

    public void setQuantasNotas(int qn) throws Exception
    {
        if (qn < 0)
            throw new Exception("Quantas notas errado.");
        quantasNotas = qn;
    }

    public String getCurso() {
        return curso;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public int getQuantasNotas() {
        return quantasNotas;
    }

    public double mediaDasNotas() {
        double soma = 0;
        for (int ind = 0; ind < quantasNotas; ind++)
            soma += notas[ind];
        return soma / quantasNotas;
    }

    public void incluirNota(double qualNota) throws Exception
    {
        if (quantasNotas >= notas.length)
            throw new Exception("Notas em excesso!");

        notas[quantasNotas++] = qualNota;
    }

}
