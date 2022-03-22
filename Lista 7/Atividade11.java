import java.util.Scanner;
public class Atividade11
{
   public static void main(String[]args)
   {
      int n;
      Scanner leitura=new Scanner(System.in);
      System.out.print("Digite o valor da dimensao das matrizes:");
      n=leitura.nextInt();
      float mat1[][]=new float [n][n],mat2[][]=new float[n][n],mat3[][]=new float[n][n];
      System.out.print("\nLeitura da primeira matriz:");
      for(int i=0;i<n;i++)
      {
         for(int j=0;j<n;j++)
         {
            System.out.print("\nDigite o valor na posicao ("+(i+1)+","+(j+1)+"):");
            mat1[i][j]=leitura.nextFloat();
         }
      }
      System.out.print("\nMatriz gerada:\n");
      for(int i=0;i<n;i++)
      {
         for(int j=0;j<n;j++)
            System.out.print(mat1[i][j]+"\t");
         System.out.print("\n");
      }
      System.out.print("\nLeitura da segunda matriz:");
      for(int i=0;i<n;i++)
      {
         for(int j=0;j<n;j++)
         {
            System.out.print("\nDigite o valor na posicao ("+(i+1)+","+(j+1)+"):");
            mat2[i][j]=leitura.nextFloat();
         }
      }
      System.out.print("\nMatriz gerada:\n");
      for(int i=0;i<n;i++)
      {
         for(int j=0;j<n;j++)
            System.out.print(mat2[i][j]+"\t");
         System.out.print("\n");
      }
      for(int i=0;i<n;i++)
      {
         for(int j=0;j<n;j++)
         {
            if(mat1[i][j]==mat2[i][j])
               mat3[i][j]=0;
            else
               if(mat1[i][j]<mat2[i][j])
                  mat3[i][j]=-1;
               else
                  mat3[i][j]=1;
         }
      }
      System.out.print("\nTerceira matriz:\n");
      for(int i=0;i<n;i++)
      {
         for(int j=0;j<n;j++)
            System.out.print(mat3[i][j]+"\t");
         System.out.print("\n");
      }
   }
}