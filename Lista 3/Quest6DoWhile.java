public class Quest6DoWhile{
   public static void main(String[] args){
   float raio = 1;
   double math;
   do
   {
    System.out.println("O raio vale " + raio);
     math=  Math.PI*Math.pow(raio,2);
    System.out.println("A area da circunferencia vale " + math); 
   raio+=0.1;
   }while (raio<10);
     
   }
}
