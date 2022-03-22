import java.util.Scanner;
public class Quest4{
   public static void main(String[] args){
      Scanner leia = new Scanner(System.in);
      int x = 5;
      int y = 100;
      int top = Top(x,y);
      System.out.println(top);
   }
   public static int Top(int x, int y){
       if(y%x==0)
      return Top(x+1,y-1);
      
      
   }
}