import java.util.Scanner;
public class Quest13{
   public static void main(String[] args){
   Scanner leia = new Scanner (System.in);
   System.out.println("Digite a quantidade de pessoas calculadas");
   byte sequence = leia.nextByte();
   short  quantiM = 0 , quantiH = 0, inc = 1,
   quantiAprove = 0, quantiMAprove = 0;
         do
         {
            System.out.println("Digite o nome");
            String name = leia.nextLine();
            leia.nextLine();
            System.out.println("Digite a nota");
            byte note = leia.nextByte();
            System.out.println("Digite o genero, 'F' para mulher e 'M' para homem");
            char gender = leia.next().charAt(0);
               if(gender == 'F')
               {
               quantiM++;
               }else if(gender == 'M')
               {
               quantiH++;
               }
               if(note>=6)
               {
               quantiAprove++;
               } 
               if(note>=6)
               {
                  if(gender == 'F')
                  {
                  quantiMAprove++;
                  }
               }          
         inc++;
      }while(inc<=sequence);
      float media = (float)(quantiAprove*100)/sequence;
      float media2 = (float)((quantiMAprove*100)/sequence);
      System.out.println("A Quantidade de mulheres sao de " + quantiM); 
      System.out.println("A Quantidade de homens sao de " + quantiH);
      System.out.println("Percentual de alunos aprovados eh de " + media);
      System.out.println("Percentual de mulheres aprovadas eh de " + media2);  
   }
}