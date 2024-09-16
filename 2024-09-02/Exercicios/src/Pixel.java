import java.awt.*;
public class Pixel extends Ponto // Circulo herda de Ponto
{
    private Color cor;

    public Pixel(int xPixel, int yPixel, Color corPixel) throws Exception
    {
        // construtor da classe Ponto, preenche x e y do Pixel,
        // herdados do Ponto (classe superior ou
        // classe ancestral de Pixel)
        super(xPixel, yPixel);    // atribui valores a x e y do Circulo
        cor = corPixel;
    }

    // getter do atributo cor
    public Color getCor() {
        return cor;
    }

    // setter do atributo cor
    public void setCor(Color valor) {
         cor = valor;
    }

    public String toString()
    {
        return "Ponto do pixel: "+super.toString()+" ; Cor:"+ cor.toString();
    }
}
