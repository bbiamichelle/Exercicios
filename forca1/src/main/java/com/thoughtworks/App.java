package com.thoughtworks;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println(" Você tem que advinhar a palavra que eu estou pensando");
        System.out.println(" Digite uma palavra: ");
        String nome = "";
        
            while ( !nome.equals("Casa")){
            Scanner scan = new Scanner(System.in);
            nome = scan.nextLine().trim();
            
            if (nome .equals("Casa")){
                System.out.println("Acertou");
            } else {
                System.out.println("Você não acertou, tente de novo");
            }
            
        }
    }
}
