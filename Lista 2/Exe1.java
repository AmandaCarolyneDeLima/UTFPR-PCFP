//Entrar com um número no formado CDU (centena, dezena e unidade) e exibi-lo de acordo com a
//seguinte saída:
//Centenas:
//Dezenas:
//Unidades:

import java.util.Scanner;

public class Exe1{
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);

        int n = 0, c = 0, d = 0, u = 0;
        
        System.out.println ("Digite seu número: ");
        n = entrada.nextInt();
        
        c = n / 100;
        d = (n % 100) / 10;
        u = n%10;
        
        System.out.print("Centena: ");
        System.out.println(c);
        
        System.out.print("Dezena: ");
        System.out.println(d);
        
        System.out.print("Unidade: ");
        System.out.println(u);
    }
}