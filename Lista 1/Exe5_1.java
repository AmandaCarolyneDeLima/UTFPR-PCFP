//Leia duas notas semestrais inteiras e exiba a média anual.//

import java.util.Scanner;

public class Exe5_1{
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
        
        int a,b,media;
        
        System.out.println("Digite a primeira nota:");
        a = entrada.nextInt();
        
        System.out.println("Digite a segunda nota:");
        b = entrada.nextInt();
        
        media = (a+b)/2;
        
        System.out.print ("Sua média é:" + media);
    }
}