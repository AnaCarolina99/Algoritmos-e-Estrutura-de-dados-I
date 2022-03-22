public class Quest2While{
   public static void main(String[] args){
   float raio = 10;
   double math;
    while (raio<=100){
    System.out.println("O raio vale " + raio);
     math=  Math.PI*Math.pow(raio,2);
    System.out.println("A area da circunferencia vale " + math); 
   raio++;
   }  
   }
}
