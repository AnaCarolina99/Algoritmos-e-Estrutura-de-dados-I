public class Quest11{
   public static void main(String[] args){
      int[] VET = new int[100]; 
         for(int i = 0; i<100; i++)
         {
            VET[i] = i+1;
               if(VET[i]%2 == 0)
               {
                  System.out.print(VET[i]+ " ");
               }
         }
   }
}