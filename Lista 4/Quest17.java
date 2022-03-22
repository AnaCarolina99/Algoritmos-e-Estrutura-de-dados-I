import java.util.Scanner;
public class Quest17{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      float IMC;
      byte incr = 0;
      byte number = 1;
      byte incr2 = 0;
      do
      {
      System.out.println("Digite o peso");
      float size = leia.nextFloat();
      System.out.println("Digite a altura");
      float height = leia.nextFloat();
      IMC = (size)/(height * height);
         if(IMC>=30)
         {
         incr2++;
         }
      number++;
      }while(number<=10);
      System.out.println("A quantidade de pessoas obesas eh : " + incr2);
   }
}