package Java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1012 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner (System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double PI = 3.14159;

        double triRetangulo = (A * C)/2.0;
        double circulo = PI * Math.pow(C,2);
        double trapezio = ((A+B) * C)/2.0;
        double quadrado = B * B;
        double retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f %n", triRetangulo);
        System.out.printf("CIRCULO: %.3f %n", circulo);
        System.out.printf("TRAPEZIO: %.3f %n", trapezio);
        System.out.printf("QUADRADO: %.3f %n", quadrado);
        System.out.printf("RETANGULO: %.3f %n", retangulo);
        
        input.close();

 
    }
    
}
