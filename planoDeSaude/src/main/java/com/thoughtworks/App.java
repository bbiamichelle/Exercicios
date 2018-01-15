package com.thoughtworks;

public class App {

    public static void main(String[] args) {

        String Nome = "Marcelo";
        int idade = 65;

        if (idade <= 10) printHealthInsuranceCost(Nome, 30.00);
        else if (idade > 10 && idade <= 29) printHealthInsuranceCost(Nome, 60.00);
        else if (idade > 29 && idade <= 45) printHealthInsuranceCost(Nome, 120.00);
        else if (idade > 45 && idade <= 59) printHealthInsuranceCost(Nome, 150.00);
        else if (idade > 59 && idade <= 65) printHealthInsuranceCost(Nome, 250.00);
        else printHealthInsuranceCost(Nome, 400.00);

    }

    private static void printHealthInsuranceCost(String nome, double cost) {
        System.out.println("O USUARIO " + nome + " deverá pagar R$" + cost);
    }
}
