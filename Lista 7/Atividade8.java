import java.util.Scanner;
public class Atividade8
{
   public static void main(String[]args)
   {
      int cont=0;
      float mat[][]=new float [5][5],soma=0,media;
      Scanner leitura=new Scanner(System.in);
      for(int i=0;i<5;i++)
      {
         for(int j=0;j<5;j++)
         {
            System.out.print("Digite o valor na posicao ("+(i+1)+","+(j+1)+"):");
            mat[i][j]=leitura.nextFloat();
            System.out.print("\n");
         }
      }
      System.out.print("Matriz gerada:\n");
      for(int i=0;i<5;i++)
      {
         for(int j=0;j<5;j++)
         {
            System.out.print(mat[i][j]+"\t");
            if(i+j>=5)
            {
               soma=soma+mat[i][j];
               cont++;
            }   
         }
         System.out.print("\n");
      }
      for(int i=0;i<5;i++)
      {
         for(int j=0;j<5;j++)
            if(i+j>=5)
               System.out.print(mat[i][j]+"\t");
      System.out.print("\n");
      }         
      media=(soma/cont);
      System.out.print("Media dos termos abaixo da diagonal secundaria: "+media);
   }
}