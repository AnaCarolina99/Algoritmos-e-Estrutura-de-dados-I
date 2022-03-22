import java.util.Scanner;
public class Quest2{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
         final byte Top = 10;
         String NAMES[] = new String[Top];
         short NOTES[] = new short[Top];
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
               if(NOTES[i] >=80)
               System.out.println("O aluno(a) " +NAMES[i]+ " esta com nota >=80 ");

            }

   }
}