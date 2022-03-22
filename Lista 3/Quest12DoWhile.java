import java.util.Scanner;
public class Quest12DoWhile{
   public static void main(String[] args){
   Scanner leia = new Scanner (System.in);
   short base, height;
   do
   {
   System.out.println("");
   System.out.println("Digite a base");
    base = leia.nextShort();
   System.out.println("Digite a altura");
    height = leia.nextShort();
   System.out.println("O Perimetro eh : " +(base*2 + height*2));
   System.out.println("A Area eh : " +(base*height));
    }while (base>0);
   }
}