import java.util.Scanner;
public class Quest1While{
   public static void main(String[] args){
   Scanner leia = new Scanner (System.in);
   byte inc = 1;
    while (inc<=10){
    System.out.println("");
     System.out.println("Digite a base");
   short base = leia.nextShort();
   System.out.println("Digite a altura");
   short height = leia.nextShort();
   System.out.println("O Perimetro eh : " +(base*2 + height*2));
   System.out.println("A Area eh : " +(base*height));
   inc++;
   }  
   }
}
