import java.util.Scanner;
public class Quest6{
   public static void main(String[] args){
   Scanner leia = new Scanner(System.in);
   System.out.println("Digite o primeiro lado do triangulo");
   short sideA = leia.nextShort();
   System.out.println("Digite o segundo lado do triangulo");
   short sideB = leia.nextShort();
   System.out.println("Digite o terceiro lado do triangulo");
   short sideC = leia.nextShort();
    if(sideA>sideB + sideC && sideB>sideA + sideC && sideC>sideB + sideA)
   {
      System.out.println("Triangulo inexistente");
   }
   else{
         if(sideA==sideB && sideB==sideC && sideC==sideA)
         {
         System.out.println("Triangulo equilatero");
         }
          if(sideA!=sideB && sideB!=sideC && sideC!=sideA)
         {
         System.out.println("Triangulo escaleno");
         }
         if(sideA==sideB && sideB!=sideC || sideB==sideC && sideC!=sideA || sideC==sideA && sideA!=sideB)
         {
         System.out.println("Triangulo isosceles");
         }
       }  
   }
}