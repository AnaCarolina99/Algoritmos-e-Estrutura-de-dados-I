import java.util.Scanner;
public class Quest5{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Imforme a quantidade de linhas");
      int a = leia.nextInt();
      System.out.println("Imforme a quantidade de colunas");
      int b = leia.nextInt();
      int some = a + b;
      int[][]VET = new int[2][2];
      int VET2[] = new int[4];
         for(int i = 0; i < VET.length ; i++)
         {
            for(int j = 0; j < VET.length ; j++)
            {
               System.out.println("Digite o numero da linha " + (i+1) + " e o numero da coluna " +(1+j));
               VET[i][j] = leia.nextInt();
            }   
         }
         
         int met = Met(VET,VET2);
         
   }
   
   
   public static int Met(int[][] VET, int[] VET2){
   int x = 0;
            for(int i = 0; i < VET.length ; i++)
         {
            for(int j = 0; j < VET.length ; j++)
            {
               
               VET2[x] = VET[i][j];
               x++;
               System.out.print(VET2[x]);
            }   
         }

   return x;
   
   }
}