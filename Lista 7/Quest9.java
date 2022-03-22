import java.util.Scanner;
public class Quest9{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      int[][] VET = new int[7][7];
         for(int i = 0; i < VET.length ;i++){
            for(int j = 0; j < VET.length ;j++)
            {
              System.out.println("Digite o numero da linha " + (i+1) + " e coluna " + (j+1));
               VET[i][j] = leia.nextInt();
               
            }
         }
         String aux = "";
          for(int i = 0; i < VET.length ;i++){
             System.out.print(aux);
            for(int j = 0; j < VET.length ;j++)
            {
               if(i <= j)
               System.out.print(VET[i][j] + " \t");
               
            }
            aux += "\t";
            System.out.println();
         }
         
   }
}