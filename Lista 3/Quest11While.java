import java.util.Scanner;
public class Quest11While{
   public static void main(String[] args){
   Scanner leia = new Scanner (System.in);
   System.out.println("Digite a quantidade de vezes");
   byte inc = leia.nextByte();
    while (1<=inc){
    System.out.println("");
     System.out.println("Digite a base");
   short base = leia.nextShort();
   System.out.println("Digite a altura");
   short height = leia.nextShort();
   System.out.println("O Perimetro eh : " +(base*2 + height*2));
   System.out.println("A Area eh : " +(base*height));
   inc--;
   }  
   }
}
