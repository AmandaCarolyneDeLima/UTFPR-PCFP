//Leia dois números inteiros, a e b, e faça com que eles troquem os valores entre si. Exiba os valores//
//de a e b.//

import java.util.Scanner;

public class Exe11_1{
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
        
        int a,b,x,y;
        
        System.out.println("Digite o valor de A:");
        a = entrada.nextInt();
        
        System.out.println("Digite o valor de B:");
        b = entrada.nextInt();
        
        x=a;
        y=b;
        
        System.out.println("O valor de A é:" + y);
        System.out.println("O valor de B é:" + x);
    }
}