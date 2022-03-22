import java.util.Scanner;
public class Quest5{
   public static void main(String[] args){
   Scanner leia = new Scanner(System.in);
   System.out.println("Digite o primeiro lado do triangulo");
   short sideA = leia.nextShort();
   System.out.println("Digite o segundo lado do triangulo");
   short sideB = leia.nextShort();
   System.out.println("Digite o terceiro lado do triangulo");
   short sideC = leia.nextShort();
   if(sideA<sideB + sideC && sideB<sideA + sideC && sideC<sideB + sideA)
   {
   System.out.println("Forma um triangulo");
   }
   else
   {
   System.out.println("Nao forma um triangulo");
   }
   }
}