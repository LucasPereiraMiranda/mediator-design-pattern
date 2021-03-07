package com.company;

public class CandidatoPSDB extends Candidato {
    private int contador = 0;
    private String[] menssagens;

    public CandidatoPSDB(String nome){
        super(nome);
        this.menssagens = new String[] {
                "Olá Bonner e amigos, é um prazer estar aqui",
                "Minha proposta para saúde é ...",
                "Minha proposta para educação é ...",
                "Obrigado Brasil e votem em mim"
        };
    }

    @Override
    public void falar() {
        if(contador < this.menssagens.length){
            System.out.println("["+this.getNome()+"] "+this.menssagens[contador]);
            this.contador += 1;
        }
        else{
            System.out.println("["+this.getNome()+"] Minhas falas acabaram");
        }
    }

    @Override
    public void ouvir() {
        System.out.println("["+this.getNome()+"] "+"ouvindo...");
    }
}


