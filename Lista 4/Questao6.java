import java.util.Scanner;
public class Questao6{
 public static void main(String[]args){
   Scanner leia = new Scanner(System.in);
   System.out.print("Digite um numero");
   int x = leia.nextInt();
   System.out.print("Digite um numero");
   int y = leia.nextInt();
      for(int j=0;x<=y;x++){
         for (int i = 2; i <= x; i++) {
            if (x % i == 0 && i != x)
               {
               }  
            else
            { 
              System.out.print(x);
            } 
         }
      } 
  }
}