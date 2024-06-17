package Exercicios.desafios;

import java.util.*;
import java.util.stream.Collectors;

public class Desafios {
    
    /**
     * Desafio 1 - Mostre a lista na ordem numérica:
     * Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
     */
    public static String ordenarNumeroCrescente(List<Integer> numeros) {
        return numeros.stream()
                .sorted(Comparator.naturalOrder()) // Ordena em ordem Crescente
                .map(String::valueOf) // Converte cada número para string
                .collect(Collectors.joining(", ")); // Junta os números com ", "
    }

    /**
     * Desafio 2 - Imprima a soma dos números pares da lista:
     * Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
     */
    public static String numerosPares(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .map(String::valueOf) // Converter cada numero em String
                .collect(Collectors.joining(", "));
    }


    /**
     * Desafio 3 - Verifique se todos os números da lista são positivos:
     * Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
     */
    public static boolean verificadorNumerosPositivos(List<Integer> numeros) {
        return numeros.stream()
                .allMatch(n -> n > 0);
    }

    /**
     * Desafio 4 - Remova todos os valores ímpares:
     * Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
     */
    public static List<Integer> removerNumerosImpares(List<Integer> numeros) {
        List<Integer> listaModificavel = new ArrayList<>(numeros);
        listaModificavel.removeIf(n -> n % 2 != 0);
        return listaModificavel;
    }

    /**
     * Desafio 5 - Calcule a média dos números maiores que 5:
     * Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
     */
    public static OptionalDouble mediaMaiorQueCinco(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average();
    }

    /**
     * Desafio 6 - Verificar se a lista contém algum número maior que 10:
     * Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
     */
    public static boolean verificarNumeroMaiorQueDez(List<Integer> numeros) {

        return numeros.stream()
                .anyMatch(n -> n > 10);
    }

    /**
     * Desafio 7 - Encontrar o segundo número maior da lista:
     * Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
     */
    public static Optional<Integer> verificarSegundoMaiorNumero(List<Integer> numeros) {
        return numeros.stream()
                .distinct() // Remove duplicadas
                .sorted(Comparator.reverseOrder())
                .skip(1) // Pula o maior numero
                .findFirst(); // Obtem o segundo maior número

    }


}
