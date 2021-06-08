//Entrar com os valores dos catetos de um triângulo retângulo e imprimir a hipotenusa
//correspondente.

import java.util.Scanner;
import java.lang.Math;

public class Exe8 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
        double a = 0.0f, b = 0.0f, c = 0.0f,d = 0.0f;        
        
        System.out.println ("Valor do cateto adjacente: ");
        a = entrada.nextDouble();
        
        System.out.println ("Valor do cateto oposto: ");
        b = entrada.nextDouble();
        
        c = Math.sqrt((a*a) + (b*b));
        
        System.out.print("A hipotenusa é: ");
        System.out.println (c);
    }
}