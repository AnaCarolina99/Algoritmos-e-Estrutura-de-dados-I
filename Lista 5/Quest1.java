import java.util.Scanner;
public class Quest1{
   public static void main(String[] args){
   Scanner leia = new Scanner (System.in);
   System.out.println("Digite o primeiro numero");
   short a = leia.nextShort();
   System.out.println("Digite o segundo numero");
   short b = leia.nextShort();
   short some = 0 ;
      for(short i = 1 ; i <= b ; i++)
      {
         some += a;
      }
      System.out.println("O produto das somas sucessivas de " + a + " em " + b + " vezes, eh de " +some);
   }
}