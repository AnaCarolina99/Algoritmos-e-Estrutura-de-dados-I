import java.util.Random;
public class Quest2{
   public static void main(String[] args){
      int VET[][][] = new int[3][3][3];
      Random r = new Random();
      for(int i = 0; i<VET.length; i++){
         for(int j = 0; j<VET[0].length; j++){
            for(int k = 0; k<VET[0].length; k++){
               VET[i][j][k] = r.nextInt(2);
            }
         }
      }
    
       
      Cub(VET);
  }    
      public static void Cu(int VET[][][]){
      
               for(int i = 0; i<VET.length; i++){
      System.out.println("Face : " +(i+1));
         for(int j = 0; j<VET[0].length; j++){
            for(int k = 0; k<VET[0].length; k++){
             System.out.print(VET[i][j][k] + "  ");  
            }
            System.out.println();
         }
         System.out.println();
      } 
      
    }  
  
      public static void Cub(int VET[][][]){
                  Cu(VET);  
     
                  for(int i = 0; i<VET.length; i++){
                  int some = 0;
         for(int j = 0; j<VET[0].length; j++){
            for(int k = 0; k<VET[0][0].length; k++){
                  if(j == k)
                  {
                     some += VET[i][j][k];
                     
                  }
                
            }
            
         }
         System.out.println("A soma da diagona da face " + (i+1) + " vale " + some);
      }
   }
   
}