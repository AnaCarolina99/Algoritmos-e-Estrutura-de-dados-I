import java.util.Scanner;
public class Quest6{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
         int[] VET1 = new int[10];
         int[] VET2 = new int[5];
         int a = 0;
            for(int i = 0 ; i<VET1.length ; i++)
            {
               System.out.println("Digite o numero do vetor 1 da posicao " + (1+i));
               VET1[i] = leia.nextInt();
                  if(i%2==0)
                  {
                     VET2[a] = VET1[];
                     a++;
                  }   

            }
            System.out.println("================");
            System.out.println("Vetor digitado");
            for(int i=0;i<10;i++)
               System.out.println(VET1[i] + " ");
               System.out.println("================");
               System.out.println("Valores pares do vetor");
            for(int i=0;i<5;i++)
               System.out.println(VET2[i]+ " ");
 }
}            
