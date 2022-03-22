import java.util.Scanner;
public class Quest8{
 public static void main(String[]args){
   Scanner leia = new Scanner(System.in);
   System.out.println("Digite o valor minimo do intervalo ");
   int x = leia.nextInt();
   System.out.println("Digite o valor maximo do intervalo ");
   int y = leia.nextInt();
      for(int j=0;x<=y;x++){
         int some = 0;
       for(int i=1;i<x;i++){
         if(x%i==0)  
            some+=i;
       }
      if(some==x)
         System.out.print(" Eh numero perfeito " +x);          
      } 
  }
}