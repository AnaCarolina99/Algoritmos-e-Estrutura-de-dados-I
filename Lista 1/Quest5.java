import java.util.Scanner;
public class Quest5{
   public static void main(String[]args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite o raio da circunferencia");
      double r = leia.nextDouble();
      double cir = 2*r*Math.PI;
      System.out.println("O comprimento da circunferencia eh:" +cir);
   }
}