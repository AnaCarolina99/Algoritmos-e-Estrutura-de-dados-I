import java.util.Scanner;
public class Quest4{
   public static void main(String[] args){
   Scanner leia = new Scanner(System.in);
   System.out.println("Digite um numero");
   short number = leia.nextShort();
   if(number<0)
   {
   System.out.println("Numero negativo");
   }
   if(number==0)
   {
   System.out.println("Numero nulo");
   }
  if(number>0)
  {
  System.out.println("Numero positivo");
  }
   
   }
}