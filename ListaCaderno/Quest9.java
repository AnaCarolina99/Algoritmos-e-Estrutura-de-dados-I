import java.util.Scanner;
public class Quest9{
   public static void main(String[] args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite o primeiro lado triangulo");
      int side1 = leia.nextInt();
      System.out.println("Digite o segundo lado triangulo");
      int side2 = leia.nextInt();
      System.out.println("Digite o terceiro lado triangulo");
      int side3 = leia.nextInt();
      boolean met = Tri(side1,side2,side3);
   }
   
  public static boolean Tri(int side1, int side2, int side3){
      boolean existe = true;
      if(side1 <=(side2 + side3) && side2 <=(side1 + side3) && side3 <=(side2 + side1))
      {
      System.out.println("Eh um triangulo");
      existe = true;
      }
      else if(side1 >(side2 + side3) || side2 >(side1 + side3) || side3 >(side2 + side1))
      {
      System.out.println("Nao eh um triangulo");
      existe = false;
      }
      return existe;
      
  }
}