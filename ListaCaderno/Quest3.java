import java.util.Scanner;
public class Quest3{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite o tamanho do vetor");
      int n = leia.nextInt();
      int VET[] = new int[n]; 
         for(int i = 0; i < VET.length;i++)
         {
            System.out.println("Digite o numero da posicao " +(1+i));
            VET[i] = leia.nextInt();
         }
        int top = Negative(VET);
        System.out.println("A quantidade de numeros negativos eh de " +top);
   }
      public static int Negative(int VET[]){
         byte quant = 0;
         for(int i = 0; i < VET.length;i++)
         {
               if(VET[i] < 0)
               quant++;
         }
         return quant;

      }
 }