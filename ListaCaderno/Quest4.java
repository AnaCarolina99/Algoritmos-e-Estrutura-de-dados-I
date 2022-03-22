import java.util.Scanner;
public class Quest4{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite o tamanho da linha");
      int n = leia.nextInt();
      System.out.println("Digite o tamanho da coluna");
      int m = leia.nextInt();
      int VET[][] = new int[n][m]; 
         for(int i = 0; i<VET.length ;i++)
            for(int j = 0; j<VET[i].length ;j++)
            {
               System.out.println("Digite o numero da linha " + (i+1) + " de coluna " + (1+j));
               VET[i][j] = leia.nextInt();
            }
         int top = Some(VET);
         System.out.println("A soma das matrizes eh de " +top);
   }
   public static int Some(int VET[][]){
         int some = 0;
               for(int i = 0; i<VET.length ;i++)
               {
            for(int j = 0; j<VET[i].length ;j++)
            {
               some += VET[i][j];
            }
               }
               return some;
          
   }
 }