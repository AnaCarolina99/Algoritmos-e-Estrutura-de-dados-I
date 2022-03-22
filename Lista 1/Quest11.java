import java.util.Scanner;
public class Quest11{
   public static void main(String[]args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite o valor a vista ");
      double money = leia.nextDouble();
      double app = money *0.92;
      System.out.println("O desconto eh de " +app);
   }
}



