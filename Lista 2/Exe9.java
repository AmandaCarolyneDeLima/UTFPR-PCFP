//Entrar com a razão de uma PA e o valor do primeiro termo. Calcular e imprimir o décimo termo da
//série.

import java.util.Scanner;

public class Exe9 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
        int razao = 0, inicial = 0, a = 0;
        
        System.out.println ("Qual o valor inicial?: ");
        inicial = entrada.nextInt();
        
        System.out.println ("Qual a razão?: ");
        razao = entrada.nextInt();
        
        a = inicial + (9 * razao);
        
        System.out.print ("O décimo termo é: ");
        System.out.println (a);
    }
}