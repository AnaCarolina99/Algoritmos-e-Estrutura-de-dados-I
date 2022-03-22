import java.util.Scanner;
public class Quest8{
   public static void main(String[] args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite o numero para verificar se eh primo");
      int n = leia.nextInt();
      int Met = Perfect(n);
   }
   
   public static int Perfect(int n){
      int quant = 0;
      for(int i = 1; i<= n; i++)
      {
       if(n % i == 0)
          quant++;
      }    
       
       if(quant == 2)
         System.out.println("Eh primo");
       return n;
         
   }
}