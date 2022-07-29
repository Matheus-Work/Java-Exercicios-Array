package br.com.dio.exercicios;
import java.util.Random;
/*
Faça um algoritmo que leia 20 números inteiros aleatótios (entre 0 - 100),
armazene num vetor, e no final mostre o seus números aleatórios,
seus sucessores e seus antecessores.
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[5];
        int count =0;
        for (int i =0; i < vetor.length; i++){
            int numerosAleatorios = random.nextInt(100); //Valor máximo é 100
            vetor[i] = numerosAleatorios;
        }
        System.out.println("Seu vetor é: ");
        for (int numero: vetor) {
                System.out.printf(numero + " ");
        }
        System.out.println("\nO sucessor do seu vetor é: ");
        for (int numero: vetor) {
                System.out.printf((numero+1) + " ");
        }
        System.out.println("\nO antecessor do seu vetor é: ");
        for (int numero: vetor) {
                System.out.printf((numero-1) + " ");
        }

    }
}
