package com.company;
import java.lang.String;

import static java.lang.String.valueOf;

public class Ex3 {
    public static String criaDescricaoConta(String nome, double saldo){
        String aux = valueOf(saldo);
        return nome + " " + aux;
    }
}
