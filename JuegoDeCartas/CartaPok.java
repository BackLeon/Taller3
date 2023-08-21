package JuegoDeCartas;

public class CartaPok extends  TipoCarta {

    public CartaPok(int palo, int rango) {
        super(palo, rango);
    }

    @Override
    public void mostrarCartas() {
        System.out.println(palo + " " + rango);
    }


    public void valorNumerico() {

        if (rango == 12) {
            System.out.println("11");

        }

        else if (rango >= 9) {
            System.out.println("10");

        }

        else {

            System.out.println(rango + 1);
        }
    }
}



