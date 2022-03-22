import java.util.Scanner;
public class Quest18{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      float IMC;
      byte incr = 0;
      byte number = 1;
      byte IMC1 = 0;
      byte IMC2 = 0;
      byte IMC3 = 0;
         do
         {
            System.out.println("Digite o peso");
            float size = leia.nextFloat();
            System.out.println("Digite a altura");
            float height = leia.nextFloat();
            IMC = (size)/(height * height);
               if(IMC>25)
               {
               IMC1++;
               }
               if(IMC<20)
               {
               IMC2++;
               }
               if(IMC<=25 && IMC>=20)
               {
               IMC3++;
               }

            number++;
         }while(number<=10);
            System.out.println("A quantidade de pessoas acima do peso eh : " + IMC1);
            System.out.println("A quantidade de pessoas abaixo do peso eh : " + IMC2);
            System.out.println("A quantidade de pessoas no peso ideal eh : " + IMC3);
   }
}