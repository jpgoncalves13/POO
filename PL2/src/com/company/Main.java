package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private static void imprimeArray(int[] numeros){
        for (int n: numeros) System.out.println(n);
    }

    private static void imprimeMatriz(int[][] Notas){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.println(Notas[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    private static void imprimeLocalDate(LocalDate[] date){
        for(int i = 0; i < date.length; i++){
            System.out.println(date[i]);
        }
    }

    public static void main(String[] args) {
        Ex2 ex = new Ex2();
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Alinea a) ");
        System.out.println("Qts elementos quer ler? ");
        int dim = sc.nextInt();

        int[] numeros = new int[dim];
        System.out.println("Insira " + dim + " numeros");
        for(int i = 0; i<dim; i++) numeros[i] = sc.nextInt();

        System.out.println("Array numeros: ");
        for(int n: numeros) System.out.println(n);*/

        /***********************************************************************/

        //Calcular o minimo

        /*int min = Ficha2.min(numeros);
        System.out.println("O minimo é " + min);*/

        /********************************************************************/

        /*System.out.println("Alinea b)");

        System.out.println("Indice inicial: ");
        int indI = sc.nextInt();
        System.out.println("Indice final: ");
        int indF = sc.nextInt();

        int[] res = Ficha2.arrayEntreIndices(numeros,indI,indF);
        imprimeArray(res);*/

        /*********************************************************************/

        /*int[] arr = {1,5,3,20,1};

        System.out.println("Alinea c)");
        int[] array = Ficha2.elementosComuns(numeros,arr);
        imprimeArray(array);*/

        /*********************************************************************/

       /* System.out.println("Ex 4. a)");

        int[] array = Ficha2.crescente(numeros);
        imprimeArray(array);
        System.out.println("\n");*/

        /*************************************************************************/
        /*System.out.println("b) ");
        int result = Ficha2.procuraBinaria(numeros);
        System.out.println(result);*/

        /**************************************************************************/
        /*System.out.println("2.a) ");

        ex.preencheArray(ex.notas);

        imprimeMatriz(ex.notas);*/

        /****************************************************************************/

       /* System.out.println("2.b) ");

        System.out.println("Escolha uma unidade curricular de 0 a 4: ");
        int uCurricular = sc.nextInt();

        int soma = ex.somaNotasUC(uCurricular);

        System.out.println("A soma das notas da UC é: ");
        System.out.println(soma);*/

        /****************************************************************************************/

        /*System.out.println("2.c) ");

        System.out.println("Escolha um aluno de 0 a 4: ");
        int nAluno = sc.nextInt();

        soma = ex.somaNotasAluno(nAluno);

        System.out.println("A soma das notas do aluno é: ");
        System.out.println(soma);*/

        /******************************************************************************************/

       /* System.out.println("2.d) ");
        System.out.println("Escolha uma unidade curricular de 0 a 4: ");

        int nUC = sc.nextInt();
        int media = ex.calculaMedia(nUC);

        System.out.println("A média da UC é: ");
        System.out.println(media);*/

        /******************************************************************************************/

        /*System.out.println("2.e) ");
        System.out.println("A nota mais alta é: ");
        int maisAlta = ex.calculaMaisAlta();
        System.out.println(maisAlta);*/

        /*******************************************************************************************/

        /*System.out.println("2.f) ");
        System.out.println("A nota mais baixa é: ");
        int maisBaixa = ex.calculaMaisBaixa();
        System.out.println(maisBaixa);*/

        /**********************************************************************************************/

        /*System.out.println("2.g) ");
        int nota = sc.nextInt();
        System.out.println("As notas acima de " + nota + " são: ");
        int[] array = ex.acimaValor(nota);
        System.out.println("Os elementos que estão acima de " + nota + " são:");
        imprimeArray(array);*/

        /**********************************************************************************************/

        /*System.out.println("2.h) ");
        char[] val = ex.strcpy();
        System.out.println(val);*/

        /**********************************************************************************************/

        /*System.out.println("2.i) ");
        System.out.println("O indice da UC com maior media é: ");
        int maior = ex.UCmaismedia();
        System.out.println(maior);*/

        /**********************************************************************************************/

        Ex3 ex3 = new Ex3();
        System.out.println("3.a) ");
        System.out.println("Diga o ano, o mes e o dia: ");
        int ano = sc.nextInt();
        int mes  = sc.nextInt();
        int dia = sc.nextInt();
        LocalDate date = LocalDate.of(ano,mes,dia);
        ex3.insereData(date);
        ex3.insereData(LocalDate.of(2012,04,05));
        imprimeLocalDate(ex3.date);

        /***********************************************************************************************************/

        System.out.println("3.b) ");
        System.out.println("Diga o ano, o mes e o dia: ");
        int ano1 = sc.nextInt();
        int mes1  = sc.nextInt();
        int dia1 = sc.nextInt();
        LocalDate date1 = LocalDate.of(ano1,mes1,dia1);
        LocalDate date2 = ex3.dataMaisProxima(date1);
        System.out.println(date2);

        /********************************************************************************************************/

        System.out.println("3.c) ");
        String str = ex3.toString();
        System.out.println(str);

    }
}
