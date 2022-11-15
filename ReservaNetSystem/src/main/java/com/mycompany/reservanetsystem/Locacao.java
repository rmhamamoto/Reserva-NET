package com.mycompany.reservanetsystem;

import java.util.List;

public class Locacao {

    private int id;
    private Usuario usuario;
    private String local;
    private List<String> recursosAdicionais;

    public Locacao(int id, Usuario usuario, String local, List<String> recursos){
        this.id = id;
        this.usuario = usuario;
        this.local = local;
        this.recursosAdicionais = recursos;
    }


}

