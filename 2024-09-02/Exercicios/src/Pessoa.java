public class Pessoa
{
    final int tamanhoMaximo = 40;   // constante
    private String nome;

    // construtor da classe pessoa com um parâmetro
    public Pessoa(String n) throws Exception {
        setNome(n);
    }

    // getters - para aplicação obter o atributo privativo nome
    public String getNome() {
        return nome;
    }

    // setters - para aplicação ter como alterar o valor do atributo nome
    public void setNome(String valor) throws Exception {
        if (valor.length() > tamanhoMaximo || valor.equals(""))
            throw new Exception("Nome vazio ou mais de 40 caracteres");
        nome = valor;
    }
}
