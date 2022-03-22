import java.util.Scanner;
public class Quest5{
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
        double top = Negative(VET,n);
        System.out.println("A media vale " +top);
   }
      public static double Negative(int VET[], int n){
         int some = 0;
         for(int i = 0; i < VET.length;i++)
         {     
               some += VET[i];
         }
         double media = (float) some/n;
         return media;

      }
 }