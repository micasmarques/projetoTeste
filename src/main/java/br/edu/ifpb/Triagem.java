package br.edu.ifpb;

public class Triagem extends Doador {
    public String aptodoarSangue;
    public String mensagem;
    public String justificativa;

    public String etapa1() {
        if (this.getIdade() <= 16 || this.getIdade() >= 69) {
            mensagem = "Não é possível doar sangue";
            justificativa = "É necessário ter entre 16 e 69 anos";
            return mensagem;
            return justificativa;
        }

        if (this.getIdade() > 60 && this.isDoaSangue() == False) {
            mensagem = "Não é possível doar sangue";
            justificativa = "É necessário ter  doado sangue alguma vez antes";
            return mensagem;
            return justificativa;
        }

        if (this.getSexo() == "Masculino" && this.getPeso() < 60) {
            mensagem = "Não é possível doar sangue";
            justificativa = "Pessoas do sexo masculino devem pesar no mínimo 60 kg";
            return mensagem;
            return justificativa;
        }

        if (this.getSexo() == "Feminino" && this.getPeso() < 50) {
            mensagem = "Não é possível doar sangue";
            justificativa = "Pessoas do sexo feminino devem pesar no mínimo 50 kg";
            return mensagem;
            return justificativa;
        }
        mensagem = "Você está apto(a) para a Etapa 2";
        return mensagem;

    }
}

