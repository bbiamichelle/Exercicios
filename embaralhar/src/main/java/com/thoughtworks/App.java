package com.thoughtworks;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println(" Adivinhe a palavra monstruosa que me deu dor de cabeça: ");

        List<String> listaDePalavras = criaListaDePalavras();
        String palavra = listaDePalavras.get(0);
        String palavraEmbaralhada = embaralhaPalavra(palavra);

        System.out.println(" A palavra é " + palavraEmbaralhada);
        System.out.println(" Escreva a palavra: ");

        int tentativas = 6;

        while (tentativas > 0) {

            Scanner scan = new Scanner(System.in);
            String respostaUsuario = scan.nextLine().trim();

            if (respostaUsuario.equalsIgnoreCase(palavra)) {
                System.out.println("Acertou");
                break;

            } else {
                tentativas = tentativas - 1;
                imprimeNumeroDeTentativas(tentativas);
            }

        }
    }

    private static void imprimeNumeroDeTentativas(int tentativas) {
        if (tentativas == 0) System.out.println("ACABOU MANE!!!");
        else System.out.println("Ops, Você errou! Você tem " + tentativas + " tentativas");
    }

    private static List<String> criaListaDePalavras() {
        List<String> listaDePalavras = new ArrayList<String>();

        listaDePalavras.add("ADIVINHAR");
        listaDePalavras.add("CORRER");
        listaDePalavras.add("BOLO");
        listaDePalavras.add("PASSARINHO");
        listaDePalavras.add("CAIXA");

        Collections.shuffle(listaDePalavras);
        return listaDePalavras;
    }

    private static String embaralhaPalavra(String palavra) {
        List<String> palavraEmbaralhada = Arrays.asList(palavra.split(""));

        Collections.shuffle(palavraEmbaralhada);

        return String.join("", palavraEmbaralhada);
    }
}
