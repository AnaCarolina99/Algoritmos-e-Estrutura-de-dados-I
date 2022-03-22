import java.util.Scanner;
public class Quest12
{
   public static void main(String[] args) 
   {
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite a quantidade de pessoas calculadas");
      short sequence = leia.nextShort();
      int quantiM = 0, 
          quantiSalary1 = 0,
          quantiH = 0, 
          inc = 0,
          someSalary = 0,
          quantiDepe = 0,
          IMCquanti = 0;
          
      do 
      {
         System.out.println("Digite o nome");
         String name = leia.nextLine();
         leia.nextLine();
         
         System.out.println("Digite a idade");
         byte age = leia.nextByte();
         
         System.out.println("Digite o genero, 'F' para Feminino e 'M' para Masculino");
         char gender = leia.next().charAt(0);
         
         System.out.println("Digite o peso");
         float size = leia.nextFloat();
         
         System.out.println("Digite a altura");
         float height = leia.nextFloat();
         
         System.out.println("Digite o salario");
         short salary = leia.nextShort();
         
         System.out.println("Digite 'S para dependente e 'N' para nao dependente");
         char dependence = leia.next().charAt(0);
         
         double IMC = (float) size / Math.pow(height,2);
         
         // Testa dados para o genero homem
         if (toUpperCase(gender) == 'H')
         {
            if (age > 30)
            {
               if(toUpperCase(dependence) == 'S')
               {
                  if (salary <= 0)
                  {
                     quantiSalary1++;
                  }
               }
            }
         }
         
         // testa os dados para o genero feminino
         if(toUpperCase(gender) == 'F')
         {
            if(age>=24 && age<=40)
            {
               if(IMC>30)
               {
                  IMCquanti++;
               }
            }
         }
         
         if(gender == 'F')
         {
            quantiM++;
         }
         else if(gender == 'M')
         {
            quantiH++;
         }
         
         if(dependence == 'N')
         {
            if(salary>0)
            {
               someSalary+=salary;
            }
            quantiDepe++;
         }
         
         inc++;
         sequence--;
      }
      while(1 <= sequence);
      
      System.out.println("Quantidade de homens com mais de 30 anos, que possuam dependentes e não tem salario eh de " +quantiSalary1);
      System.out.println("Quantidade de mulheres com idade entre 24 e 40 anos com IMC acima de 30 eh de " + IMCquanti);
      System.out.println("Percentual de homens e o percentual de mulheres eh de " + ((float) someSalary/quantiDepe));
      System.out.println("Percentual de homens eh de " + (double)((quantiH*100)/inc) + "%");
      System.out.println("Percentual de mulheres eh de " + (double)((quantiM*100)/inc) + "%");  
   }
}