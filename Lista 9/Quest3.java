import java.util.Scanner;
public class Quest3{
   public static void main(String[] args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite a quantidade da serie");
      int x = leia.nextInt();
      for(int i = 1;i<=x;i++)
      {
         System.out.println(Recu(i)); 
      }
      
      }
      
      public static int Recu(int n){
         if(n == 1 || n == 2)
         return 1;
         else
         return Recu(n-1) + Recu(n-2);
      }
   //O numero limite é 46
       
}