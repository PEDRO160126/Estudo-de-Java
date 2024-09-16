import java.awt.Color;
public class Casa {
  private int numero;
  private Color cor;
  private static String arquiteto;

  void abrirPorta()
  {
     System.out.println("A porta da casa "+numero+" foi aberta");
  }

  public  void setNumero(int num) throws Exception
// acesso void setAtributo(tipo valor)
  {
     if (num > 0)
        numero = num;
     else
       throw new Exception("Número da casa deve ser positivo.");
  }

  public int getNumero()		// acesso tipo getAtributo()
  {
	return numero;
  }

  public void setCor(Color aCor) {
    cor = aCor;
  }

  public Color getCor() {
    return cor;
  }

  public String getArquiteto()
  {
     return arquiteto;
  }

  public static void setArquiteto(String nome) throws Exception
  {
     if (nome.equals(""))
        throw new Exception("Nome do arquiteto inválido");
     arquiteto = nome;
  }
}