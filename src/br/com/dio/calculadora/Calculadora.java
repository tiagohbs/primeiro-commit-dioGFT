package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a , b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor valor: ");
        b = scan.nextInt();

        float somar = somar(a, b);
        float subtrair = subtrair(a, b);
        float multiplicar = multiplicar(a, b);
        float dividir = dividir(a, b);

        System.out.println("Soma: " + somar);
        System.out.println("Subtração: " + subtrair);
        System.out.println("Multiplicação: " + multiplicar);
        System.out.println("Divisão: " + dividir);
    }

    public static float somar(float a, float b){
        return a + b;
    }public static float subtrair(float a, float b){
        return a - b;
    }public static float multiplicar(float a, float b){
        return a * b;
    }public static float dividir (float a, float b){
        return a / b;
    }
}
