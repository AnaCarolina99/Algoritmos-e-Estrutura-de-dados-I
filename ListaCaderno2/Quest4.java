import java.util.Random;
public class Quest4{
   public static void main(String[] args){
      int MAT[][] = new int[5][5];
      int mat[] = Mat(MAT);
      System.out.println("Quantidade de negativos " +mat[1]); 
      System.out.println("Quantidade de positivoss " +mat[0]);
      System.out.println("Quantidade de nulos " +mat[2]);    
   }
  public static int[] Mat(int MAT[][])
  {
   Random r = new Random();
   int cont[] =  new int[3];
      for(int i = 0 ; i< MAT.length ; i++)
      {
         for(int j = 0 ; j< MAT[0].length ; j++)
         {
            MAT[i][j] = r.nextInt(10);
         }
      }
      
      
              for(int i = 0 ; i< MAT.length ; i++)
            {
               for(int j = 0 ; j< MAT[0].length ; j++)
               {
                  if(MAT[i][j] > 0)
                  cont[0]++;
                  else if(MAT[i][j] < 0)
                  cont[1]++;
                  else
                  cont[2]++;
               }
            }
         return cont;         
  }
}