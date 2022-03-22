import java.util.Scanner;
public class Quest15{
   public static void main(String[]args){
      float VET[]= new float[200];
            VET[0]=1;
            VET[1]=1;
      int cont1 = 0,
          cont2 = 0,
          a = 0,
          quant = 0;
         for(int i = 2;i<20;i++)
         {
            VET[i] = VET[i-1] + VET[i-2];
         }
         
         System.out.println("Sequencia de Fibonacci");
         
               for(int i=0;i<20;i++)
            {
               cont1=0;
               for(int j=1;j<=VET[i];j++)
                  if(VET[i]%j==0)
                     cont1++;
               if(cont1 == 2)
                  quant++;          
            }
            
            double VET2[] = new double[quant];
            
            for(int i=0;i<20;i++)
            {
               cont2=0;
               for(int j = 1;j<=VET[i];j++)
                  if(VET[i]%j==0)
                     cont2++;
               if(cont2 == 2)
               {
                  VET2[a]=VET[i];
                  a++;
               }       
            }
      
         for(short i=0;i<20;i++)
         {
            System.out.print(VET[i]+" ");
         } 
         System.out.println("Numeros primos da sequencia de Fibonacci");
         for(int i=0;i<quant;i++)
         System.out.print(VET2[i]+" ");  
   }
}