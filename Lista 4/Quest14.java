import java.util.Scanner;
public class Quest14{
   public static void main(String[] args){
   Scanner leia = new Scanner (System.in);
   System.out.println("Digite a quantidade de pessoas calculadas");
   short sequence = leia.nextShort();
   int  quantiAge = 0 , quantiSalary1 = 0,quantiSalary2 = 0, inc = 1,
   someSalary = 0,someSalary2 = 0,IMCquanti = 0 , someAge = 0, womanAge = 0;
         do
         {
            System.out.println("Digite o nome");
            String name = leia.nextLine();
            leia.nextLine();
            System.out.println("Digite a idade");
            byte age = leia.nextByte();
            System.out.println("Digite o genero, 'F' para mulher e 'M' para homem");
            char gender = leia.next().charAt(0);
            System.out.println("Digite o estado civil, 'C' para casado, 'S' para solteiro e 'O' para outros");
            char state = leia.next().charAt(0);
            System.out.println("Digite o peso");
            float size = leia.nextFloat();
            System.out.println("Digite a altura");
            float height = leia.nextFloat();
            System.out.println("Digite o salario");
            short salary = leia.nextShort();
            double IMC = (float) size/Math.pow(height,2);
               if(gender == 'F')
               {
                  if(salary>=0)
                  {
                  quantiSalary1++;
                  someSalary+= salary;
                  }
               }
               if(gender == 'M')
               {
                  if(salary>=0)
                  {
                  quantiSalary2++;
                  someSalary2+= salary;
                  }
               } 
               if(IMC>=30)
               {
                  IMCquanti++;
               }
               if(gender == 'F')
               {
                  if(state =='S')
                  {
                     if(age>=40)
                     {
                     womanAge++;
                     }
                  }
               }        
         inc++;
      }while(inc<=sequence);
      System.out.println("Media salarial dos homens eh de " +((float) someSalary2/quantiSalary2));
      System.out.println("Media salarial das mulheres eh de " +((float) someSalary/quantiSalary1));
      System.out.println("Percentual de pessoas obesas eh de " + (double)((IMCquanti*100)/inc) + "%"); 
      System.out.println("Qtde. mulheres solteiras com idade >= 40 anos, eh de " + womanAge);
    }
}