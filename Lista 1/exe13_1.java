//Entrar com quatro números e imprimir a média ponderada, sabendo-se que os pesos são
//respectivamente: 1, 2, 3 e 4.

import java.util.Scanner;

public class exe13_1 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
        int n1 = 0,n2 = 0,n3 = 0,n4 = 0;
        float nf = 0.0f;
        
        System.out.print ("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        
        System.out.print ("Digite o segundo número: ");
        n2 = entrada.nextInt();
        
        System.out.print ("Digite o terceiro número: ");
        n3 = entrada.nextInt();
        
        System.out.print ("Digite o quarto número: ");
        n4 = entrada.nextInt();
        
        nf = (float) ((n1 * 1) + (n2 * 2) + (n3 * 3) + (n4 * 4)) / 10;
        
        System.out.print ("A média ponderada é: ");
        System.out.println (nf);
    }
}