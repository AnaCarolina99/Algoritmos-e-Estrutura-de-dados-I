import java.util.Scanner;
public class Quest8{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
         int VET[] = new int[10];
         int i;
        
            for( i = 0; i<VET.length ; i++)
            {
               System.out.println("Digite o valor da posicao " + i);
               VET[i] = leia.nextInt();
            }
               System.out.println("============================");
               System.out.println("Ordem de digitacao");
               
               for( i = 0; i<VET.length ; i++)
            {
               System.out.print(VET[i] + " ");
            }
            
               int VET2[] = new int[VET.length];
               System.out.println();
               System.out.println("============================");
               System.out.println("Ordem inversa");
            for( i = VET.length - 1; i>=0 ; i--)
            {
               VET2[i] = VET[i];
               System.out.print(VET2[i] + " ");
            }
   }
}