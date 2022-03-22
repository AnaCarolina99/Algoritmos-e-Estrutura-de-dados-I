import java.util.Scanner;
public class Quest3{
   public static void main(String[] args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite o dia");
      byte day = leia.nextByte();
      System.out.println("Digite o mes");
      byte mounth = leia.nextByte();
      System.out.println("Digite o ano");
      int year = leia.nextInt();
      Data x = new Data(day,mounth,year);
      System.out.println(x.Status());

   }
}