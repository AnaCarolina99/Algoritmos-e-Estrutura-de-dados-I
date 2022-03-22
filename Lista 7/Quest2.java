import java.util.Scanner;
public class Quest2{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      int[][] VET = new int[3][3];
      int some = 0;
         for(int i = 0; i < VET.length ; i++)
         {
            for(int j = 0; j < VET[i].length ; j++)
            {
               System.out.println("Digite o numero da linha " + (i+1) + " e coluna " + (j+1));
               VET[i][j] = leia.nextInt();
               some += VET[i][j];
            }
         }
         for(int i = 0; i < VET.length ; i++)
         {
            for(int j = 0; j < VET[i].length ; j++)
            {
               System.out.print(VET[i][j] + "\t");
            }
            System.out.println();
         }
         
         System.out.println("A soma vale " +some);
   }
}