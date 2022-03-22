import java.util.Scanner;
public class Atividade5
{
   public static void main(String[]args)
   {
      float mat[][]=new float [3][10],soma[]=new float[10],media[]=new float [10],mediaG=0;
      int cont1=0,cont2=0;
      Scanner leitura=new Scanner(System.in);
      for(int j=0;j<10;j++)
      {
         cont2++;
         for(int i=0;i<3;i++)
         {
            cont1++;
            System.out.print("Digite a "+cont1+".a nota do "+cont2+".o aluno:");
            mat[i][j]=leitura.nextFloat();
            System.out.print("\n");
            soma[j]=soma[j]+mat[i][j];
         }
         mediaG=soma[j]+mediaG;
         media[j]=soma[j]/3;
         cont1=0;
      }
         mediaG=mediaG/30;
      for(int i=0;i<10;i++)
      {
         if(soma[i]>=60)
            System.out.print("O "+(i+1)+".o aluno foi aprovado.\n");
         else
            System.out.print("O "+(i+1)+".o aluno foi reprovado.\n");
         System.out.print("A media do "+(i+1)+".o aluno foi: "+media[i]+"\n\n");
      }
      System.out.print("A media geral e:"+mediaG);
   }
}