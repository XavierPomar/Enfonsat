package enfonsarlaflota;

public class Casella {
    
    protected String valor;
    protected Fitxa fitxa;
    protected boolean destapat;

    public Casella(Fitxa fitxa) {
        this.fitxa = fitxa;
    }
    
    //Set & Get

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public void setFitxa(Fitxa fitxa) {
        this.fitxa = fitxa;
    }

    public void setDestapat(boolean destapat) {
        this.destapat = destapat;
    }
    
    public String getValor() {
        return valor;
    }
    
    public Fitxa getFitxa() {
        return fitxa;
    }
    
    public boolean isDestapat() {
        return destapat;
    }    
}