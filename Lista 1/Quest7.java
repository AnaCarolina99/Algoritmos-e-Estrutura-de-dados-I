import java.util.Scanner;
public class Quest7{
   public static void main(String[]args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite o cateto 1 do triangulo retangulo ");
      double cateto1 = leia.nextFloat();
      System.out.println("Digite o cateto 2 do triangulo retangulo");
      double cateto2 = leia.nextFloat();
      double hipo = Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
      System.out.println(" A Hipotenusa do triangulo reatangulo eh:" +hipo);
   }
}