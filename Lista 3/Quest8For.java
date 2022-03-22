import java.util.Scanner;
public class Quest8For{
   public static void main(String[] args){
   Scanner leia = new Scanner (System.in);
   System.out.println("Digite o valor inicial da base");
   short x1 = leia.nextShort();
   System.out.println("Digite o valor final da base");
   short y1 = leia.nextShort();
   System.out.println("Digite o passo da base");
   short p1 = leia.nextShort();
   System.out.println("Digite o valor inicial da altura");
   short x2 = leia.nextShort();
   System.out.println("Digite o valor final da altura");
   short y2 = leia.nextShort();
   System.out.println("Digite o passo da altura");
   short p2 = leia.nextShort();
   for(int i = x1;i<=y1;i+=p1)
   {
   System.out.println("");
   for(int j = x2;j<=y2;j+=p2)
   {
    System.out.println("A base de " + i + " e altura de " + j + " ,tem area igual a " + (j*i));
    System.out.println("A base de " + i + " e altura de " + j + " ,tem perimetro igual a " + ((2*j)+(2*i)));
    }
   }
   }
}