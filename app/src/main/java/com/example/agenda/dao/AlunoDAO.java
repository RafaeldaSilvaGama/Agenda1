package com.example.agenda.dao;

import com.example.agenda.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private final static List<Aluno> lista = new ArrayList<>();

    public void salva(Aluno aluno) {

        lista.add(aluno);
    }

    public List<Aluno> listar() {
        return new ArrayList<>(lista);
    }
}
