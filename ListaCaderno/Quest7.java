import java.util.Scanner;
import java.util.Random;
public class Quest7{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite o tamanho do vetor");
      int n = leia.nextInt();
        int top = Prench(n);
        System.out.println();
        System.out.println("A opcao escolhida foi a " + top);
   }
      public static int Prench(int n){
         Scanner leia = new Scanner (System.in);
         int VET[] = new int[n];
         Random r = new Random();
         System.out.println("Digite '0' para ordem crescente, '1' para ordem decrescente e '2' para o aleatorio"); 
         byte op = leia.nextByte();
      
         if(op == 0)
         {
                 for(int i = 0; i < VET.length;i++)
               {
                  VET[i] = i;
               }
               
               for(int i = 0; i < VET.length;i++)
               {
                  System.out.print(VET[i]+ "  ");
               }
         }
         
         if(op == 1)
         {
                for(int i = 0; i < VET.length;i++)
               {
                  VET[i] = i;
               }
               
                for(int i = VET.length - 1 ; i >=0;i--)
               {
                  System.out.print(VET[i]+ "  ");
               }
               
               
         }
         
         if(op ==2)
         {
               for(int i = 0; i < VET.length;i++)
               {
                  VET[i] = r.nextInt();
               }   
               
                  for(int i = VET.length - 1 ; i >=0;i--)
               {
                  System.out.print(VET[i]+ "  ");
               }
               
         }
         if(op>=3)
         System.out.println("Opcao inexistente");

        return op;

      }
 }