import java.util.Scanner;
public class Quest6{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite o numero comeco");
      short begin = leia.nextShort();
      System.out.println("Digite o numero final");
      short end = leia.nextShort();
      byte incr = 0;
         for(int i = begin;i<=end;i++)
         {
            if(begin % i == 0)
            {
            incr++;
                if(incr==2)
               {
               System.out.println("Numero primo : " + i);
               }
            }
         }       
   }
}