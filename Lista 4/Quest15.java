import java.util.Scanner;
public class Quest15
{
   public static void main(String[] args) 
   {
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite a quantidade de pessoas calculadas");
      short sequence = leia.nextShort();
      int quantiM = 0, 
          quantiPoints = 0,
          quantiF = 0, 
          inc = 0,
          someAge = 0,
          someValue = 0;
          
      do 
      {
         System.out.println("Digite o nome");
         String name = leia.nextLine();
         leia.nextLine();
         
         System.out.println("Digite a idade");
         byte age = leia.nextByte();
         
         System.out.println("Digite o genero, 'F' para Feminino e 'M' para Masculino");
         char gender = leia.next().charAt(0);
         
         System.out.println("Digite a quantidade de pontos perdidos");
         byte points = leia.nextByte();
         
         System.out.println("Digite o valor da multa");
         float value = leia.nextFloat();
         
         if(age>=0)
         {
           someAge+= age; 
         }
         
         if(value>0)
         {
          someValue+=value;
         }
         if(gender == 'F')
         {
         quantiF++;
         }
         else if(gender == 'M')
         {
         quantiM++;
         }
         if(points == 7)
         {
         quantiPoints++;
         }
         
         inc++;
         sequence--;
      }
      while(1 <= sequence);
      
      System.out.println("Idade média dos condutores eh de " +(float)someAge/inc);
      System.out.println("Valor total de todas as multas eh de " + someValue);
      System.out.println("Percentual de homens eh de " + (double)((quantiM*100)/inc) + "%");
      System.out.println("Percentual de mulheres eh de " + (double)((quantiF*100)/inc) + "%");
      System.out.println("Quantidade de pessoas que perderam 7 pontos na carteira eh de " + quantiPoints);  
   }
}