package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class TurmaAL {
    private String designacao;
    private List<Aluno> alunos;

    /**
     * construtores
     */

    public TurmaAL(){
        this.designacao = new String("POO");
        this.alunos = new ArrayList<>();
    }

    public TurmaAL(String designacao, List<Aluno> outrosAlunos){
        this.designacao = designacao;

        //Não é agregação
        //this.alunos = outrosAlunos; - nem o lista é da turma

        //É agregação
        //this.alunos = new ArrayList<>(outrosAlunos);

        //Também é agregação
        //this.alunos = new ArrayList<>();
        //this.alunos.addAll(outrosAlunos);

        //opçao 1
        this.alunos = new ArrayList<>();;
        for(Aluno a : outrosAlunos){
            this.alunos.add(a.clone());
        }

        //opcão 2: Iterador externo do tipo Iterator
        this.alunos = new ArrayList<>();
        Iterator<Aluno> it = outrosAlunos.iterator();
        while(it.hasNext()){
            Aluno a = it.next();
            this.alunos.add(a.clone());
        }

        //opcao 3: usar um iterador interno
        this.alunos = outrosAlunos.stream().map(Aluno::clone).collect(Collectors.toList());

    }

    public List <Aluno> getAlunos(){
        return this.alunos.stream().map(Aluno::clone).collect(Collectors.toList());
    }

    public void addAluno(Aluno a){
        this.alunos.add(a.clone());
    }

    public boolean existeAluno(Aluno a){
        return this.alunos.contains(a);
    }

    public boolean existeAluno(String name) {
        boolean encontrado = false;
        Iterator<Aluno> it = this.alunos.iterator();
        while(it.hasNext() && !encontrado){
            Aluno a = it.next();
            if (a.getName().equals(name)) encontrado = true;
        }
        return encontrado;
    }

    public boolean existeAlunoI(String name){
        return this.alunos.stream().anyMatch(a -> a.getName().equals(name));
    }

    /**
     * Método que disponibiliza uma ordenacao alfabetica de alunos
     */
    public Set<Aluno> alunosPorOrdemAlfabetica() {
        TreeSet<Aluno> res = new TreeSet<>(); //vai utilizar a ordem natural de aluno
        for(Aluno a: this.alunos) res.add(a.clone());
        return res;
    }

}
