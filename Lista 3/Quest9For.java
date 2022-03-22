import java.util.Scanner;
public class Quest9For{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite o coeficiente a");
      short a = leia.nextShort();
      System.out.println("Digite o coeficiente b");
      short b = leia.nextShort();
      System.out.println("Digite o coeficiente c");
      short c = leia.nextShort();
      System.out.println("Digite o inicio de X");
      short x1 = leia.nextShort();
      System.out.println("Digite o final de X");
      short x2 = leia.nextShort();
      int equ;
         for(int i =x1;i<=x2;i++)
         {
         equ = (short) (a*Math.pow(i,2)) + (b*i) + c;
         System.out.println("O coeficiente a vale " + a + " O coeficiente b vale " + b + 
         " O coeficiente c vale " + c + " O X vale " + i + " A equaçao y vale " + equ);
         }
   }

}