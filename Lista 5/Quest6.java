import java.util.Scanner;
public class Quest6{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      int a = 1;
      int b = 0;
      System.out.println("Digite a quantiade de termos calculados");
      int enesimo = leia.nextInt();
      int aux;
         for(int i = 0; i<enesimo;i++)
         {
         System.out.println(a);
         aux = a;
         a = a + b;
         b = aux;
         }
   }
}
