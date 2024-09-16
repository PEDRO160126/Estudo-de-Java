public class Ponto {
    private int x, y;

    public Ponto(int vX, int vY) throws Exception {
        setX(vX);
        setY(vY);
    }

    // getter do x
    public int getX() {
        return x;
    }

    // setter do x
    public void setX(int valor) throws Exception {
        if (valor < 0)
            throw new Exception("Componente x deve ser positivo!");
        x = valor;
    }

    // getter do y
    public int getY() {
        return y;
    }

    // setter do y
    public void setY(int valor) throws Exception {
        if (valor < 0)
            throw new Exception("Componente y deve ser positivo!");
        y = valor;
    }

    public String toString()
    {
        return "("+x+", "+y+")";
    }
}
