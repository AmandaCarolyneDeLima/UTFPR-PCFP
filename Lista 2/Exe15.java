//As locadoras de videogame ainda contam com um saudoso público que recusa os emuladores e não
//dispensa a sensação de soprar as fitas para funcionarem. Criar um aplicativo que leia a quantidade
//de títulos (fitas e discos) que uma saudosa locadora de videogames possui e o valor que ela cobra
//por cada aluguel, mostrando as informações pedidas a seguir:
//– Sabendo que um terço dos títulos são alugados por mês, exiba o faturamento anual da locadora;
//– Quando o cliente atrasa a entrega, é cobrada uma multa de 10% sobre o valor do aluguel.
//Sabendo que um décimo dos títulos alugados no mês são devolvidos com atraso, calcule o valor
//ganho com multas por mês;
//– Sabendo ainda que 2% dos títulos se estragam ao longo do ano, e um décimo do total é
//comprado para reposição, exiba a quantidade de títulos que a locadora terá no final do ano.

import java.util.Scanner;

public class Exe15 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);
        
        int qfitas = 0, repor = 0;
        float valor = 0.0f, faturamento = 0.0f,multa = 0.0f;
        
        System.out.println ("Qual a quantidade de fitas em seu estabelecimento?: ");
        qfitas = entrada.nextInt();
        
        System.out.println ("Qual o valor do aluguel?: ");
        valor = entrada.nextFloat();
        
        faturamento = ((qfitas / 3.0f) * valor) * 12.0f;
        multa = (valor * 1.1f) * (qfitas / 10.0f) * 30.0f;
        repor = (int) (qfitas * 0.98) + (qfitas / 10);
        
        System.out.println ("Faturamento anual: " + faturamento + String.format("%.2f", faturamento));
        System.out.println ("Multa mensal: " + multa + String.format("%.2f", multa));
        System.out.println ("Reposição: " + repor);
    }
}