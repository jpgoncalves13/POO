package com.company;

import java.util.Scanner;

public class Ex2 {

    int[][] notas = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

    Scanner sc = new Scanner(System.in);

    public void preencheArray(){
        /*int i;
        int j;
        for(i=0; i<5; i++){
            for(j=0; j<5; j++) {
                System.out.println("Insira a nota do aluno " + i + " para a UC " + j + ":");
                int nota = sc.nextInt();
                notas[i][j] = nota;
            }
        }*/
    }

    // Ex2. b)
    public int somaNotasUC(int j){
        return this.notas[0][j] + this.notas[1][j] + this.notas [2][j] + this.notas [3][j] + this.notas [4][j];
    }

    //c)
    public int somaNotasAluno(int i){
        return this.notas[i][0] + this.notas [i][1] + this.notas [i][2] + this.notas [i][3] + this.notas [i][4];
    }

    //d)
    public int calculaMedia(int j){
        return somaNotasUC(j) / 5;
    }

    //e)
    public int calculaMaisAlta(){
        int max = notas[0][0];
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (max < this.notas[i][j]) max = this.notas[i][j];
            }
        }
        return max;
    }

    //f)
    public int calculaMaisBaixa(){
        int min = notas[0][0];
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (min > this.notas[i][j]) min = this.notas[i][j];
            }
        }
        return min;
    }

    //g)
    public int[] acimaValor(int valor){
        int ind = 0;
        int[] array = new int[25];
        for (int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if (notas[i][j] > valor) array[ind++] = notas[i][j];
            }
        }
        int[] resultado = new int[ind];
        System.arraycopy(array,0,resultado,0,ind);
        return resultado;
    }

    //h)
    public char[] strcpy(){
        char[] str = new char[25];
        int i,j,ind = 0;
        for (i=0; i<5; i++){
            for(j=0; j<5; j++){
                str[ind++] = Integer.toString(notas[i][j]).charAt(0);
            }
        }
        return str;
    }

    //i)

    public int UCmaismedia(){
        int i, res=0, media, maior = calculaMedia(0);
        for(i=0; i<5; i++){
            media = calculaMedia(i);
            if (maior < media) {
                maior = media;
                res = i;
            }
        }
        return res;
    }


}
