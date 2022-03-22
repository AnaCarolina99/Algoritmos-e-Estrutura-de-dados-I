import java.util.Scanner;
public class Quest7{
   public static void main(String[]args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite o coeficiente a");
      double a = leia.nextInt();
     System.out.println("Digite o coeficiente b");
      double b = leia.nextInt();
      System.out.println("Digite o coeficiente c");
      double c = leia.nextInt();
      double delta = b*b -(4*a*c);
      double delta2 = Math.sqrt(delta);
      System.out.println("O valor de Delta eh: " +delta);
      if(delta >=0)
      {
      double raiz1 =(double)(-(b) + delta2)/2*a;
      double raiz2 =(double)( -(b) - delta2)/2*a;
      System.out.println("A primeira raiz eh: " +raiz1+ " A segunda raiz eh: " +raiz2);
      }
      else
      {
      System.out.println("Delta negativo, raizes inexistentes");
      }
   }
}