//Ler um número inteiro e imprimir o seu quadrado

import java.util.Scanner;

public class exe14_1 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
        int a = 0, q = 0;
        
        System.out.print ("Digite seu número: ");
        a = entrada.nextInt ();
        
        q = a*a;
        
        System.out.print ("Seu número ao quadrado é: ");
        System.out.println (q);
    }
}