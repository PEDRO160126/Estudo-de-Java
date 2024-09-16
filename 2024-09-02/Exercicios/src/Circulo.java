public class Circulo extends Ponto // Circulo herda de Ponto
{
    int raio;

    public Circulo(int xCentro, int yCentro, int raioCirc) throws Exception
    {
        // construtor da classe Ponto, preenche x e y do Circulo,
        // herdados do Ponto (classe superior ou
        // classe ancestral de Circulo)
        super(xCentro, yCentro);    // atribui valores a x e y do Circulo
        raio = raioCirc;
    }

    // getter do atributo raio
    public int getRaio() {
        return raio;
    }

    // setter do atributo raio
    public void setRaio(int valor) throws Exception {
        if (valor <= 0)
            throw new Exception("Raio do círculo deve ser maior que 0");
        raio = valor;
    }

    public String toString()
    {
        return "Centro: "+super.toString()+" ; Raio:"+ raio;
    }

    public double circunferencia() {
        return 2 * Math.PI * raio;
    }
}
