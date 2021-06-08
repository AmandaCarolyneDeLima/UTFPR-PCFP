//Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
//volume = 3.14159 * r2 * altura

import java.util.Scanner;

public class Exe12 {
    public static final float PI = 3.14159f;
    
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
        float volume = 0.0f, r = 0.0f, h = 0.0f;
        
        System.out.println ("Qual a altura da lata?: ");
        h = entrada.nextFloat ();
        
        System.out.println ("Qual o raio da lata?: ");
        r = entrada.nextFloat ();
        
        volume = PI * (r*r) * h;
        
        System.out.print ("O volume da lata é de: ");
        System.out.println (volume);
    }
}