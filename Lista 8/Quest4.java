import java.util.Scanner;
public class Quest4{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Imforme a quantidade de vetores");
      int n = leia.nextInt();
      System.out.println("Digite um numero para se verificar");
      int m = leia.nextInt();
      int[]VET = new int[n];
         for(int i = 0; i < VET.length ; i++)
         {
               System.out.println("Digite o numero da posicao " + (i+1));
               VET[i] = leia.nextInt();
         }
         
         int met = Met(VET,m);
         if(met == -1)
         {
            System.out.println("O numero " + m + " nao pertence ao vetor");
         }
         else
         System.out.println("O numero " + m + " aparece na ultima posicao " +(met+1));
   }
   
   
   public static int Met(int[] VET, int m){
   int pos = -1;
   for(int i = 0; i < VET.length ; i++)
   {
      if(VET[i] == m)
      pos = i;
   }
   return pos;
   
   }
}