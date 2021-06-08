//Leia um número inteiro e imprima-o na saída.//

import java.util.Scanner;

public class Exe3_1{
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
        
        int a;
        
        System.out.println ("Digite seu número:");
        a = entrada.nextInt();
        
        System.out.println ("Seu número é:" + a);
    }
}