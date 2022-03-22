import java.util.Scanner;
public class Quest8{
   public static void main(String[]args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite o ponto X1 ");
      double x1 = leia.nextDouble();
      System.out.println("Digite o ponto Y1 ");
      double y1 = leia.nextDouble();
      System.out.println("Digite o ponto X2 ");
      double x2 = leia.nextDouble();
      System.out.println("Digite o ponto Y2 ");
      double y2 = leia.nextDouble();
      double dist = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
      System.out.println(" A Distancia dos dois pontos sao " +dist);
   }
}

