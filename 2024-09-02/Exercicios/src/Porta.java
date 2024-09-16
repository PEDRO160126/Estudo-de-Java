public class Porta {
    private boolean aberta;

    public Porta(boolean estadoDaPorta) {
        setAberta(estadoDaPorta);
    }

    public void setAberta(boolean valor) {
        aberta = valor;
    }

    public boolean getAberta() {
        return aberta;
    }

    public void abrir() {
        aberta = true;
    }

    public void fechar() {
        aberta = false;
    }

    public String situacaoDaPorta() {
        if (aberta)
            return "Porta aberta";
        else
            return "Porta fechada";
    }
}
