public class Quest3For{
   public static void main(String[] args){
   double math;
       for(int i = 1;i<=50;i++)
       {
       if(i%2!=0)
          {
          System.out.println("O raio impar vale " + i);
           math=  Math.PI*Math.pow(i,2);
          System.out.println("A area da circunferencia de raio impar vale " + math);
       }
      }  
   }
}
