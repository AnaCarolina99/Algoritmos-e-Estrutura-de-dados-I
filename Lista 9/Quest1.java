import java.util.Scanner;
public class Quest1{
   public static void main(String[] args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite um numero");
      int x = leia.nextInt();
      System.out.println("Digite o numero da potencia");
      int n = leia.nextInt();
      
      FatIt(x,n);
      int Recu = FatRecu(x,n);
      System.out.println(Recu);
      int recu = SomeRecu(x,n);
      System.out.println(recu);  
      }
      //Recursividade
      public static int FatRecu(int x,int n)
      {
         if(n==0)
         return 1;
         else
         return x * FatRecu(x,n-1);
      }
      //Iteratividade
      public static void FatIt(int x,int n){
         int fat = 1;
         for(int i = 1;i<=n;i++){
            fat *= x;
         }
         System.out.println(fat);
      }   
       
}