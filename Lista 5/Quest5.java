import java.util.Scanner;
public class Quest5{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite o numero para fatorar");
      short fat = leia.nextShort();
      short top = 1;
         for(int i = 1; i<=fat ; i++)
         {
         top *= i ;
         }
         System.out.println("O fatorial vale " +top);
   }
}