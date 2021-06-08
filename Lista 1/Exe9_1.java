//Leia um valor inteiro e mostre seu inverso. O inverso de x é 1/x.//

import java.util.Scanner;
 
public class Exe9_1{
   public static void main (String[] args)   
   {
      Scanner entrada = new Scanner(System.in);

      int x;
      float inverso;

      x = 0;
      inverso = 0.0f;

      System.out.print("Digite um numero inteiro: ");
      x = entrada.nextInt();

      inverso = (float) 1/x;

      System.out.println();
      System.out.println("O inverso é: " + inverso);
   }
}