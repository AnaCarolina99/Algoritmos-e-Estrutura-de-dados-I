import java.util.Scanner;
public class Quest10{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Imforme a quantidade de pessoas calculadas");
      short number = leia.nextShort();
      short quantiAge = 0, 
            menor = 2020,
            mediaAge = 0,
            incr = 0,
            quantiAge2 = 0,
            someAltura = 0,
            quantiAge3 = 0,
            someAltura2 = 0;
      String menorName = "";
      do
      {
         System.out.println("Digite o nome");
         leia.nextLine();         
         String name = leia.nextLine();
         System.out.println("Digite o ano de nascimento");
         short age = leia.nextShort();
         System.out.println("Digite a altura");
         float height = leia.nextFloat();
         if(age < 2005)
            quantiAge++;
            
         if(age<menor){
            menor = age;
            menorName = name;
         }
            
         if(age<=1985){
            quantiAge2++;
            if(height>0)
               someAltura += height;
         }
         if(age>1985){
            quantiAge3++;
            if(height>0)
               someAltura2 += height;
         }
         System.out.println("Nome da pessoa mais nova e sua idade " + menor + " e seu nome" +menorName);   
         number--;
      }while(1<=number); 
      System.out.println("A quantidade de pessoas q nasceram antes de 2005 foi " +quantiAge);
      System.out.println("Altura media das pessoas nascidas antes de 1985 " +(float)someAltura/quantiAge2);
      System.out.println("Altura media das pessoas nascidas depois de 1985 " +(float)someAltura2/quantiAge3);
   }
}