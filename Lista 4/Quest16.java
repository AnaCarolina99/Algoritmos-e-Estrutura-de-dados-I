import java.util.Scanner;
public class Quest16
{
   public static void main(String[] args) 
   {
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite a quantidade de pessoas calculadas");
      short sequence = leia.nextShort();
      int quantiEng = 0, 
          someSalary = 0,
          quantisalary = 0,
          quantiValue = 0, 
          inc = 0,
          someValue = 0;
          
      do 
      {
         
         System.out.println("Digite a idade");
         byte age = leia.nextByte();
         
         System.out.println("Digite o genero, 'F' para Feminino e 'M' para Masculino");
         char gender = leia.next().charAt(0);
         
         System.out.println("Digite 1 para 1° grau,2 para 2° grau, 3 para superior incompleto e 4 para superior completo");
         byte escolarity = leia.nextByte();
         
         System.out.println("Digite o valor do salario");
         float salary = leia.nextFloat();
            if(escolarity == 3 || escolarity == 4)
            {
              System.out.println("Digite o nome do curso");
              String name = leia.nextLine();
              leia.nextLine();
              quantiValue++;
               if( name.equals("engenharia"))
               {
                  quantiEng++;
               } 
            }
            else if (escolarity == 1 || escolarity == 2)
            {
               if(salary>0)
               {
                  someSalary += salary;
                  quantisalary++;
               }
            }
         
         inc++;
         sequence--;
      }
      while(1 <= sequence);
      
      System.out.println("Percentual de pessoas que fazem (ou fizeram) um curso superior eh de " +(double)(quantiValue*100)/inc);
      System.out.println("Salario medio das pessoas que nao tem faculdade eh de " +(double)someSalary/quantisalary);
      System.out.println("Quantidade de engenheiros entrevistados eh de " +quantiEng);
   }
}