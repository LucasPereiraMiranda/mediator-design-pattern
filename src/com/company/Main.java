package com.company;

public class Main {

    public static void main(String[] args) {
        CandidatoPSDB alckmin = new CandidatoPSDB("Geraldo Alckmin",new String[] {
                "Olá Bonner e amigos, é um prazer estar aqui",
                "Minha proposta para saúde é ...",
                "Minha proposta para educação é ...",
                "Obrigado Brasil e votem em mim"
        });

        CandidatoPT lula = new CandidatoPT("Luis Inacio Lula da Silva", new String[] {
                "Olá Bonner e companheiros, é um prazer estar aqui",
                "Minha proposta para saúde é ...",
                "Minha proposta para educação é ...",
                "Obrigado companheiros e votem em mim"
        });

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
