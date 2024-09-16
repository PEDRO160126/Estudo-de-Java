public class HelloJava
{
    public static Mensagem nome;

    public static void main(String[] linhaDeComando)
    {
        nome = new Mensagem();  // instancia objeto nome
        if (linhaDeComando.length > 0)
            nome.msg = linhaDeComando[0];
        else
            nome.msg = "Usuário";

        String texto = nome.lerNome();
        System.out.println("Bem vindo(a) à lingasgem Java, "+
                            texto);
    }
}