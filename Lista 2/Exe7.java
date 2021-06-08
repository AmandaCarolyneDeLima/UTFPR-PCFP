//Construir um aplicativo que calcule a área de um losango. Identificar quais serão as entradas
//necessárias.

import java.util.Scanner;

public class Exe7 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
        float b = 0.0f, h = 0.0f, a = 0.0f;
        
        System.out.println ("Digite o tamanho da base do losango: ");
        b = entrada.nextFloat();
        
        System.out.println ("Digite a altura do losango: ");
        h = entrada.nextFloat();
        
        a = (b*h);
        
        System.out.print("A área do losango é: ");
        System.out.println(a);
    }
}