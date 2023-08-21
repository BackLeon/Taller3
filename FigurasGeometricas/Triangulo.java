package FigurasGeometricas;

import java.util.Scanner;

public class Triangulo implements IGeometricas{


    @Override
    public String calculoArea() {
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Calcularemos el area de este triangulo, para eso, debes darme el valor del radio del triangulo: ");
        int num1 = Integer.parseInt(numero1.nextLine());

        double pi = Math.round(Math.PI * 10000.0) / 10000.0;
        int cuadrado = num1 * num1;
        double area = pi * cuadrado;
        return "El area del triangulo es " + area + "cm2";

    }

    @Override
    public String calculoPerimetro() {
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Calcularemos el perimetro de este triangulo, para eso, debes darme el valor del radio del triangulo: ");
        int num1 = Integer.parseInt(numero1.nextLine());

        double pi = Math.round(Math.PI * 10000.0) / 10000.0;
        double perimetro = 2 * pi * num1;
        return "su perimetro es " + perimetro + "cm";
    }
}
