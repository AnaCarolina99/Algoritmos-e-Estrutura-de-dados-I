import java.util.Scanner;
public class Quest2{
   public static void main(String[] args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite o numero limite");
      int n = leia.nextInt();
      int top = Recu(n);
      int top1 = Ite(n);
      System.out.println(top); 
      System.out.println(top1);  
      }
      //Recursivo
      public static int Recu(int n){
         if(n == 0 || n == 1)
         return 1;
         else
         return Recu(n-1) * n;
      }
      //Iterativo
      public static int Ite(int n){
         int fat = 1;
         for(int i = 1;i<=n;i++){
            fat *= i;
         }
         return fat;
      } 
      //O numero limite é 31
       
}