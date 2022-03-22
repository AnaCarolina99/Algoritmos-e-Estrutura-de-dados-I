import java.util.Scanner;
public class Quest112DoWhile{
public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        byte quanti,i,j;
        i= 1;
        j=1;
        do
        {
          System.out.println("Digite a quantidade: ");
        quanti = leia.nextByte(); 
        }while(quanti<1 || quanti>10); 
         do
         {
         j=0;
            do
            {
            j++;
            System.out.print("*");
            }while(j<i);
            System.out.println();
            i++;
         }while(i<=quanti);  
       }   
  }