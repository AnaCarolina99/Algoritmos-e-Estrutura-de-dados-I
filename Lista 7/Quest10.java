import java.util.Scanner;
public class Quest10{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      int[][] VET = new int[10][10];
         for(int i = 0; i < VET.length ; i++)
         {
            for(int j = 0; j < VET[i].length ; j++)
            {
               System.out.println("Digite o numero da linha " + (i+1) + " e coluna " + (j+1));
               VET[i][j] = leia.nextInt();
            }
         }
         int coluna = 0,
             linha = 0;
         for(int i = 0; i < VET.length ; i++)
         {
            for(int j = 0; j < VET[i].length ; j++)
            {
               coluna += VET[i][j];
               linha += VET[j][i];              
            }
             System.out.println("Coluna " + i + " a soma vale " + coluna);
               System.out.println("Linha " + i + " a soma vale " + linha); 
             coluna = 0;
             linha = 0; 
         }
         
   }
}