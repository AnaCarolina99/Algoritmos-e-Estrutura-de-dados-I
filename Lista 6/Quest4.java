import java.util.Scanner;
public class Quest4{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
         final byte Top = 10;
         String NAMES[] = new String[Top];
         short NOTES[] = new short[Top];
         byte quant = 0;
         short some = 0;
         float media;
            for(short i = 0; i<NOTES.length ; i++)
            {
               System.out.println("Digite a nota");
               NOTES[i] = leia.nextShort();
               leia.nextLine();
               System.out.println("Digite o nome");
               NAMES[i] = leia.nextLine();
            }
            
            for(short i = 0; i<NOTES.length ; i++)
            {
               if(NOTES[i] >=0)
               some += NOTES[i]; 
               quant++;
            }
            
            media = (float) some/quant;
            System.out.println("A media da turma vale " + media);
            for(short i = 0; i<NOTES.length ; i++)
            {
               if(NOTES[i] > media)
               System.out.println("O aluno(a) " +NAMES[i]+ " tirou acima da media " +NOTES[i]);

            }
   }
}