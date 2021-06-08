//Ler dois valores para as variáveis A e B, respectivamente. Efetuar a troca dos valores de forma que
//a variável A passe a ter o valor da variável B e que a variável B passe a ter o valor da variável A.
//Considere A e B como variáveis do tipo texto. Apresente os valores trocados.

import java.util.Scanner;

public class Exe14 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
        String a, b, c;
        
        System.out.println ("Digite a primeira palavra: ");
        a = entrada.next();
        
        System.out.println ("Digite a segunda palavra: ");
        b = entrada.next();
        
        c = a;
        a = b;
        
        System.out.println ("Agora a primeira palavra é: " + c);
        System.out.println ("E a segunda palavra é: " + a);
    }
}