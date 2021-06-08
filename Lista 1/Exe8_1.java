//Leia as notas de quatro provas de um concurso: Matemática, Português, Conhecimentos Gerais e//
//Informática. Calcule e exiba a média ponderada tendo Matemática como peso 2.//

import java.util.Scanner;

public class Exe8_1{
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
        
        float mat,pt,cg,inf,media;
        
        System.out.println ("Sua nota de matemática:");
        mat = entrada.nextFloat();
        
        System.out.println("Sua nota de português:");
        pt = entrada.nextFloat();
        
        System.out.println("Sua nota de conhecimento gerais:");
        cg = entrada.nextFloat();
        
        System.out.println("Sua nota de informática:");
        inf = entrada.nextFloat();
        
        media = ((mat*2) + pt + cg + inf)/5;
        
        System.out.print ("Sua média ponderada é:" + media);
    }
}