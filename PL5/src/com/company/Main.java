package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Lampada l1 = new Lampada(Lampada.Modo.ECO, 1, 2, 40, 10);
        Lampada l2 = new Lampada(Lampada.Modo.ON, 1, 3, 30, 20);
        Lampada l3 = new Lampada(Lampada.Modo.OFF, 2, 4, 20, 10);
        Lampada l4 = new Lampada(Lampada.Modo.ON, 3, 5, 60, 30);
        Lampada l5 = new Lampada();

        ArrayList<Lampada> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        CasaInteligente casa = new CasaInteligente(list);

        //casa.ligaLampadaNormal(0);
        //System.out.println(casa.getLampadas().toString());
        //casa.ligaLampadaEco(2);
        //casa.addLampada(l1);
        //System.out.println(casa.qtEmEco());
        //casa.removeLampada(3);
        //casa.ligaTodasEco();
        //casa.ligaTodasNormal();
        //System.out.println(casa.consumoTotal());
        //System.out.println(casa.maisGastadora());
        //System.out.println(casa.getLampadas().toString());
        //System.out.println(casa.podiumEconomia().toString());

        Stack stack = new Stack();
        stack.stack.add("Ola");
        stack.stack.add("Adeus");
        stack.stack.add("Xau");
        System.out.println(stack.top());
        stack.push("Bye");
        System.out.println(stack.stack.toString());
        stack.pop();
        System.out.println(stack.stack.toString());
        System.out.println(stack.empty());
        System.out.println(stack.length());
    }
}
