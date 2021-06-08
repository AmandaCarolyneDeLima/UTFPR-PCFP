//Leia uma temperatura em ºC, calcule e exiba a correspondente em ºF (Wikipédia!).//

import java.util.Scanner;

public class Exe10_1{
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
        
        float c,f;
        
        
        System.out.println("Qual a temperatura?");
        c = entrada.nextInt();
        
        f = ((c/5)*9)+32;
        
        System.out.println("A temperatura em F é:");
        System.out.print (f);
    }
}