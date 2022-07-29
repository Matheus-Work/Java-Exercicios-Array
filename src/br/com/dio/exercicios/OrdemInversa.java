package br.com.dio.exercicios;
/*
Insira um vetor, e mostre o vetor que você criou
e o inverso desse vetor.
 */

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, 8, 6, 4, 5, 3};
        int count=0;
        System.out.println("Vetor: ");
        while (count < (vetor.length)){
            System.out.printf(vetor[count] + " ");
            count++;
        }
        System.out.println("\nVetor");
        for (int i = (vetor.length-1); i>=0; i--){
            System.out.printf(vetor[i] + " "); //Primeira vez que for no laço, vai pegar o valor vetor[5], e vai decrementando o i
        }
    }
}
