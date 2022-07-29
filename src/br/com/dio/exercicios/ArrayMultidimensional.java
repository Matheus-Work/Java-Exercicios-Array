package br.com.dio.exercicios;
import java.util.Random;
/*
Gere e imprima uma matriz M 4x4 com valores aleatórios
 */
public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int [4][4];
        for (int i = 0; i < M.length;i++){
            for (int j = 0; j<M[1].length;j++){
                M [j][i] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha:M) {
            for (int coluna:linha) {
                System.out.printf(coluna + " ");
            }
            System.out.println();
        }

    }
}
