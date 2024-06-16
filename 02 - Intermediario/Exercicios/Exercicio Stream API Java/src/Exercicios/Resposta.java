package Exercicios;

import Exercicios.desafios.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Resposta extends Desafios {

    public static void main(String[] args) {

        Desafios tes = new Desafios();

        List<Integer> numeros = Arrays.asList(3, 1, 4, 5, 7, 8, 10, 9, 2, 6);


        // Desafio 1 - Mostre a lista na ordem numérica:
        String ordenado = ordenarNumeroCrescente(numeros);
        System.out.println("Numero Ordenado\n" + ordenado);

        // Desafio 2 - Imprima a soma dos números pares da lista:
        String pares = numerosPares(numeros);
        System.out.println("Numeros Pares\n" + pares);

        // Desafio 3 - Verifique se todos os números da lista são positivos:
        Boolean verificadorPositivo = verificadorNumerosPositivos(numeros);
        System.out.println("Verificando se o numeros são positivos ou não");
        if (verificadorPositivo) {
            System.out.println("Todos os numeros são positivo");
        } else {
            System.out.println("Todos os numeros NÂO são positivo");
        }

        //Desafio 4 - Remova todos os valores ímpares
        System.out.println(" Removendo todos os valores ímpares");
        String numerosPares = removerNumerosImpares(numeros);
        System.out.println("Antiga Lista:\n" + numeros);
        System.out.println("Nova Lista:\n" + numerosPares);


    }
}
