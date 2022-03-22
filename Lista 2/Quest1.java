import java.util.Scanner;
public class Quest1{
   public static void main(String[] args){
   Scanner leia = new Scanner(System.in);
   System.out.println("Digite um numero");
   short number = leia.nextShort();
   if(number<0)
   {
   System.out.println("Numero negativo");
   }
   else
   {
   System.out.println("Numero positivo");
   }
   
   }
}