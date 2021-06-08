//Entrar com a base a a altura de um retângulo e imprimir respectivamente o perímetro e a área
//correspondente. Essas fórmulas podem ser encontradas na Wikipédia.

import java.util.Scanner;

public class Exe4 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
        float base = 0.0f, altura = 0.0f, area = 0.0f, perimetro = 0.0f;
        
        System.out.println ("Qual o tamanho da base do retângulo: ");
        base = entrada.nextFloat();
        
        System.out.println ("Qual a altura do retângulo: ");
        altura = entrada.nextFloat();
        
        area = base*altura;
        perimetro = (2.0f*base) + (2.0f*altura);
        
        System.out.print("A área do seu retângulo é: ");
        System.out.println (area);
        
        System.out.print ("O perímetro do retângulo é: ");
        System.out.println(perimetro);
    }
}