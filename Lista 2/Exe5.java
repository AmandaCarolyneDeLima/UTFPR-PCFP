//Entrar com o raio de um círculo e imprimir sua respectiva área e comprimento de sua
//circunferência

import java.util.Scanner;

public class Exe5 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
        float r = 0.0f, a = 0.0f, c = 0.0f;
        
        System.out.println ("Qual o raio do círculo?: ");
        r = entrada.nextFloat();
        
        a = 3.14f * (r*2.0f);
        
        c = 2.0f * 3.14f * r;
        
        System.out.print("A área do círculo é: ");
        System.out.println(a);
        
        System.out.print ("O comprimento do círculo é: ");
        System.out.println(c);
    }
}