public class Quest3While{
   public static void main(String[] args){
   float raio = 1;
   double math;
       while (raio<=50){
          if(raio%2!=0)
          {
          System.out.println("O raio impar vale " + raio);
           math=  Math.PI*Math.pow(raio,2);
          System.out.println("A area da circunferencia de raio impar vale " + math); 
         }
         raio++;
      }  
   }
}
