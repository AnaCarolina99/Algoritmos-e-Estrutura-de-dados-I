public class Quest10While{
   public static void main(String[] args){
      short x = 1;
      short z = 3;
      short h = 2;
      while(x<=5)
      {
      z=3;
         while(z<=6)
         {
         h=2;
               while(h<=4)
               {
                System.out.println("O numero x vale " + x + " ,o numero z " + z + " e o numero h " + h);
                System.out.println("A funcao y vale "+((float)((3*x)/4)+(5*z)-(7*h)));
                h++;
               }
               z++;
         }
         x++;
      }
   }
}