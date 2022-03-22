import java.util.Scanner;
public class Quest4{
   public static void main(String[]args){
      int X,
          Y,
          quoc = 0,
          div,
          cond = 0;      
      Scanner leia = new Scanner(System.in);
      
         do
         {
         System.out.println("Digite o valor de A");
         X = leia.nextInt();
            if(X<0)
               System.out.println("Numero invalido");
         }while(X<0);
         
         do
         {
         System.out.println("Digite o valor de B");
         Y = leia.nextInt();
            if(Y<0)
               System.out.println("Numero invalido");
         }while(Y<0);
         if(Y == 0)
            System.out.println("Erro, divisao por 0");
         else
         {   
            div = X;
   
            while(div > 0 && cond == 0)
            {
               quoc++;
               div = div - Y;
               if(div < 0)
               {
                  div = div + Y;
                  cond = 1;
                  quoc--;
               }
            } 
                   System.out.print("\nQuociente= "+quoc);            
         }   
      }      
   }