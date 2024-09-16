import java.awt.*;
public class Circulo extends Ponto {
    private int raio;

    public Circulo(int xCentro, int yCentro, int r, Color cor) {
        super(xCentro, yCentro, cor);
        raio = r;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int valor) {
        raio = valor;
    }

    public void desenhar(Color corDaFigura, Graphics g) {
        g.drawOval(x - raio, y - raio, 2 * raio, 2* raio);
    }
}
