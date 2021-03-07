package com.company;

public class Main {

    public static void main(String[] args) {
        CandidatoPSDB alckmin = new CandidatoPSDB("Geraldo Alckmin");
        CandidatoPT lula = new CandidatoPT("Luis Inacio Lula da Silva");

        ApresentadorMediador mediadorBonner = new ApresentadorMediador("Willian Bonner");
        mediadorBonner.abrirDebate();

        mediadorBonner.chamarPoliticoPSDB(alckmin);
        mediadorBonner.chamarPoliticoPT(lula);

        mediadorBonner.mediarDebate();
        mediadorBonner.mediarDebate();
        mediadorBonner.mediarDebate();
        mediadorBonner.mediarDebate();
        mediadorBonner.mediarDebate();
        mediadorBonner.mediarDebate();
        mediadorBonner.mediarDebate();
        mediadorBonner.mediarDebate();

        mediadorBonner.fecharDebate();

    }
}
