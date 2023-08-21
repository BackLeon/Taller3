package BancoYCuentasBancarias;

public class CuentaCorriente extends  Cuenta{


    public CuentaCorriente(String nombre) {
        super(nombre);
    }

    @Override
    public void TipoDeCuenta() {
        System.out.println("Esta es una cuenta corriente");
    }
}
