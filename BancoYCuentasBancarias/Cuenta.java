package BancoYCuentasBancarias;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public abstract class Cuenta implements ICuentaBancaria{

    private double tuDinero;
    private String tuNombre;

    public Cuenta(String nombre){

        this.tuNombre = nombre;

    }

    public abstract void TipoDeCuenta();

    @Override
    public void DepositarDinero(){
        Scanner input = new Scanner(System.in);
        System.out.println("Cuanto dinero vas a depositar en tu cuenta?: ");
        double nuevoDinero = input.nextDouble();
        this.tuDinero += nuevoDinero;
        System.out.println(tuNombre + " Tu nuevo saldo es de " + tuDinero + "$");


    }

    @Override
    public void RetirarDinero(){
        Scanner input = new Scanner(System.in);

        if(this.tuDinero == 0){
            System.out.println("No tienes saldo para retirar.");
        }else{
            System.out.println("Saldo: " + tuDinero +" --Cuanto dinero vas a retirar de tu cuenta?: ");
            double nuevoDinero = input.nextDouble();

            if(nuevoDinero > this.tuDinero ){
                System.out.println("No cuentas con el suficiente saldo para hacer este retiro..");
            }else if(nuevoDinero < this.tuDinero){
                this.tuDinero -= nuevoDinero;
                System.out.println("Retiraste: " + nuevoDinero + "$");
                System.out.println("El retiro fue exitoso, ahora tu saldo es de " + this.tuDinero + "$");
            }

        }




    }

}
