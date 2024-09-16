import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Editor extends JFrame  // Formulário GUI
{
    private JButton btnPonto, btnLinha, btnCirculo, btnElipse,
                    btnCor, btnAbrir, btnSalvar, btnApagar,
                    btnSair;
    private JPanel pnlBotoes;
    private JInternalFrame frame;
    static private MeuJPanel pnlDesenho;
    private static Ponto[] figuras = new Ponto[1000];
    static int qtasFiguras;


    public Editor()
    {
        super("Editor Gráfico");

        ImageIcon imgAbrir = new ImageIcon("abrir.bmp");
        btnAbrir = new JButton("Abrir", imgAbrir);
        btnSalvar = new JButton("Salvar", new ImageIcon("salvar.jpg"));
        btnPonto = new JButton("Ponto", new ImageIcon("ponto.jpg"));
        btnLinha = new JButton("Linha", new ImageIcon("linha.jpg"));
        btnCirculo = new JButton("Circulo", new ImageIcon("circulo.jpg"));
        btnElipse = new JButton("Elipse", new ImageIcon("elipse.jpg"));
        btnCor = new JButton("Cores", new ImageIcon("cores.jpg"));
        btnApagar = new JButton("Apagar", new ImageIcon("apagar.jpg"));
        btnSair = new JButton("Sair", new ImageIcon("sair.jpg"));
        // cria o JPanel que armazenará os botões
        pnlBotoes = new JPanel();
        // cria o layout usado para dispor fisicamente os botões
        FlowLayout flwBotoes = new FlowLayout();
        // informa que os componentes do pnlBotoes serão dispostos em forma livre
        pnlBotoes.setLayout(flwBotoes);
// adiciona os controles visuais (botões) ao painel de botões, de cima
        // para baixo, da esquerda para direita.
        pnlBotoes.add(btnAbrir);
        btnAbrir.addActionListener(new FazAbertura());

        pnlBotoes.add(btnSalvar);
        pnlBotoes.add(btnPonto);
        pnlBotoes.add(btnLinha);
        pnlBotoes.add(btnCirculo);
        pnlBotoes.add(btnElipse);
        pnlBotoes.add(btnCor);
        pnlBotoes.add(btnApagar);
        pnlBotoes.add(btnSair);
        Container cntForm = getContentPane(); // acessa o painel de conteúdo do frame
        cntForm.setLayout(new BorderLayout());
        cntForm.add(pnlBotoes , BorderLayout.NORTH);

        JDesktopPane panDesenho = new JDesktopPane();
        cntForm.add(panDesenho);

        frame = new JInternalFrame("Nenhum arquivo aberto", true, true, true, true);
        panDesenho.add(frame);

        setSize(700, 450);
        show();

        frame.setSize(this.getWidth() / 2,this.getHeight() / 2);
        frame.show();
        frame.setOpaque(true);

        pnlDesenho = new MeuJPanel();
        Container cntFrame = frame.getContentPane();
        cntFrame.add(pnlDesenho);

    }

    public static void main(String[] args) {
        Editor aplicacao = new Editor();
        aplicacao.addWindowListener(
                new WindowAdapter()    //  cria instância da interface
                {
                    public void windowClosing(WindowEvent e)
                    {
                        System.exit(0);
                    }
                }
        );
    }

    private class FazAbertura implements ActionListener {
        public void actionPerformed(ActionEvent e)	// código executado no evento
        {
            JFileChooser arqEscolhido = new JFileChooser();
            arqEscolhido.setFileSelectionMode(JFileChooser.FILES_ONLY);

            int result = arqEscolhido.showOpenDialog(Editor.this);
//… código de verificação se um arquivo foi selecionado e obtenção de seu nome

            if (result == JFileChooser.APPROVE_OPTION)
            {
                File arquivo = arqEscolhido.getSelectedFile();
                System.out.println("Processando "+arquivo.getName());
            }

        }
    }


    private class MeuJPanel extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            for (int qualFigura = 0 ; qualFigura < qtasFiguras; qualFigura++)
                figuras[qualFigura].desenhar(figuras[qualFigura].getCor(), g);
        }
    }

}
