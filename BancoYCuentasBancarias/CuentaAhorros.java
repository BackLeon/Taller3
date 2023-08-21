package BancoYCuentasBancarias;

public class CuentaAhorros extends Cuenta{


    public CuentaAhorros(String nombre) {
        super(nombre);
    }

    @Override
    public void TipoDeCuenta() {

        System.out.println("Esta es una cuenta de ahorros.");
    }
}
