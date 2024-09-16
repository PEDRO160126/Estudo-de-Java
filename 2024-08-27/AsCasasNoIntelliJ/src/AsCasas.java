import java.awt.Color;

public class AsCasas {
  public static void main(String[] args) throws Exception
  {
    if (args.length > 0)
       fazerTudo(args[0]);
    else
      fazerTudo("Ramos de Azevedo");
  }

  public static void fazerTudo(String oNome) throws Exception
  {
    Casa.setArquiteto(oNome);

    Casa casa1   = new Casa();
    casa1.setNumero(12);
    casa1.setCor(Color.yellow);
    casa1.abrirPorta();
    System.out.println("O arquiteto da casa "+casa1.getNumero()+
                       " é "+casa1.getArquiteto());

    Casa casa2   = new Casa();
    casa2.setNumero(56);
    casa2.setCor(Color.red);
    casa2.abrirPorta();
    System.out.println("O arquiteto da casa "+casa2.getNumero()+
                       " é "+casa2.getArquiteto());

    System.out.println("<Mudei o nome do(a) arquiteto(a)!");
    casa2.setArquiteto("Maria");
    System.out.println("O arquiteto da casa "+casa1.getNumero()+
            " é "+casa1.getArquiteto());
    System.out.println("O arquiteto da casa "+casa2.getNumero()+
            " é "+casa2.getArquiteto());

  }
}
