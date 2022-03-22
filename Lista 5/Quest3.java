import java.util.Scanner;
public class Quest3{
   public static void main(String[]args){
      int X,
          Y,
          rest,
          cond=0;      
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
         if(X >= Y)
         {
            rest = X - Y;
            while(rest > 0 && cond == 0)
            {
               rest = rest - Y;
               if(rest < 0)
               {
                  rest = rest + Y;
                  cond = 1;
               }
            }             
         }   
         else
            rest = 0;
         System.out.println("Resto vale = "+ rest);
      }      
   }
}