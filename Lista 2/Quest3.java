import java.util.Scanner;
public class Quest3{
   public static void main(String[] args){
   Scanner leia = new Scanner(System.in);
   System.out.println("Digite um numero");
   short number = leia.nextShort();
   if(number%5==0)
   {
   System.out.println("Numero divisivel por 5");
   }
   else
   {
   System.out.println("Numero nao divisel por 5");
   }
      if(number%7==0)
   {
   System.out.println("Numero divisivel por 7");
   }
   else
   {
   System.out.println("Numero nao divisel por 7");
   }
   
   }
}