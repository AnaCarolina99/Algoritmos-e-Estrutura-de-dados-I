import java.util.Scanner;
public class Quest11{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite o valor de n");
      int n = leia.nextInt();
      int[][] VET = new int[n][n];
      int[][] VET2 = new int[n][n];
      int[][] VET3 = new int[n][n];
         for(int i = 0; i < VET.length ; i++)
         {
            for(int j = 0; j < VET[i].length ; j++)
            {     
                  System.out.println("Digite na primeira matriz o numero da linha " + i + " e coluna " + j);
                  VET[i][j] = leia.nextInt();
                                        
            }
                                    
         }
         
          for(int i = 0; i < VET2.length ; i++)
         {
            for(int j = 0; j < VET2[i].length ; j++)
            {     
                  System.out.println("Digite na segunda matriz o numero da linha " + i + " e coluna " + j);
                  VET2[i][j] = leia.nextInt();
                                        
            }
                                    
         }
         
            for(int i = 0; i < n ; i++)
               {
            for(int j = 0; j < n ; j++)
            {     
                  if(VET[i][j] == VET2[i][j])
                  VET3[i][j] = 0;
                  if(VET[i][j] > VET2[i][j])
                  VET3[i][j] = 1;
                  if(VET[i][j] < VET2[i][j])
                  VET3[i][j] = -1;     
                                        
            }
                                    
         } 
         
          for(int i = 0; i < VET3.length ; i++)
            {
            for(int j = 0; j < VET3[i].length ; j++)
            {     
                  System.out.print(VET3[i][j] + "  ");
                                        
            }
            
             System.out.println();                       
         }
         
         
        
   }

}