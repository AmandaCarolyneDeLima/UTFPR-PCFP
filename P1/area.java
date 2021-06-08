// Amanda Carolyne de Lima

import java.util.Scanner;

public class area{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
        
        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();
        
        triangulo = A * C / 2.0;
        
        circulo = 3.14159 * (C * C);
        
        trapezio = ((A + B) * C) / 2;
        
        quadrado = B * B;
        
        retangulo = A * B;
        
        System.out.println(String.format("TRIANGULO: %.3f", triangulo));
        System.out.println(String.format("CIRCULO: %.3f", circulo));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
        System.out.println(String.format("QUADRADO: %.3f", quadrado));
        System.out.println(String.format("RETANGULO: %.3f", retangulo));  
    }
}