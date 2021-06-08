//Entrar com um número no formato CDU e imprimi-lo invertido: UDC. Por exemplo: 123 sairá 321. O
//número deverá ser armazenado em outra variável antes de ser impresso.

import java.util.Scanner;

public class Exe2 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
        int n = 0, c = 0, d = 0, u = 0, nf = 0;
        
        System.out.println ("Digite seu número: ");
        n = entrada.nextInt();
        
        c = n / 100;
        d = (n % 100) / 10;
        u = n%10;
        nf = (u*100) + (d*10) + c;
        
        System.out.print("Seu número agora é: ");
        System.out.println (nf);
    }
}