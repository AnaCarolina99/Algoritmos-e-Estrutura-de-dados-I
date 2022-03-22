import java.util.Scanner;
public class Quest2{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Imforme a quantidade de vetores");
      int n = leia.nextInt();
      int[]VET = new int[n];
         for(int i = 0; i < VET.length ; i++)
         {
               System.out.println("Digite o numero da posicao " + (i+1));
               VET[i] = leia.nextInt();
         }
         
         int met = Met(VET);
         
   }
   
   
   public static int Met(int[] VET){
   int menor = VET[0];
   for(int i = 0; i < VET.length ; i++)
   {
      if(VET[i]<menor)
      menor = VET[i];
   }
   System.out.println("O menor numero do vetor eh " +menor);
   return menor;
   
   }
}