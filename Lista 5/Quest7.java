import java.util.Scanner;
public class Quest7{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite o numero do denominador");
      short n = leia.nextShort();
      float some = 0;
         for(int i = 1; i<=n ; i++)
         {
            some+= (float) 1/i;
         }
         System.out.println("O valor de H = " + some);
   }
}