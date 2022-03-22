import java.util.Scanner;
public class Quest1{
   public static void main(String[]args){
     Scanner leia = new Scanner(System.in);
     System.out.println("Digite o lado do quadrado");     
     System.out.println("Para encontrar sua area");
      float lado = leia.nextFloat();
      float area = (lado*lado);
      System.out.println("A Area eh: " +area);  
 }
}