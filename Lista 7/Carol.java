import java.util.*;
public class Carol{
  public static void main(String[] args){
    int[][] array = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};

    int[][] folha1 = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
    int[][] folha2 = {{2,2,2,2,2},{2,2,2,2,2},{2,2,2,2,2},{2,2,2,2,2},{2,2,2,2,2}};
    int[][] folha3 = {{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3}};
    int[][][] arranjo = {folha1,folha2,folha3};

    System.out.println("*************** MATRIZ TRIANGULAR SUPERIOR ***************\n");

    String str = "";

    for(int i = 0; i < array.length; i++, str += "\t"){
      System.out.print(str);
      for(int j = 0; j < array.length; j++){

      if(i <= j){
          System.out.print(array[i][j]+"\t");
        }
      }
      System.out.println("");
    //  System.out.println(str);
    }

    System.out.println("\n*************** MATRIZ ***************\n");

    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array.length; j++){
        System.out.print(array[i][j]+"\t");
      }
      System.out.println();
    }

    System.out.println("\n*************** SOMA LINHAS/COLUNAS ***************\n");

    int coluna = 0;
    int linha = 0;

    for(int i = 0; i < array.length; i++){

      for(int j = 0; j < array.length; j++){
          //System.out.print(array[i][j]+"\t");
          linha += array[i][j];
          coluna += array[j][i];
      }
      System.out.println("linha: "+linha);
      System.out.println("coluna: "+coluna);
      //coluna = 0;
      linha = 0;
    //  System.out.println(str);
    }

    System.out.println("\n*************** CUBO ***************\n");
    for(int i = 0; i < arranjo.length; i++){
      for(int j = 0; j < arranjo.length; j++){
        for(int k = 0; k < arranjo.length; k++){
          System.out.print(arranjo[i][j][k]+"\t");
        }
        System.out.println();
      }
      System.out.println("\n*************************************\n");
    }

    System.out.println("\n************RANDOM**************\n");

    int[][] aleatoria = new int[7][9];
    int[] quantidadeDeVezes = new int[10];
    int pos = 0;
    Random gerador = new Random();

    linha = aleatoria.length;
    coluna = aleatoria[0].length;

    for(int i = 0; i < linha; i++){
      for(int j = 0; j < coluna; j++){
        pos = (gerador.nextInt(9)+1);
        aleatoria[i][j] = pos;
        pos--;
        quantidadeDeVezes[pos]++;
      }
    }
    System.out.println("\n******************MATRIZ*******************\n");

    for(int i = 0; i < linha; i++){
      for(int j = 0; j < coluna; j++){
        System.out.print(aleatoria[i][j]+"\t");
      }
      System.out.println();
    }
    System.out.println("\n******************Quantidade De Vezes*******************\n");

    for(int i = 0; i < quantidadeDeVezes.length; i++){
        System.out.println("pos: "+(i+1)+" "+quantidadeDeVezes[i] + " ");
    }

  }
}
