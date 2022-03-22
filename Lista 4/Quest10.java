import java.util.Scanner;
public class Quest10{
   public static void main(String[] args){
   Scanner leia = new Scanner (System.in);
   System.out.println("Digite a quantidade de pessoas calculadas");
   byte sequence = leia.nextByte();
   short  quantiAgeOld = 0 , quantiSalary3 = 0, inc = 0,
   quantiA = 0, someAge = 0;
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
            System.out.println("Digite a cor dos olhos, 'A' para azul, 'C' para castanho, 'P' para preto e 'V' para verde");
            char eyes = leia.next().charAt(0);
            System.out.println("Digite a cor do cabelo, 'L' para loiro, 'P' para preto, 'C' para castanho e 'R' para ruivo");
            char hair = leia.next().charAt(0);
            System.out.println("Digite o salario");
            short salary = leia.nextShort();
         
                  if(gender == 'F')
                  {
                     if(hair == 'L')
                     {
                        if(eyes == 'A' || eyes == 'V')
                        {
                           if(age>=18 && age<=25)
                           {
                              if(state == 'S')
                              {
                                 if(salary >10000)
                                 {
                                    quantiA++;
                                 }
                              }
                           }
                        }
                     }
                  }
                  if(gender == 'M')
                  {
                     if(state == 'S')
                     {
                        if(age>=0)  
                        someAge+= age;
                     }
                     quantiAgeOld++;
                  }
                  if(sequence>0)
                  {
                     if(salary<=0)
                     {
                     quantiSalary3++;
                     }
                  }
        inc++;             
        sequence--;
      }while(1<=sequence);
      System.out.println("A Quantidade de mulheres loiras, de olhos azuis ou verdes, com idade entre 18 e 25 anos, solteiras, salário > R$ 10.000,00 eh de " + quantiA); 
      System.out.println("Idade media dos homens solteiros eh de " + (float)(someAge/quantiAgeOld));
      System.out.println("Percentual de pessoas que não possuem salario eh de " + (float)((quantiSalary3*100)/inc) + "%");  
   }
}