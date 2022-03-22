public class Quest1{
   public static void main(String[] args){
      int x = 7; 
      int top = XYZ(x);
      System.out.println("A soma vale: " + top);
   }
   public static int XYZ(int x){
      if(x>0)
      return x + XYZ(x-1);
      else
      return 0;
      
   }
}