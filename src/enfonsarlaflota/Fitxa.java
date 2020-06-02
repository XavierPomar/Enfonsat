package enfonsarlaflota;

public class Fitxa {
    
    protected String valor;
    protected int longitud;
    protected int fitxes;

    public Fitxa(String valor, int longitud, int fitxes) {
        this.valor = valor;
        this.longitud = longitud;
        this.fitxes = fitxes;
    }

    public String getValor() {
        return valor;
    }

    public int getLongitud() {
        return longitud;
    }

    public int getFitxes() {
        return fitxes;
    }
    
    public void tocat(){
        
    }
}