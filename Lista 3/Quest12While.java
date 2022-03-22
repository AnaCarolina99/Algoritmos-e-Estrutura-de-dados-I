import java.util.Scanner;
public class Quest12While{
   public static void main(String[] args){
   Scanner leia = new Scanner (System.in);
   short base,height;
   System.out.println("");
     System.out.println("Digite a base");
    base = leia.nextShort();
   System.out.println("Digite a altura");
    height = leia.nextShort();
    while (base>0){
     System.out.println("");
     System.out.println("Digite a base");
    base = leia.nextShort();
   System.out.println("Digite a altura");
    height = leia.nextShort();
   System.out.println("O Perimetro eh : " +(base*2 + height*2));
   System.out.println("A Area eh : " +(base*height));
   }  
   }
}
