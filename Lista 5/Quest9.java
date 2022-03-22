import java.util.Scanner;
public class Quest9{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      short quantiTrue = 0,
            quantiFalse = 0;
      System.out.println("Dite o primeiro lado");
      short x = leia.nextShort();
      System.out.println("Dite o segundo lado");
      short y = leia.nextShort();
      System.out.println("Dite o terceiro lado");
      short z = leia.nextShort();
      for(int i = 1; i<=x ; i++){
         for(int j = 1; j<=y ; j++){
            for(int k = 1; k<=z ; k++){
               if(i> j + k || k > j + i || j> i + k)
                  quantiFalse++;
               else
                  quantiTrue++;
            }
         }
      }
      System.out.println("A quantidade de combinacoes q formam um triangulo sao de " + quantiTrue);
      System.out.println("A quantidade de combinacoes q nao formam um triangulo sao de " + quantiFalse);
   }
}