package com.company;

public abstract class Candidato {
    protected Mediador mediador;
    protected String nome;
    protected boolean podeFalar;

    public Candidato(String nome){
        this.nome = nome;
    }

    public Mediador getMediador() {
        return this.mediador;
    }

    public void setMediador(Mediador mediador) {
        this.mediador = mediador;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPodeFalar(boolean podeFalar){
        this.podeFalar = podeFalar;
    }

    public boolean getPodeFalar(){
        return this.podeFalar;
    }

    public abstract void falar();

    public abstract void ouvir();
}
