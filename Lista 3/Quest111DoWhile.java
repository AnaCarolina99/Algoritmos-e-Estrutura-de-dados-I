import java.util.Scanner;
public class Quest111DoWhile{
   public static void main(String[] args){
   Scanner leia = new Scanner (System.in);
   System.out.println("Digite o numero para calcular sua tabuada");
   byte number = leia.nextByte();
   System.out.println("Tabuada do numero " + number);
   int tab;
   byte incr = 0;
   do
   {
     incr++;
    tab =(byte) number*incr;
    System.out.println(number + " X " + incr + " = " + tab);
   }while(incr<10);
   }
}