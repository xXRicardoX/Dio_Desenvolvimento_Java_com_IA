package Exercicios;

import Exercicios.desafios.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;


public class Resposta extends Desafios {

    public static void main(String[] args) {



        List<Integer> numeros = Arrays.asList( 3, 1, 4, 5, 7, 8, 10, 9, 2, 6, 11, 12, 13, 14);


        // Desafio 1 - Mostre a lista na ordem numérica:
        System.out.println("Desafio 01 - Mostre a lista na ordem numérica:");
        String ordenado = ordenarNumeroCrescente(numeros);
        System.out.println("Numero Ordenado\n" + ordenado);

        // Desafio 2 - Imprima a soma dos números pares da lista:
        System.out.println("\nDesafio 02 - Imprima a soma dos números pares da lista:");
        String pares = numerosPares(numeros);
        System.out.println("Numeros Pares\n" + pares);

        // Desafio 3 - Verifique se todos os números da lista são positivos:
        boolean verificadorPositivo = verificadorNumerosPositivos(numeros);
        System.out.println("\nDesafio 03 Verificando se o numeros são positivos ou não");
        if (verificadorPositivo) {
            System.out.println("Todos os numeros são positivo");
        } else {
            System.out.println("Todos os numeros NÂO são positivo");
        }

        //Desafio 4 - Remova todos os valores ímpares
        System.out.println("\nDesafio 04 - Removendo todos os valores ímpares");
        List<Integer> novaLista = removerNumerosImpares(numeros);
        System.out.println("Antiga Lista:\n" + numeros);
        System.out.println("Nova Lista:\n" + novaLista);


        // Desafio 5 - Calcule a média dos números maiores que 5
        System.out.println("\nDesafio 05 - Calcule a média dos números maiores que 5");
        OptionalDouble mediaMaiorQueCinco = mediaMaiorQueCinco(numeros);
        System.out.println("A média maior que cinco é " + mediaMaiorQueCinco);

        // Desafio 6 - Verificar se a lista contém algum número maior que 10:
        System.out.println("Desafio 6 - Verificar se a lista contém algum número maior que 10:");
        boolean verificadorMaiorDez = verificarNumeroMaiorQueDez(numeros);
        if(verificadorMaiorDez){
            System.out.println("Tem numero maior que dez");
        }else {
            System.out.println("NÂO tem numero maior que dez");
        }

        // Desafio 7 - Encontrar o segundo número maior da lista
        System.out.println("\nDesafio 07 - Encontrar o segundo número maior da lista");
        Optional<Integer> encontrandoSegundoMaiorValor = verificarSegundoMaiorNumero(numeros);
        encontrandoSegundoMaiorValor.ifPresentOrElse(
                n -> System.out.println("O segundo maio numero da lista é: " + n),
                () -> System.out.println("A lista não tem um segundo maior numero")
        );

    }
}
