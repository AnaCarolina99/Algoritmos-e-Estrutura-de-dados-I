import java.util.Scanner;
public class Quest3{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      int[][] VET = new int[7][7];
         for(int i = 0; i < VET.length ; i++)
         {
            for(int j = 0; j < VET[i].length ; j++)
            {
               VET[i][j] = (2*i - 1) + j;
            }
         }
         for(int i = 0; i < VET.length ; i++)
         {
            for(int j = 0; j < VET[i].length ; j++)
            {
               if(i == j)
               System.out.print(VET[i][j] + "\t");
            }
            System.out.println();
         }
         
   }
}