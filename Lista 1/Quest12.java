
import java.util.Scanner;
public class Quest12{
   public static void main(String[]args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite o valor a vista ");
      float money = leia.nextFloat();
      System.out.println("Digite a quantidade de periodos ");
      short t = leia.nextShort();
      byte i = 12;
      float app = (float)money *i*t/100;
      System.out.println("O valor das parcelas no total sao " +app+ " , feito em " +t+ " prestacoes");
      System.out.println("O valor total da compra eh " +(app+money));
   }
}

