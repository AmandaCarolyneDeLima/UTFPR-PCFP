//Dê o resultado das expressões abaixo://
//a. int a = 26/6/2 – 127 / 7 % 5;//
//b. int b = 7 % 4 – 8 / (3+1);//
//c. int c = 7 % 9;//
//d. int d = (7 % 4) – 8) / (3+1);//
//O resultado final pode ser conferido por meio da impressão de cada variável na tela//

import java.util.Scanner;

public class Exe1_1{
    public static void main (String args[]){
        Scanner entrada = new Scanner (System.in);
        
        int a = ((26/6)/2) - ((127/7)%5);
        int b = (7%4) - 8 / (3+1);
        int c = 7 % 9;
        int d = ((7 % 4 ) - 8) / (3+1);
      
        System.out.println ("Resultado A:"+a);
        System.out.println ("Resultado B:"+b);
        System.out.println ("Resultado C:"+c);
        System.out.println ("Resultado D:"+d);
    }
}