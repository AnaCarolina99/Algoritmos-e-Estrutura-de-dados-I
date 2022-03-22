import java.util.Scanner;
public class Quest9{
   public static void main(String[] args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite o numero para verificar se é perfeito ou nao");
      int n = leia.nextInt();
      int Met = Perfect(n);
   }
   
   public static int Perfect(int n){
      int some = 0;
       if(n % 2 == 0)
       some += n;
       
       if(some == n)
         System.out.println("Eh perfeito");
       return n;
         
   }
}