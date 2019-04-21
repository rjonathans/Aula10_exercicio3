package br.com.digitalhouse;

import java.util.Objects;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private Integer numeroDeAluno;

    public Aluno(){
    }
    public Aluno(String nome,Integer numeroDeAluno){
        this.setNome(nome);
        this.setNumeroDeAluno(numeroDeAluno);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumeroDeAluno(Integer numeroDeAluno){
        this.numeroDeAluno = numeroDeAluno;
    }
    public String getNome(){
        return nome;
    }
    public Integer getNumeroDeAluno(){
        return numeroDeAluno;
    }

    public void Cadastrar(){
        System.out.println("Por favor Digite o nome do aluno novo: ");
    }

    @Override
    public String toString() {
        return "\nAluno: " +
                "\nNome: " + nome + '\'' +
                "\nNumero de Aluno: " + numeroDeAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return /*Objects.equals(getNome(), aluno.getNome()) &&*/
                Objects.equals(getNumeroDeAluno(), aluno.getNumeroDeAluno());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumeroDeAluno());
    }
}
