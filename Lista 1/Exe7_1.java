//Leia dois números inteiros (dividendo e divisor, respectivamente) e exiba a divisão, a divisão inteira e//
//o resto da divisão destes números.//

import java.util.Scanner;

public class Exe7_1{
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
        
        int dividendo,divisor,inteira,resto;
        float divisao;
        
        System.out.println("Digite o dividendo:");
        dividendo = entrada.nextInt();
        
        System.out.println("Digite o divisor:");
        divisor = entrada.nextInt();
        
        divisao = (float) dividendo / divisor;
        
        System.out.println ("A divisão dá:" + divisao);
        
        inteira = dividendo / divisor;
        
        System.out.println ("O resultado inteiro é :" + inteira);
        
        resto = dividendo % divisor;
        
        System.out.println ("O resto é:" + resto);
    }
}