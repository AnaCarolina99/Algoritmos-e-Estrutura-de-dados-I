public class Quest19{
   public static void main(String[] args){
      double height = 1.95;
         for(double i = 1.50;i<=height;i+=0.01)
         {
         System.out.println("O peso minimo recomendavel para a altura " + i + " eh de " + (Math.pow(i,2)*20));
         System.out.println("O peso maximo recomendavel para a altura " + i + " eh de " + (Math.pow(i,2)*25));
         System.out.println("");
         }
   }
}