import java.util.Scanner;
public class Quest10{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite um numero");
      int n = leia.nextInt();
         double number = Cub(n);
         System.out.println("A raiz cubica de " + n + " vale " + number);
   }
   
  public static double Cub(int n){
  double cub = Math.cbrt(n);
  return cub ;
  }
}