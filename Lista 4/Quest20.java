public class Quest20
{
   public static void main(String[] args)
   {
     // Questao 1
      short numberS1 = 1, 
            raizS1 = 3 , 
            denominadorS1 = 1;
      float S1 = 0;      
      for(int i = numberS1; i<=20; i++)
      {
         S1 += (double)(i + Math.sqrt(raizS1)) / denominadorS1;
         
         raizS1 += 2;
         denominadorS1 += 2;
      }  
      System.out.println("O Resultado de S1 eh de " +(double)3/4 *S1);
      
      // Questao 2
      short numberS2 = 4 , 
            denominadorS2 = 2;            
      float S2 = 0;
          
      for(int i = 1; i<=20; i++)
      {
         S2 += (double)(numberS2 * i) / Math.pow(denominadorS2, 2);
         numberS2 += 4;
         denominadorS2 += 2;
         
      }   
      System.out.println("O Resultado de S2 eh de " +Math.sqrt(S2));
      
      // Questao 3
      short numberS3 = 1,
            denominadorS3 = 4 ;
      float S3 = 0 ;
      
      for(int i = 1; i<=20 ; i++)
      {
       S3 += (double) i/(numberS3 + denominadorS3);
       numberS3 += 2;
       denominadorS3 += 2;
      } 
      System.out.println("O Resultado de S3 eh de " +(double) 1 + (S3)); 
      
      // Questao 4
      short numberS4 = 1 ,
            denominadorS4 = 1 ;
      float S4 = 0;
      for(int i = 1 ; i<=20 ; i++)
      {
      S4+=(double) i/(numberS4 + denominadorS4);
      numberS4 += 2;
      denominadorS4 += 1;
      }
      System.out.println("O Resultado de S4 eh de " +(double)1 + Math.sqrt(S4));
      
      // Questao 5
      short numberS5 = 1 ,
            denominadorS5 = 3 ;
      float S5 = 0;
      for(int i = 3 ; i<=60 ; i+=3)
      {
      S5+= (double) (i + Math.sqrt(numberS5))/ denominadorS5 ;
      numberS5 += 1  ;
      denominadorS5 += 2 ; 
      } 
      System.out.println("O Resultado de S5 eh de " +(double)2/5 * S5); 
      
      // Questao 6
      short numberS6 = 3 ,
            denominadorS6 = 1 ;
      float S6 = 0;
      for(int i = 2 ; i<=40 ; i+=2)
      {
      S6 += (double) (i + Math.sqrt(numberS6))/ denominadorS6;
      numberS6 += 2 ;
      denominadorS6 += 2 ;
      }
      System.out.println("O Resultado de S6 eh de " +(double)Math.sqrt(S6));       
   }
}