import java.util.Scanner;
public class Quest2{
   public static void main(String[] args){
   Scanner leia = new Scanner(System.in);
   System.out.println("Digite um numero");
   short number = leia.nextShort();
   if(number%2==0)
   {
   System.out.println("Numero par");
   }
   else
   {
   System.out.println("Numero impar");
   }
   
   }
}