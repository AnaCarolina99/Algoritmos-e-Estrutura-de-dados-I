import java.util.Scanner;
public class Quest4For{
   public static void main(String[] args){
   Scanner leia = new Scanner (System.in);
   double math;
   System.out.println("Digite o valor inicial ");
   short x1 = leia.nextShort();
   System.out.println("Digite o valor final ");
   short y1 = leia.nextShort();
   System.out.println("Digite o passo ");
   short p1 = leia.nextShort();
   for(int i = x1;i<=y1;i+=p1)
   {
   math=  Math.PI*Math.pow(i,2);
    System.out.println(" A area dos raios eh de " + math);
   }
   }
}