import java.util.Scanner;
public class Questi5{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      boolean par = true,   
              primo = true;
      short incr = 0;
         for(int i = 1;i<=10;i++)
         {
            System.out.println("Digite o numero");
            short number = leia.nextShort();
               for(int j = 1 ; j<=number; j++)
               {
                  if(number % j == 0)
                  {
                     incr++;                  
                  }
               }
               if(incr==2)
                        {
                         primo = true;
                        }
                        else
                        {
                        primo = false;
                        }

             for(int k = 1; k<=10;k++)
             {
               if(number % 2 != 0)
               {
               par = false;
               }
               else
               {
               par = true;
               }
             }
             
               if(par == false && primo == true)
               {
               System.out.println("Numero = " + number + " eh impar e primo");
               }
               else if(par == false && primo == false)
               {
               System.out.println("Numero = " + number + " eh impar e nao primo");
               } 
               else if(par == true && primo == true)
               {
               System.out.println("Numero = " + number + " eh par e primo");
               } 
               else if (par == true && primo == false)
               {
               System.out.println("Numero = " + number + " eh par e nao primo");
               }              
         }
   }
}