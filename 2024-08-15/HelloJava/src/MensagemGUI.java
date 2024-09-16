import javax.swing.*; // importa JFrame e JLabel
import java.awt.Container;

public class MensagemGUI
{
    public JTextField txtNome = null;

    public MensagemGUI(String texto)        // construtor
    {
        JFrame janela = new JFrame("GUI - título da janela");
        Container areaUtil = janela.getContentPane();
        areaUtil.add(new JLabel(texto));
        areaUtil.add(new JLabel(("Digite seu nome:")));
        txtNome = new JTextField();
        areaUtil.add(txtNome);
        janela.pack();
        janela.setVisible(true);
    }
}
