import java.util.Scanner;
public class Quest7{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
         String VET[] = new String[3];
         short i;
         byte cond = 0;
         for(i = 0; i<VET.length;i++)
         {
            System.out.println("Digite o nome na posicao " +(i+1));
            VET[i] = leia.nextLine();
         }
         
         System.out.println("Digite um nome para procurar");
         String name = leia.nextLine();
         
         for(i = 0; i<VET.length;i++)
         {
            if(VET[i].equals(name))
              System.out.println("A pessoa " + name + " esta na posicao " + (i+1)); 
              cond = 1;
         }
            if(cond == 0)
            System.out.println("Pessoa nao encontrada");
   }
}