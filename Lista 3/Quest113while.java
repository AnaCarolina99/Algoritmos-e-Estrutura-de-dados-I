import java.util.Scanner;
public class Quest113while{
   public static void main(String[] args){
   int tab;
   int i = 1;
   int j =1;
   while(i<=10)
   {
   j=1;
   System.out.println("");
      while(j<=10)
      {
       tab =j*i;
    System.out.println(i + " X " + j + " = " + tab);
      j++;
      }
      i++;
   }
   }
}