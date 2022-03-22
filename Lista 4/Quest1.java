import java.util.Scanner;
public class Quest1{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      System.out.println("Digite o inicio do intervalo");
      byte begin = leia.nextByte();
      System.out.println("Digite o final dor intervalo");
      byte end = leia.nextByte();
      System.out.println("Digite o passo do intervalo");
      byte pass = leia.nextByte();
         for(int i = begin;i<=end;i++)
         {
            System.out.println("O comprimeto da circunferencia de raio " + i + " eh igual a " + Math.PI*2*i);
            System.out.println("A area da circunferencia de raio " + i + " eh igual a " + Math.PI*Math.pow(i,2));
            System.out.println();
         }
   }
}