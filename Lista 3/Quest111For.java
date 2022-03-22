import java.util.Scanner;
public class Quest111For{
   public static void main(String[] args){
   Scanner leia = new Scanner (System.in);
   System.out.println("Digite o numero para calcular sua tabuada");
   byte number = leia.nextByte();
   System.out.println("Tabuada do numero " + number);
   int tab;
   for(int i = 1;i<=10;i++)
   {
    tab =(byte) number*i;
    System.out.println(number + " X " + i + " = " + tab);
   }
   }
}