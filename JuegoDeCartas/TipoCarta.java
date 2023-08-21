package JuegoDeCartas;

public abstract class TipoCarta implements  ICartasMetodos{

    public static final String[] PALOS = {"Trébol", "Corazón", "Picas", "Diamantes"};

    public static final String[] RANGOS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "As"};

    protected int palo;

    protected int rango;


    public TipoCarta(int palo, int rango) {
        this.palo = palo;
        this.rango = rango;
    }


    @Override
    public void mostrarCarta() {
        System.out.println(RANGOS[rango] + " de " + PALOS[palo]);
    }


    @Override
    public void valorNumerico() {

    }

}
