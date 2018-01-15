package com.thoughtworks;


public class App 
{
    public static void main( String[] args )
    {

        int a = 0;
        int b = 1;

        while ( b <= 500){

            a = a + b;

            System.out.println("Serie Fibonacci " + a);

            b = a - b;
        }
    }
}
