import java.util.Scanner;
public class Quest10{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite o valor para se fatorar");
      int b = leia.nextInt();
      int Met = Some(b);
      System.out.println(b + "! = " +Met);
    }
    
    public static int Some(int b){
            int fat = 1;
            for(int i = 1; i<=b;i++)
            fat *= i;
            
            return fat;
         } 

}