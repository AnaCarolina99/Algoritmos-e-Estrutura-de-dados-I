import java.util.Scanner;
public class Quest4{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite um numero para se verificar primo ou nao");
      short number = leia.nextShort();
      byte incr = 0;
         for(int i = 1;i<=number;i++)
         {
            if(number % i == 0)
            {
            incr++;
            }
         }
            if(incr==2)
            {
            System.out.println("Numero primo");
            }else 
            {
            System.out.println("Numero nao primo");
            }        
   }
}