public class Casa extends Construcao {
    Pessoa proprietario;
    int numero;
    Porta[] portasDaCasa;

    // construtor da classe Classe
    public Casa(Pessoa p, int num, Porta[] asPortas) {
        setFinalidade("Residencial");
        numero = num;
        proprietario = p;
        portasDaCasa = asPortas;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa prop) {
        proprietario = prop;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Porta[] getPortasDaCasa() {
        return portasDaCasa;
    }

    public void setPortasDaCasa(Porta[] portasDaCasa) {
        this.portasDaCasa = portasDaCasa;
    }

    @Override
    public String ToString()
    {
        String saida = proprietario.getNome()+" número:" + numero+" Portas: ";
        for (int indPorta = 0; indPorta < portasDaCasa.length; indPorta++)
            if (portasDaCasa[indPorta].getAberta())
                saida += indPorta+": aberta; ";
            else
                saida += indPorta+": fechada; ";
        return saida;
    }

}
