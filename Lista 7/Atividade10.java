import java.util.Scanner;
public class Atividade10
{
   public static void main(String[]args)
   {
      float mat[][]=new float [10][10],somalinha[]=new float[10],somacoluna[]=new float[10],cont=0;
      Scanner leitura=new Scanner(System.in);
      for(int i=0;i<10;i++)
      {
         for(int j=0;j<10;j++)
         {
            System.out.print("Digite o valor na posicao ("+(i+1)+","+(j+1)+"):");
            mat[i][j]=leitura.nextFloat();
            System.out.print("\n");
         }
      }
      System.out.print("Matriz gerada:\n");
      for(int i=0;i<10;i++)
      {
         for(int j=0;j<10;j++)
            System.out.print(mat[i][j]+"\t");
         System.out.print("\n");
      }
      for(int i=0;i<10;i++)
      {
         for(int j=0;j<10;j++)
         {
            somalinha[i]=somalinha[i]+mat[i][j];
            somacoluna[i]=somacoluna[i]+mat[j][i];
         }
      }
      for(int i=0;i<10;i++)
         for(int j=0;j<10;j++)
            if(somalinha[i]==somacoluna[j])
               cont++;
      if(cont==100)
         System.out.print("\nTodos os somatorios sao iguais.");
      else
         System.out.print("\nOs somatorios nao sao iguais.");
   }
}