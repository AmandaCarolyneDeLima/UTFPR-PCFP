//Leia três números inteiros e exiba a soma destes números.//

import java.util.Scanner;

public class Exe4_1{
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
        
        int a,b,c,soma;
        
        System.out.println ("Digite o número:");
        a = entrada.nextInt();
        
        System.out.println ("Digite o número:");
        b = entrada.nextInt();
        
        System.out.println ("Digite o número:");
        c = entrada.nextInt();
        
        soma = a + b + c;
        
        System.out.print ("A soma é:" + soma);
    }
}