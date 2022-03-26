package com.company;

import java.util.Arrays;

public class Ficha2 {

    public static int min(int[] array){
        int minimo = array[0];
        int i;
        for(i=1;i<array.length;i++){
            if (minimo > array[i]) minimo = array[i];
        }
        return minimo;
    }

    public static int[] arrayEntreIndices(int[] numeros, int i, int f){
        int tam = f-i+1;
        int[] res = new int[tam];
        System.arraycopy(numeros,i,res,0,tam);
        return res;
    }

    public static int[] elementosComuns(int[] a, int[] b){
        int[] res = new int[a.length];
        int ind = 0;
        for(int i : a){
            for (int j : b){
                if (a[i] == b[j]) {
                    res[ind++] = a[i];
                    break;
                }
            }
        }
        int[] resultado = new int[ind];
        System.arraycopy(res,0,resultado,0,ind);
        return resultado;
    }

    public static int[] crescente(int[] a){
        Arrays.sort(a);
        return a;
    }

    public static int procuraBinaria(int[] a){
        int ind = Arrays.binarySearch(a,5);
        return ind;
    }

}
