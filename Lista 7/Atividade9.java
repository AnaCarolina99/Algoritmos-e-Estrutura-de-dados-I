import java.util.Scanner;
public class Atividade9
{
   public static void main(String[]args)
   {
      int cond=0;
      float mat[][]=new float [6][7];
      Scanner leitura=new Scanner(System.in);
      for(int i=0;i<6;i++)
      {
         for(int j=0;j<7;j++)
         {
            System.out.print("Digite o valor na posicao ("+(i+1)+","+(j+1)+"):");
            mat[i][j]=leitura.nextFloat();
            System.out.print("\n");
         }
      }
      System.out.print("Matriz gerada:\n");
      for(int i=0;i<6;i++)
      {
         for(int j=0;j<7;j++)
            System.out.print(mat[i][j]+"\t");
         System.out.print("\n");
      }
      System.out.print("Elementos acima da diagonal principal:\n");
      for(int i=0;i<6;i++)
      {
         for(int k=0;k<i;k++)
            System.out.print("\t\t");
         for(int j=0;j<7;j++)
         {
            if(i<j)
               System.out.print(mat[i][j]+"\t");
         }                                  
         System.out.print("\n");
      }
   }
}