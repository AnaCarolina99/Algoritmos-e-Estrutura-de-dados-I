import java.util.Scanner;
public class Quest9{
   public static void main(String[]args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite o valor que sera aplicado ");
      double money = leia.nextDouble();
      System.out.println("Digite a quantidade de meses ");
      double month = leia.nextDouble();
      double app = money * month * 0.0113;
      System.out.println("A quantida de dinheiro aplicado em " +month+ " meses eh de:" +app);
   }
}

