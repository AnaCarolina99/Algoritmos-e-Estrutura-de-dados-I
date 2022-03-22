import java.util.Scanner;
public class Quest2{
   public static void main(String[] args){
      Scanner leia = new Scanner(System.in);
      int x = 4;
      int pos = 0;
      int vet []= new int [4];
      for(int i=0;i<vet.length;i++)
         vet[i]=i+1;
      int top = Quant(x,vet,pos);
      System.out.println("A soma vale: " + top);
   }
   public static int Quant(int x,int[] vet,int pos){
      if(vet.length == pos)
      return 0;
      else
      if(vet[pos] == x)
      return 1 + Quant(x,vet,pos+1);
      else
      return 0 + Quant(x,vet,pos+1);
      
   }
}