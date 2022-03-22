import java.util.Scanner;
public class Quest6{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      int[][] VET = new int[5][5];
         for(int i = 0; i < VET.length ; i++)
         {
            for(int j = 0; j < VET[i].length ; j++)
            {     
                  System.out.println("Digite o numero da linha " + i + " e coluna " + j);
                  VET[i][j] = leia.nextInt();
                                        
            }
                                    
         }
        
            for(int i = 0; i < VET.length ; i++)
            {
            for(int j = 0; j < VET[i].length ; j++)
            {  
            if(i == j)
                     System.out.print(VET[i][j]+"\n");
                  else
                     if(i>j)
                     System.out.print("\t");
           }
        }
   }

}