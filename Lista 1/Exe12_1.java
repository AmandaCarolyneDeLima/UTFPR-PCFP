//Ler um número inteiro e imprimir seu sucessor e seu antecessor.//

import java.util.Scanner;

public class Exe12_1{
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);
        
        int a,sucessor,antecessor;  
        
        System.out.println("Digite seu número:");
        a = entrada.nextInt();
        
        antecessor = a - 1;
        sucessor = a + 1;
        
        System.out.println("O antecessor é:" + antecessor);
        System.out.println("E seu sucessir é:" + sucessor);
    }
}