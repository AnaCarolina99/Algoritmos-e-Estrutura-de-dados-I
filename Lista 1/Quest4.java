import java.util.Scanner;
public class Quest4{
   public static void main(String[]args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite o coeficiente a");
      int a = leia.nextInt();
     System.out.println("Digite o coeficiente b");
      int b = leia.nextInt();
      System.out.println("Digite o coeficiente c");
      int c = leia.nextInt();
      int delta = b*b -(4*a*c);
      System.out.println("O valor de Delta eh:" +delta);
   }
}