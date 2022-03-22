import java.util.Scanner;
public class Quest8{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite o tamanho do primeiro vetor");
      int n = leia.nextInt();
      int VET[] = new int[n]; 
      System.out.println("Digite o tamanho do segundo vetor");
      int m = leia.nextInt();
      int VET2[] = new int[m];
      int VET3[] = new int[n+m]; 
         for(int i = 0; i <n;i++)
         {
            System.out.println("Digite o numero do primeiro vetor da posicao " +(1+i));
            VET[i] = leia.nextInt();
         }
         
          for(int i = 0; i < m;i++)
         {
            System.out.println("Digite o numero do segundo vetor da posicao " +(1+i));
            VET2[i] = leia.nextInt();
         }
        VET3 = Conca(VET,VET2);
        for(int i = 0; i<VET3.length;i++)
        System.out.println(VET3[i] + "  ");
   }
      public static int Conca(int VET[],int VET2[]){
         int VET4[] = new int[VET.length + VET2.length];
         int j = 0;
         for(int i = 0; i < VET.length;i++)
         {
            VET4[i] = VET[i];
         }
          for(int i = VET.length; i < VET4.length;i++)
         {
            VET4[i] = VET2[j];
            j++;
         }
         return VET4;

      }
 }