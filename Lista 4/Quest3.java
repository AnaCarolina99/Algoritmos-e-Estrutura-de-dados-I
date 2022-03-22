public class Quest3{
   public static void main(String[] args){
      for(int i = 9;i>=0;i--)
      {
         for(int j = 59;j>=0;j--)
         {
            if(j>=10 && j<=59)
            {
             System.out.println(+ i + ":" + j);
            }else if(j<10 && j>=0)
            {
            System.out.println(+ i + ":0" + j);
            }
         }
      }
   }
}