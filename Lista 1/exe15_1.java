//Fazer um algoritmo que possa entrar com o saldo de uma aplicação e ele imprima o novo saldo,
//considerando o reajuste de 1%.

import java.util.Scanner;

public class exe15_1 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
        float salario = 0.0f, ajust = 0.0f;
        
        System.out.print ("Digite o salário: ");
        salario = entrada.nextFloat();
        
        ajust = salario * 1.1f;
        
        System.out.print ("O novo salário é: ");
        System.out.println (ajust);
    }
}