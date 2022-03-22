public class Quest6While{
   public static void main(String[] args){
   float raio = 1;
   double math;
    while (raio<10){
    System.out.println("O raio vale " + raio);
     math=  Math.PI*Math.pow(raio,2);
    System.out.println("A area da circunferencia vale " + math); 
   raio+=0.1;
   }  
   }
}
