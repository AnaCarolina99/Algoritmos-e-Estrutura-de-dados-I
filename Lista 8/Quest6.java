import java.util.Scanner;
public class Quest6{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Imforme a quantidade de linhas");
      int n = leia.nextInt();
      System.out.println("Imforme a quantidade de colunas");
      int m = leia.nextInt();
      int[][]VET = new int[n][m];
         
         int met[] = new int [VET.length];
         met=Met(VET,n,m);
         
   }
   
   
   public static int [] Met(int[][] VET, int n, int m){
   Scanner leia = new Scanner (System.in);
   int[] VET2 = new int[VET.length];
   int d = 0;
      if(n == m)
      {
            
             for(int i = 0; i < VET.length ; i++)
               {
                  
                  for(int j = 0; j < VET[i].length ; j++)
                  {
                  System.out.print("Digite o valor na posicao ("+(i+1)+","+(j+1)+"):");
                  VET[i][j] = leia.nextInt();  
                   }  
                  
               } 
               d = 0;
                   for(int i = 0; i < VET.length ; i++)
                     {
                  for(int j = 0; j < VET[0].length ; j++)
                  {
                        if(i == j)
                        {
                        VET2[d] = VET[i][j];
                        System.out.print(VET2[d] + " \t ");
                        d++;
                        }
                   }
                     
                  System.out.println();
               } 
               
                 
         }
         
         else if(n != m)
         {
            for(int i = 0; i < VET.length ; i++)
                     {
                  for(int j = 0; j < VET[0].length ; j++)
                  {
                        VET[i][j] = 0;
                   }
                 }  
                   
                   for(int i = 0; i < VET.length ; i++)
                 {
                  for(int j = 0; j < VET[0].length ; j++)
                  {
                     System.out.print(VET[i][j] + " ");
                   }
                     
                  System.out.println();
               } 
         }
            return VET2;
      }
   
}
