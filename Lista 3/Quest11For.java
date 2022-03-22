import java.util.Scanner;
public class Quest11For{
   public static void main(String[] args){
   Scanner leia = new Scanner (System.in);
   System.out.println("Digite a quantidade de vezes");
   byte inc = leia.nextByte();
   for(int i =1;i<=inc;i++)
   {
    System.out.println("");
    System.out.println("Digite a base");
   short base = leia.nextShort();
   System.out.println("Digite a altura");
   short height = leia.nextShort();
   System.out.println("O Perimetro eh : " +(base*2 + height*2));
   System.out.println("A Area eh : " +(base*height));   
   }
   }
}