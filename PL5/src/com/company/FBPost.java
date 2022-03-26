package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class FBPost {
    int id;
    String username;
    LocalDateTime date;
    String conteudo;
    int num_likes;
    ArrayList<String> comentarios;

    public FBPost(){
        this.id = 0;
        this.username = null;
        this.date = null;
        this.conteudo = null;
        this.num_likes = 0;
        this.comentarios = new ArrayList<>();
    }

    public FBPost(int id, String username, LocalDateTime date, String cont){
        this.id = id;
        this.username = username;
        this.date = date;
        this.conteudo = cont;
    }

    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public int getNum_likes() {
        return this.num_likes;
    }

    public ArrayList<String> getComentarios() {
        return this.comentarios;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setNum_likes(int num_likes) {
        this.num_likes = num_likes;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public boolean equals(Object o) {
        if (this==o) return true;
        if ((o == null) || (this.getClass() != o.getClass())) return false;

        FBPost p = (FBPost) o;
        return  p.username.equals(this.username) &&
                p.conteudo.equals(this.conteudo) &&
                p.date.equals(this.date) &&
                p.num_likes == this.num_likes &&
                p.id == this.id &&
                p.comentarios.equals(this.comentarios);
    }
}
