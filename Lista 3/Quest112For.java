import java.util.Scanner;
public class Quest112For{
public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        byte quanti;
        do
        {
          System.out.println("Digite a quantidade: ");
        quanti = leia.nextByte(); 
        }while(quanti<1 || quanti>10);   
           for (byte i = 1;i <= quanti;i++) {
               for (byte j = 1;j <= i;j++) {
                   System.out.print("*");
               }
               System.out.println();
           }
        }   
     }