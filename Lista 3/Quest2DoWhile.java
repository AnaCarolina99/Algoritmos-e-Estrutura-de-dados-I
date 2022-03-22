public class Quest2DoWhile{
   public static void main(String[] args){
   float raio = 10;
   double math;
   do
   {
       System.out.println("O raio vale " + raio);
     math=  Math.PI*Math.pow(raio,2);
    System.out.println("A area da circunferencia vale " + math); 
   raio++;
    }while (raio<=100);
    
   }
}
