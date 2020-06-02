package enfonsarlaflota;

public class Tauler {
    private Casella[][] tauler = new Casella [10][10];
    private PortaAvions portaAvions;
    private Buc buc1;
    private Buc buc2;
    private Llaut llaut1;
    private Llaut llaut2;
    private Llaut llaut3;
    private Lanxa lanxa1;
    private Lanxa lanxa2;
    private Lanxa lanxa3;
    private Lanxa lanxa4;

    int filaMax = 10;
    int columnaMax = 10;

    public void crearTauler(){
        for (int i = 0; i < filaMax; i++){
        System.out.println();
        for (int k = 0; k < columnaMax; k++){
        if(tauler[k][i] != null){
            System.out.println(tauler[k][i]);
        }
    }
    }
    System.out.println();
    }
}