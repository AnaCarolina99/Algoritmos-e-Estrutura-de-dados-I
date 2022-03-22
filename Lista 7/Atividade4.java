import java.util.Scanner;
import java.util.Random;
public class Atividade4
{
   public static void main(String[]args)
   {
      int mat[][]=new int [7][9],vet[]=new int[10],k;
      Scanner leitura=new Scanner(System.in);
      Random rand=new Random();
      for(int i=0;i<7;i++)
         for(int j=0;j<9;j++)
         {
            mat[i][j]=rand.nextInt(10)+1;
            if(mat[i][j]==1)
            {
               k=0;
               vet[k]=vet[k]+1;
            }
            else
               if(mat[i][j]==2)
               {
                  k=1;
                  vet[k]=vet[k]+1;
               }
               else
                  if(mat[i][j]==3)
                  {
                     k=2;
                     vet[k]=vet[k]+1;
                  }
                  else
                     if(mat[i][j]==4)
                     {
                        k=3;
                        vet[k]=vet[k]+1;
                     }
                     else
                        if(mat[i][j]==5)
                        {
                           k=4;
                           vet[k]=vet[k]+1;
                        }
                        else
                           if(mat[i][j]==6)
                           {
                              k=5;
                              vet[k]=vet[k]+1;
                           }
                           else
                              if(mat[i][j]==7)
                              {
                                 k=6;
                                 vet[k]=vet[k]+1;
                              }
                              else
                                 if(mat[i][j]==8)
                                 {
                                    k=7;
                                    vet[k]=vet[k]+1;
                                 }
                                 else
                                    if(mat[i][j]==9)
                                    {
                                       k=8;
                                       vet[k]=vet[k]+1;
                                    }
                                    else
                                       if(mat[i][j]==10)
                                       {
                                          k=9;
                                          vet[k]=vet[k]+1;
                                       }
                                                            
         }             
      System.out.print("Matriz gerada:\n");
      for(int i=0;i<7;i++)
      {
         for(int j=0;j<9;j++)
            System.out.print(mat[i][j]+"\t");
         System.out.print("\n");
      }
      System.out.print("\nQuantidade de vezes que apareceu os seguintes valores:");
      for(int i=0;i<9;i++)
         System.out.print("\nO valor "+(i+1)+" apareceu "+vet[i]+" vezes.\n");
   }
}