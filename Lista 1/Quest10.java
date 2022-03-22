import java.util.Scanner;
public class Quest10{
   public static void main(String[]args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite o valor que sera aplicado ");
      double money = leia.nextDouble();
      System.out.println("Digite os juros ");
      double month = leia.nextDouble();
      double app = money * (month/100);
      System.out.println("O rendimento eh de " +app);
   }
}

