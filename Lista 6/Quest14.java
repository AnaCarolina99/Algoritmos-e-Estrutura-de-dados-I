import java.util.Scanner;
public class Quest14{
   public static void main(String[]args){
      float VET[]=new float[200];
      VET[0]=1;
      VET[1]=1;
         for(short i = 2;i<200;i++)
         {
            VET[i] = VET[i-1] + VET[i-2];
         }
         
         System.out.println("Sequencia de Fibonacci");
      
         for(short i=0;i<200;i++)
         {
            System.out.print(VET[i]+" ");
         }   
   }
}