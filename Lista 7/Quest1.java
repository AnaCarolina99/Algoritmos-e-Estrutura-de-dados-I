import java.util.Scanner;
public class Quest1{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      int[][] VET = new int[3][3];
         for(int i = 0; i < VET.length ; i++)
         {
            for(int j = 0; j < VET[i].length ; j++)
            {
               System.out.println("Digite o numero da linha " + (i+1) + " e coluna " + (j+1));
               VET[i][j] = leia.nextInt();
            }
         }
 
         for(int i = 0; i < VET.length ; i++)
         {
            for(int j = 0; j < VET[i].length ; j++)
            {
               System.out.print(VET[i][j] + " ");
                               
            }
            System.out.println();
         }
         
   }
}