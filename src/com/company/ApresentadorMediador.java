package com.company;

public class ApresentadorMediador implements Mediador {
    private String nome;
    private CandidatoPSDB candidatoPSDB;
    private CandidatoPT candidatoPT;

    public ApresentadorMediador(String nome) { this.nome = nome; }

    public void abrirDebate(){
        System.out.println("["+this.getNome()+"] "+"Boa noite a todos! gostaria de convidar os candidatos ao segundo " +
                "turno das eleições presidenciais");
    }

    public void fecharDebate(){
        System.out.println("["+this.getNome()+"] Agradeço aos candidatos e a todos os espectadores! Boa noite");
    }

    public void chamarPoliticoPSDB(CandidatoPSDB candidatoPSDB) {
        System.out.println("["+this.getNome()+"] "+"Bem-vindo Sr. Candidato "+candidatoPSDB.getNome());
        this.candidatoPSDB = candidatoPSDB;
        this.candidatoPSDB.setMediador(this);
        this.candidatoPSDB.setPodeFalar(true);
    }

    public void chamarPoliticoPT(CandidatoPT candidatoPT) {
        System.out.println("["+this.getNome()+"] "+"Bem-vindo Sr. Candidato "+candidatoPT.getNome());
        this.candidatoPT = candidatoPT;
        this.candidatoPT.setMediador(this);
        this.candidatoPT.setPodeFalar(false);
    }

    public String getNome(){
        return this.nome;
    }

    public void mediarDebate() {
        if(this.candidatoPSDB.getPodeFalar()){
            candidatoPSDB.falar();
            candidatoPT.ouvir();
            this.candidatoPSDB.setPodeFalar(false);
            this.candidatoPT.setPodeFalar(true);
        }
        else{
            candidatoPT.falar();
            candidatoPSDB.ouvir();
            this.candidatoPT.setPodeFalar(false);
            this.candidatoPSDB.setPodeFalar(true);
        }
    }
}
