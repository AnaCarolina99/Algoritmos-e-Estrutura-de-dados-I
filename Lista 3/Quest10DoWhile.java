public class Quest10DoWhile{
   public static void main(String[] args){
      short x = 1;
      short z = 3;
      short h = 2;
      do
      {
         z=3;
         do
         {
            h=2;
            do
            {
             System.out.println("O numero x vale " + x + " ,o numero z " + z + " e o numero h " + h);
                System.out.println("A funcao y vale "+((float)((3*x)/4)+(5*z)-(7*h)));
                h++;
            }while(h<=4);
            z++;
         }while(z<=6);
         x++;
      }while(x<=5);
         }
}