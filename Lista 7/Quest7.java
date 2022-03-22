import java.util.Scanner;
public class Quest7{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      int[][] VET = new int[5][5];
      int some = 0;
         for(int i = 0; i < VET.length ; i++)
         {
            for(int j = 0; j < VET[i].length ; j++)
            {
                  System.out.println("Digite o numero da linha " + i + " e coluna " + j);
                  VET[i][j] = leia.nextInt();
                  if(i < j)
                  {
                     some += VET[i][j];
                     System.out.println(VET[i][j]);
                  }
                  
            }
         }
         System.out.println("A soma vale " + some);
   }
}