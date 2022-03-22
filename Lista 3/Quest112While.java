import java.util.Scanner;
public class Quest112While{
public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        byte quanti,i,j;
        i= 1;
        j=1;
             System.out.println("Digite a quantidade: ");
           quanti = leia.nextByte(); 
           while(quanti<1 || quanti>10)
           {
           System.out.println("Digite a quantidade: ");
           quanti = leia.nextByte(); 
           }
           while(i<=quanti)
           {
           j=0;
            while(j<i)
            {
             j++;
             System.out.print("*");
            }
            System.out.println();
             i++;
           }
                
       }   
  }
