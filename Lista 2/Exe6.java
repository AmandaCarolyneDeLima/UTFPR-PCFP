//Criar um aplicativo que calcule e imprima a área de um triângulo.

import java.util.Scanner;

public class Exe6 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
        float a = 0.0f, b = 0.0f, h = 0.0f;
        
        System.out.println ("Qual a base do triângulo: ");
        b = entrada.nextFloat ();
        
        System.out.println ("Qual a altura do triângulo: ");
        h = entrada.nextFloat();
        
        a = (b*h) / 2;
        
        System.out.print ("A área do triângulo é: ");
        System.out.println (a);
    }
}