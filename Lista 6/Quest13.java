public class Quest13{
   public static void main(String[] args){
      int[] VET = new int[20];
         for(int i = 0 ;i< 20 ; i++)
         {
            VET[i] = i + 1;
               if(VET[i] % 2 != 0)
               {
                System.out.print(Math.pow(VET[i],2)+ " ");
               } 
         }
   }
}