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

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }

    public List<String> getRecursosAdicionais() {
        return recursosAdicionais;
    }
    public void setRecursosAdicionais(List<String> recursosAdicionais) {
        this.recursosAdicionais = recursosAdicionais;
    }

}

