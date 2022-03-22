import java.util.Scanner;
public class Quest1{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
         final byte Top = 5;
         String NAMES[] = new String[Top];
         short NOTES[] = new short[Top];
         char GENDERS[] = new char[Top];
         char APROVE[] = new char[Top];
            for(short i = 0; i<NOTES.length ; i++)
            {
               System.out.println("Digite a nota");
               NOTES[i] = leia.nextShort();
               leia.nextLine();
               System.out.println("Digite o nome");
               NAMES[i] = leia.nextLine();
               System.out.println("Digite 'M' para mulher e 'H' para homem");
               GENDERS[i] = leia.nextLine().charAt(0);
               System.out.println("Digite 'A' para aprovado e 'R' para reprovado");
               APROVE[i] = leia.nextLine().charAt(0);
            }
            System.out.println("==================================");
            for(short i = 0; i<NOTES.length ; i++)
            {
               if(GENDERS[i] == 'M')
               {
                  if(APROVE[i] == 'A')
                  {
                     System.out.println("Nome: " +NAMES[i]);
                     System.out.println("Sexo: Feminino");
                     System.out.println("Nota: " +NOTES[i]);
                     System.out.println("Status de aprovacao: Aprovado");
                     System.out.println();
                  }
                  if(APROVE[i] == 'R')
                  {
                     System.out.println("Nome: " +NAMES[i]);
                     System.out.println("Sexo: Feminino");
                     System.out.println("Nota: " +NOTES[i]);
                     System.out.println("Status de aprovacao: Reprovado");
                     System.out.println();
                  }
               }
               if(GENDERS[i] == 'H')
               {
                  if(APROVE[i] == 'A')
                  {
                     System.out.println("Nome: " +NAMES[i]);
                     System.out.println("Sexo: Masculino");
                     System.out.println("Nota: " +NOTES[i]);
                     System.out.println("Status de aprovacao: Aprovado");
                     System.out.println();
                  }
                  
                  if(APROVE[i] == 'R')
                  {
                     System.out.println("Nome: " +NAMES[i]);
                     System.out.println("Sexo: Masculino");
                     System.out.println("Nota: " +NOTES[i]);
                     System.out.println("Status de aprovacao: Reprovado");
                     System.out.println();
                  }

               }
     
            }

   }
}