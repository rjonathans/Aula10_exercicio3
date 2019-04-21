package br.com.digitalhouse;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Aluno tairo = new Aluno("Tairo Miguel",100001);
        Aluno jessica = new Aluno("Jessica Correa",100002);
        Aluno vini = new Aluno("Vini PHP",100003);
        Aluno barney = new Aluno("Barney Stinson",100004);
        Aluno trude = new Aluno("Trude",100005);

        Set<Aluno> alunos = new HashSet<>();
        alunos.add(tairo);
        alunos.add(jessica);
        alunos.add(vini);
        alunos.add(barney);
        /*alunos.add(trude);*/

        System.out.println(
                //alunos
                /*IMPRESSAO SEM O toString:
                [br.com.digitalhouse.Aluno@4554617c, br.com.digitalhouse.Aluno@1b6d3586]*/
                /*IMPRESSÃO COM O toString:
                        Aluno:
                        Nome: Jessica Correa'
                        Numero de Aluno: 100002,
                        Aluno:
                        Nome: Tairo Miguel'
                        Numero de Aluno: 100001]*/
                alunos.contains(trude)
        );
    }
}
