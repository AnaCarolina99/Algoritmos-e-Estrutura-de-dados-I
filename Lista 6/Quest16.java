import java.util.Scanner;
public class Quest16{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
         int[] VET1 = new int[5];
         int[] VET2 = new int[5];
         int[] VET3 = new int[10];
         int a = 0, b = 0;
            for(int i = 0 ; i<VET1.length ; i++)
            {
               System.out.println("Digite o numero do vetor 1 da posicao " + (1+i));
               VET1[i] = leia.nextInt();
            }
            
            for(int i = 0 ; i < VET2.length ; i++)
            {
               System.out.println("Digite o numero do vetor 2 da posicao " + (1+i));
               VET2[i] = leia.nextInt();
            }
                  for(int i=0;i<10;i++)
                  {
                     if(i%2==0)
                     {
                        VET3[i] = VET1[a];
                        a++;
                     }   
                     else
                     {
                        VET3[i] = VET2[b];     
                        b++;
                     } 
                  } 
                  
                  System.out.print("Primeiro vetor");
                  for(int i=0;i<5;i++)
                     System.out.print(VET1[i]);
                  System.out.print("Segundo vetor");
                  for(int i=0;i<5;i++)
                     System.out.print(VET2[i]);
                  System.out.print("Vetor resultante");
                  for(int i=0;i<10;i++)
                     System.out.print(VET3[i]);  

   }
}