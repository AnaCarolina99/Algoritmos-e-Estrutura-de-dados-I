package puc;
import java.util.Scanner;
public class Quest3{
   public static void main(String[]args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite a base do retangulo");
      float base = leia.nextFloat();
      System.out.println("Digite a altura do retangulo");
      float altura = leia.nextFloat();
      float perimetro = (base*2)+(2*altura);
      float area = base * altura;
      System.out.println("O seu perimetro eh: " +perimetro);
      System.out.println("A sua area eh: " +area);
   }
}