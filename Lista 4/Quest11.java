import java.util.Scanner;
public class Quest11{
   public static void main(String[] args){
   Scanner leia = new Scanner (System.in);
      int quantW = 0,quantiM = 0, incr = 1 , agec = 0, sizec=0, heightc = 0,
      someAlt = 0, someP = 0, someAge = 0, quantend;
      System.out.println("Digite a quantidade de pessoas para serem calculadas");
      quantend = leia.nextByte();
         do
         { 
            System.out.println("Digite 'M' para homem e 'F' para mulher");
            char gender = leia.next().charAt(0);
            if(gender == 'F')
                        {
                        quantW++;
                        }else if(gender == 'M')
                        {
                        quantiM++;               
                        }          
            System.out.println("Digite a idade");
            byte age = leia.nextByte();
             if(age>=0)
               {
               agec++;
               someAge+= age;
               }
            System.out.println("Digite a altura");
            float height = leia.nextFloat();
            if(height>0)
               {
               heightc++;
               someAlt+=height;
               }
            System.out.println("Digite o peso");
            float size = leia.nextFloat();
               if(size>0)
               {
               sizec++;
               someP+=size;
               }                    
           incr ++;
         }while(incr <=quantend);
         System.out.println("A quantidade de mulhereres sao " + quantW);
         System.out.println("A quantidade de homems sao " + quantiM);
         System.out.println("A media das idades sao " + (double) someAge/agec);
         System.out.println("A media das alturas sao " + (double) someAlt/heightc);
         System.out.println("O peso medio eh " + (double) someP/sizec);
   }
}