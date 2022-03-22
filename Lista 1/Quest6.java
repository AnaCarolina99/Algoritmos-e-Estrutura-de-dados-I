import java.util.Scanner;
public class Quest6{
   public static void main(String[]args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite o raio da circunferencia");
      double r = leia.nextFloat();
      double cir = Math.pow(r,2)*Math.PI;
      System.out.println(" A Area da circunferencia eh:" +cir);
   }
}