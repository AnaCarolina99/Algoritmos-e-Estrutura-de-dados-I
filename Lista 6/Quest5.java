import java.util.Scanner;
public class Quest5{
   public static void main(String[] args){
      Scanner leia = new Scanner (System.in);
      byte[] vet = new byte[10];
         for(int i = 0; i< vet.length ; i++)
         {
            System.out.println("Digite o numero da posicao " + (i+1));
            vet[i] = leia.nextByte();        
         }
        System.out.println("===========================");
        System.out.println("Ordem inversa");
         for(int i = vet.length - 1; i>=0 ; i--)
         {
         System.out.println(vet[i]);
         }
   }
} 