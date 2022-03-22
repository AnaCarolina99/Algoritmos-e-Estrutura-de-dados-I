public class Quest7While{
   public static void main(String[] args){
     int i = 1;
     int j = 5;
      while(i<=10)
      {
      j=1;
          while(j<=8)
          {
          System.out.println("A base de " + i + " e altura de " + j + " ,tem area igual a " + (j*i));
          System.out.println("A base de " + i + " e altura de " + j + " ,tem perimetro igual a " + ((2*j)+(i*2)));
          j++;
          } 
          i++; 
      }
   }
}