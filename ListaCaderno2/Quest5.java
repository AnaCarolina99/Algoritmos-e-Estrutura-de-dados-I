import java.util.Random;
public class Quest5{
   public static void main(String[] args){
      int MAT[][] = new int[2][2];
      int vet[] = new int[MAT.length * MAT[0].length];
      vet = Vet(MAT);
   for(int i = 0; i < MAT.length * MAT[0].length; i++)
          {
        System.out.print(vet[i] + " ");
        }      
   
   }
   
  public static int[] Vet(int MAT[][])
  {
   Random r = new Random();
   int VET[] =  new int[MAT.length * MAT[0].length];
   int k = 0;
       for(int i = 0 ; i< MAT.length ; i++)
      {
            for(int j = 0 ; j< MAT[0].length ; j++)
            {
                  
               MAT[i][j] = r.nextInt(50);
            }
      }
      
 
       for(int i = 0 ; i< MAT.length ; i++)
      {
            for(int j = 0 ; j< MAT[0].length ; j++)
            {
                  
               VET[k] = MAT[i][j];
               k++;
            }
      }  
         
      return VET;   
             
  }
}