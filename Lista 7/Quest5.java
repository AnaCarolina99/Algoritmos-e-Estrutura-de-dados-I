import java.util.Scanner;
public class Quest5{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      int[][] VET = new int[3][3];
      int some = 0;
      
               for(int i = 0; i < VET.length ; i++)
                  {
            for(int j = 0; j < VET[i].length ; j++)
            {
               System.out.println("Digite o aluno " + (i+1) + " e a nota " + (j+1));
               VET[i][j] = leia.nextInt();
            }
         }
         for(int i = 0; i < VET.length ;i++){
         some = 0;
            for(int j = 0; j < VET[0].length ;j++)
            {
               some += VET[i][j];
               
            }
               if(some >= 60)
            System.out.println("Voce passou");
               else
               System.out.println("Voce reprovou");
         }
         
   }
}