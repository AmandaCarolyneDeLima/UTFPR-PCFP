//Efetuar o cálculo do valor de uma prestação em atraso, utilizando a fórmula:
//prestação = valor + (valor * (taxa/100) * tempo)

import java.util.Scanner;

public class Exe13 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
        float prestacao = 0.0f, valor = 0.0f, taxa = 0.0f;
        int tempo = 0;
        
        System.out.println ("Qual o valor da prestação?: ");
        valor = entrada.nextFloat();
        
        System.out.println ("Qual o valor da taxa?: ");
        taxa = entrada.nextFloat();
        
        System.out.println ("Quantos dias está em atraso?: ");
        tempo = entrada.nextInt();
        
        prestacao = valor + (valor * (taxa/100.0f) * tempo);
        
        System.out.println ("O novo valor da prestação é: ");
        System.out.print (prestacao + String.format("%.2f", prestacao));
    }
}