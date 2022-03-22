public class Quest10{
   public static void main(String[] args){
      int VET[] = new int[500];
         for(int i = 0; i<500 ; i++)
         {
            VET[i] = i + 1;
               if(VET[i] % 5 == 0)
               {
               System.out.print(VET[i]+ " ");
               } 
         }
   }
}