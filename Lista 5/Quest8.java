import java.util.Scanner;
public class Quest8{
   public static void main(String[] args){
   Scanner leia = new Scanner (System.in);
   System.out.println("Digite o  numero de sequencias");
   short n = leia.nextShort();
   float some = 0;
   short sequence = 1;
      for(int i = 1 ; i <= n ; i++)
      {
       some += (float) i/Math.sqrt(sequence);
       sequence +=2;
      }
      System.out.println("O valor de L = " +some);
   }
}