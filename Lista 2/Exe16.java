//Criar um aplicativo que, dado um número de conta corrente com três dígitos, retorne o seu dígito
//verificador, o qual é calculado da seguinte maneira:
//Por exemplo, o número da conta é 235.
//– Somar o número da conta com o seu inverso: 235 + 532 = 767;
//– Multiplicar cada dígito pela sua ordem posicional (da esquerda para a direita) e somar estes
//resultados: 7*1 + 6*2 + 7*3 = 40;
//– O último dígito desse resultado é o dígito verificador da conta: último dígito de 40 é 0.

import java.util.Scanner;

public class Exe16 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
        int n = 0,c1 = 0, d1 = 0, u1 = 0, somaInverso = 0,c2 = 0, d2 = 0, u2 = 0, multiplicar = 0, dv = 0;
        
        System.out.println ("Número da conta: ");
        n = entrada.nextInt();
        
        c1 = n / 100;
        d1 = (n % 100) / 10;
        u1 = n%10;
        somaInverso = n + ((u1*100) + (d1*10) + c1);
        c2 = somaInverso / 100;
        d2 = (somaInverso % 100) / 10;
        u2 = somaInverso%10;
        multiplicar = c2 + (d2 * 2) + (u2 * 3);
        dv = multiplicar % 10; 
        
        System.out.println ("Digito verificador é: " + dv);
    }
}