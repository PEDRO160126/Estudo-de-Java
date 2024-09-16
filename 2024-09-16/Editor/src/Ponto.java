import java.awt.*;
public class Ponto {
    protected int x, y;
    protected Color cor;

    public Ponto(int cX, int cY, Color qualCor)
    {
        x = cX;
        y = cY;
        cor = qualCor;
    }

    public int getX() {
        return x;
    }

    public void setX(int valor) {
        x = valor;
    }

    public int getY() {
        return y;
    }

    public void setY(int valor) {
        y = valor;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color valor) {
        cor = valor;
    }

    public void desenhar(Color corDaFigura, Graphics g)
    {
        g.drawLine(x,y, x,y);
    }

}
