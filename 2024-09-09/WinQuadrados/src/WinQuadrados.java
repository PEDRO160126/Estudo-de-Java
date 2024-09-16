import javax.swing.*;

public class WinQuadrados {
    // exemplo de execução:
    // java Quadrados.class 19
    public static void main(String[] linhaDeComando)
    {
        int numeroPassado = Integer.parseInt(
                JOptionPane.showInputDialog("Número final: ")
        );
        String saida = "";
        for (int contador = 1;              // inicia contador
             contador <= numeroPassado;     // condição de repetição
             contador++)                    // passo do contador
        {
            String linha = String.format("%d^2 = %d\n",
                    contador, contador*contador);
            saida += linha;
        }
        JOptionPane.showMessageDialog(null, saida);

        System.out.println("\nFim.\n");
    }
}

