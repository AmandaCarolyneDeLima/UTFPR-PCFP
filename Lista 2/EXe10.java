//Idem ao anterior, mas para uma PG. Use o método Math.pow().

import java.util.Scanner;

public class EXe10 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        
      int primeiro = 0, razao = 0, decimo = 0;
      
      System.out.print("Digite o primeiro termo da PG: ");
      primeiro = entrada.nextInt();

      System.out.print("Digite a razão da PG: ");
      razao = entrada.nextInt();

      decimo = primeiro * (int) Math.pow(razao, 9);
      
      System.out.println("Décimo termo: " + decimo);
    }
}