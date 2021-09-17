package br.edu.ifpb;

public class Triagem {
    Mensagem m = new Mensagem();
    private boolean etapa1(Doador doador) {
        if ((doador.getPeso() >= 60 && doador.getSexo().equalsIgnoreCase("M")) ||
                doador.getPeso() >= 50 && doador.getSexo().equalsIgnoreCase("F")) {
            if (doador.getIdade() >= 16 && doador.getIdade() <= 69) {
                if (doador.getIdade() >= 60 && !doador.isDoaSangue()) {
                    m.etapa1Reprovado();
                    m.doadorMaiorSessentaENDoador();
                    return false;
                } else {
                    m.etapa1Aprovado();
                    return true;
                }
            } else {
                m.etapa1Reprovado();
                m.idadeNPermitida();
                return false;
            }
        } else {
            m.etapa1Reprovado();
            m.pesoNPermitido();
            return false;
        }
    }

    private boolean etapa2 (Doador doador) {
        if (doador.isTemFebre()) {
            m.reprovado();
            m.febre();
            return false;
        } else if (doador.isGravida()) {
            m.reprovado();
            m.gravida();
            return false;
        } else if (doador.isAmamenta() && !doador.isPartoAMaisDozeMeses()) {
            m.reprovado();
            m.partoMenosDozeMeses();
            return false;
        } m.aguarde(doador);
        return true;
    }

    public boolean podeDoar(Doador d){
        return etapa1(d) && etapa2(d);
    }
}