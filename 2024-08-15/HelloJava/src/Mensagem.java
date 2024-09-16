public class Mensagem
{
    public String msg = "";     // atributo da classe

    public String lerNome()     // método da classe -> retorna String
    {
        String nomeEmMaiusculo = msg.toUpperCase();
        return nomeEmMaiusculo;
    }
}
