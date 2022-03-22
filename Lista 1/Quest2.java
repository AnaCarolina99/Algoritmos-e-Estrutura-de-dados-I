import java.util.Scanner;
public class Quest2{
   public static void main(String[]args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite o lado do quadrado");
      System.out.println("Para encontrar o seu perimetro");
      float lado = leia.nextFloat();
      float perimetro = (lado*4);
      System.out.println("O seu perimetro eh: " +perimetro);
   }
}