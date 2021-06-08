//Antes do racionamento de energia ser decretado, quase ninguém falava de quilowatts; mas agora,
//todos incorporaram essa palavra em seu vocabulário. Sabendo-se que 100 quilowatts de energia
//custa um sétimo de salário mínimo, fazer um aplicativo que receba o valor do salário mínimo e a
//quantidade de quilowatts gasta por uma residência, calcule e imprima:
//– o valor em reais de cada quilowatt;
//– o valor em reais a ser pago;
//– o novo valor a ser pago por essa residência com um desconto de 10%.

import java.util.Scanner;

public class Exe3 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
        float valorcadaqw = 0.0f,valorconta = 0.0f, desconto = 0.0f, salario = 0.0f;
        int qw = 0;
        
        System.out.println ("Quanto é seu salário?: ");
        salario = entrada.nextFloat();
        
        System.out.println ("Quantos quilowatts foram gastos?: ");
        qw = entrada.nextInt();
        
        valorcadaqw = (salario / 7.0f) / 100.0f;
        valorconta = valorcadaqw * qw;
        desconto = valorconta*0.1f;
        
        System.out.print("Valor de cada quilowatts: ");
        System.out.println(valorcadaqw);
        
        System.out.print("Valor da conta: ");
        System.out.println(valorconta);
        
        System.out.print("Valor da conta com desconto: ");
        System.out.println(desconto);
    }
}