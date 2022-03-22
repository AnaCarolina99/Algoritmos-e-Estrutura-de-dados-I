import java.util.Scanner;
public class Quest2{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite o tamanho da linha");
      int n = leia.nextInt();
      System.out.println("Digite o tamanho da coluna");
      int m = leia.nextInt();
      int VET[][] = new int[n][m]; 
         for(int i = 0; i<VET.length ;i++)
            for(int j = 0; j<VET[i].length ;j++)
            {
               System.out.println("Digite o numero da linha " + (i+1) + " de coluna " + (1+j));
               VET[i][j] = leia.nextInt();
            }
         Print(VET);
   }
   public static void Print(int VET[][]){
               for(int i = 0; i<VET.length ;i++)
               {
            for(int j = 0; j<VET[i].length ;j++)
            {
               System.out.print(VET[i][j]+"\t");
            }
            System.out.println();
               }
          
   }
 }