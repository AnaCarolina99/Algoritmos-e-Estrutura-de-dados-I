 import java.util.Scanner;
  import java.util.Random;
 public class Quest6{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      Random r = new Random();
      int VET[][][] = new int[3][3][3];
         for(int i = 0; i<VET.length;i++)
         {
            for(int j = 0; j<VET[0].length;j++)
            {
               for(int k = 0; k<VET[0][0].length;k++)
               {
                  VET[i][j][k] = r.nextInt(100);
               }
            }
         } 
         
          for(int i = 0; i<VET.length;i++)
         {
         System.out.println("Face: " +(i+1));
            for(int j = 0; j<VET[0].length;j++)
            {
               for(int k = 0; k<VET[0][0].length;k++)
               {
                  System.out.print(VET[i][j][k] + " ");
               }
               
               System.out.println();
            }
            
            System.out.println("============================");
            
         } 
        
      
      int Cu[] = new int[VET.length];
      Cu = Vet(VET);
         for(int i = 0; i<VET.length;i++)
         {
           System.out.println("A soma da face " + (i+1) + " vale " + Cu[i]); 
         }
         
       }  
         
        public static int[] Vet(int VET[][][])
         {     
         int d = 0;  
         int cube[] = new int[VET.length];
                 for(int i = 0; i<VET.length;i++)
               {  
            for(int j = 0; j<VET[0].length;j++)
            {
               for(int k = 0; k<VET[0][0].length;k++)
               {
                  cube[d] = cube[d] + VET[i][j][k];
                    
                
               }
            }
            
            d++;
         } 
         
         return cube;     
   }

 }