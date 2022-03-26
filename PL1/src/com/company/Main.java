package com.company;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;
import java.lang.String;

import static java.lang.Integer.valueOf;

public class Main {

    public static long factorial(int num){
        long fact = 1;
        if (num == 0) return fact;
        else{
            while(num >= 1) {
                fact *= num;
                num--;
            }
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num2, num1;
        long fact = 1;

       //pergunta 1
        System.out.print("Valor em graus Celsius?: ");
        double graus = sc.nextDouble();
        System.out.println(Ex1.celsiusParaFarenheit(graus) + "F");

        //pergunta2
        System.out.print("Qual o máximo entre dois numeros?: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int aux = Ex2.maximoNumeros(num1,num2);
        System.out.println(aux);

        //pergunta3
        System.out.print("Diga um nome e um saldo: ");
        String nome = sc.next();
        double saldo = sc.nextDouble();
        String nomeSaldo = Ex3.criaDescricaoConta(nome,saldo);
        System.out.println(nomeSaldo);

        //pergunta4
        System.out.println("Diga um valor em euros: ");
        double valor = sc.nextDouble();
        System.out.println("Diga uma taxa de conversão: ");
        double taxa = sc.nextDouble();
        double libras = Ex4.eurosParaLibras(valor,taxa);
        System.out.println(libras);

        //pergunta5
        System.out.println("Diga dois numeros:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        double media = (num1 + num2) / 2;
        if (num1 > num2){
            System.out.println(num1);
            System.out.println(num2);
        }
        else {
            System.out.println(num2);
            System.out.println(num1);
        }
        System.out.println(media);

        //pergunta6
        int value = valueOf(args[0]);
        fact = Ex6.factorial(value);
        System.out.println(fact);

        //pergunta7
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("O tempo do inicio é: " + currentDateTime);
        long timeInit = System.nanoTime();
        fact = Ex6.factorial(5000);
        System.out.println(fact);
        long timeFim = System.nanoTime();
        LocalTime time = LocalTime.now();
        long hora = time.getHour(); long min = time.getMinute(); long sec = time.getSecond();
        System.out.println("Hora do fim é: " + hora + ":" + min + ":" + sec);
        double timePassed = (timeFim - timeInit) * 10e-6;
        System.out.println(timePassed + "ms");

    }
}
