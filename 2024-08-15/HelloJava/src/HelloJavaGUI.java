public class HelloJavaGUI
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
        MensagemGUI meuForm =
                new MensagemGUI("Bem-vindo(a) à linguagem Java, "+
                        texto+"!");
        System.out.println("Nome digitado: "+meuForm.txtNome.getText());
    }
}