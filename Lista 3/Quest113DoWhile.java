import java.util.Scanner;
public class Quest113DoWhile{
   public static void main(String[] args){
   int tab;
   int i = 1;
   int j =1;
   do
   {
    j=1;
   System.out.println("");
   do
   {
   tab =j*i;
    System.out.println(i + " X " + j + " = " + tab);
      j++;
   }while(j<=10);
   i++;
   }while(i<=10);
   }
}