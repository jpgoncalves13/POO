package com.company;

import java.time.LocalDate;
import java.time.Period;

public class Ex3 {
    LocalDate[] date = new LocalDate[2];
    private int j = 0;

    public void insereData(LocalDate data){
        this.date[j] = data;
        j++;
    }

    public LocalDate dataMaisProxima(LocalDate data){
        Period per = Period.between(data,this.date[0]);
        LocalDate loc = date[0];
        int ano = per.getYears(), mes = per.getMonths(), dia = per.getDays();
        for(int i=0; i<date.length; i++){
            Period per_aux = Period.between(data,this.date[i]);
            int ano2 = per_aux.getYears();
            int mes2 = per_aux.getMonths();
            int dia2 = per_aux.getDays();

            if (ano2 < ano) {
                ano = ano2;
                loc = date[i];
            }
            else if (ano2==ano && mes2<mes){
                mes = mes2;
                loc = date[i];
            }
            else if (ano2==ano && mes2==mes && dia2<dia){
                dia = dia2;
                loc = date[i];
            }

        }
        return loc;
    }

    public String toString(){
        String str = date[0].toString();
        for(int i=1; i<date.length; i++){
            str = str + " " + date[i].toString();
        }
        return str;
    }
}
