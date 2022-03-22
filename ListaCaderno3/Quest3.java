import java.util.Random;
public class Quest3{
   public static void main(String[] args){
      int VET[][][][] = new int[2][2][2][2];
      Random r = new Random();
      for(int i = 0; i<VET.length; i++){
         for(int j = 0; j<VET[0].length; j++){
            for(int k = 0; k<VET[0][0].length; k++){
               for(int l = 0; l<VET[0][0][0].length; l++)
               {
               VET[i][j][k][l] = r.nextInt(2);
               }
            }
         }
      }
    
       
      int CUBE[] = new int[VET.length];
      CUBE = Part(VET);
      for(int i = 0; i<VET.length; i++){
         System.out.println("A soma do cubo na parte " + (i+1) + " vale " + CUBE[i]);
      }
  }    
      public static void Cu(int VET[][][][]){
      
               for(int i = 0; i<VET.length; i++){
               System.out.println("Parte " +(1+i));
               System.out.println("=====================");
         for(int j = 0; j<VET[0].length; j++){
         System.out.println("Face " +(1+i));
            for(int k = 0; k<VET[0][0].length; k++){
               for(int l = 0; l<VET[0][0][0].length; l++)
               {
               System.out.print(VET[i][j][k][l] + " ");
               }
               System.out.println();
            }
            System.out.println();
         }
         System.out.println();
      }
      
    } 
    
    public static int[] Part(int VET[][][][]){
      Cu(VET);
         int Top[] = new int[2];
         int d = 0;
               for(int i = 0; i<VET.length; i++){
         for(int j = 0; j<VET[0].length; j++){
            for(int k = 0; k<VET[0][0].length; k++){
               for(int l = 0; l<VET[0][0][0].length; l++)
               {
                Top[d] += VET[i][j][k][l];
                
               }
            }
         }
         d++;
      }
      return Top;
    } 
  

   
}