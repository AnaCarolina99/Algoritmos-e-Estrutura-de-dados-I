import java.util.Scanner;
public class Quest4DoWhile{
   public static void main(String[] args){
   Scanner leia = new Scanner (System.in);
   double math;
   System.out.println("Digite o valor inicial ");
   short x1 = leia.nextShort();
   System.out.println("Digite o valor final ");
   short y1 = leia.nextShort();
   System.out.println("Digite o passo ");
   short p1 = leia.nextShort();
      do
      {
      math=  Math.PI*Math.pow(x1,2);
       System.out.println(" A area do raio " + x1 + " eh de " + math);
      x1+=p1;
      }while(x1<=y1);
    }
}