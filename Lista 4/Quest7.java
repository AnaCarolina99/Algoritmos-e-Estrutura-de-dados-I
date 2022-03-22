import java.util.Scanner;
public class Quest7{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite um numero para se verificar se eh perfeito ou nao");
      short number = leia.nextShort();
      byte some = 0;
         for(int i = 1;i<number;i++)
         {
            if(number % i == 0)
            {  
              some += i;
            }
         }
               if(some==number)
                 {
                  System.out.println("O numero " + number + " eh perfeito ");
                  }
            else
            {
               System.out.println("O numero " + number + " nao eh perfeito ");
            }        
   }
}