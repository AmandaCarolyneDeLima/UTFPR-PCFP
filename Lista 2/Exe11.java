//Em épocas de pouco dinheiro, os comerciantes estão procurando aumentar suas vendas oferecendo
//desconto. Faça um aplicativo que possa entrar com o valor de um produto e imprima o novo valor
//tendo em vista que o desconto foi de 9%.

import java.util.Scanner;

public class Exe11 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
        float valorproduto = 0.0f, produtofinal = 0.0f;
        
        System.out.println ("Qual o valor do produto atual?: ");
        valorproduto = entrada.nextFloat();
        
        produtofinal = valorproduto*0.91f;
        
        
        System.out.print ("Novo valor: ");
        System.out.println (produtofinal + String.format("%.2f ", produtofinal));
    }
}