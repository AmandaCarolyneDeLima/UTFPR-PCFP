//Leia um número inteiro e exiba o resto da divisão deste número por 2.//

import java.util.Scanner;

public class Exe6_1{
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
        
        int a,resto;
        
        System.out.println("Digite seu número");
        a = entrada.nextInt();
        
        resto = a%2;
        
        System.out.print ("O resto é:" + resto);
    }
}