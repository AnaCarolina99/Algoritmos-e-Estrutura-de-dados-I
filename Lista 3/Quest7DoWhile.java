public class Quest7DoWhile{
   public static void main(String[] args){
     int i = 1;
     int j = 5;
         do
         {
         j=1;
         do
         {
         System.out.println("A base de " + i + " e altura de " + j + " ,tem area igual a " + (j*i));
         System.out.println("A base de " + i + " e altura de " + j + " ,tem perimetro igual a " + ((2*j)+(i*2)));
         j++;
         }while(j<=8);
         i++; 
         }while(i<=10);
    
   }
}