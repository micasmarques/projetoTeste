package br.edu.ifpb;

public class Triagem {
    Mensagem m = new Mensagem();
    public boolean etapa1(Doador doador) {
        if ((doador.getPeso() >= 60 && doador.getSexo().equalsIgnoreCase("M")) ||
                doador.getPeso() >= 50 && doador.getSexo().equalsIgnoreCase("F")) {
            if (doador.getIdade() >= 16 && doador.getIdade() <= 69) {
                if (doador.getIdade() >= 60 && !doador.isDoaSangue()) {
                    m.reprovado();
                    m.doadorMaiorSessentaENDoador();
                    return false;
                } else {
                    m.aprovado();
                    return true;
                }
            } else {
                m.reprovado();
                m.idadeNPermitida();
                return false;
            }
        } else {
            m.reprovado();
            m.pesoNPermitido();
            return false;
        }
    }

    public boolean etapa2 (Doador doador) {
        if (doador.isTemFebre()) {
            m.reprovado();
            m.febre();
            return false;
        } else if (doador.isGravida()) {
            m.reprovado();
            m.gravida();
            return false;
        } else if (doador.isAmamenta() && doador.isPartoADozeMeses()) {
            m.reprovado();
            m.partoMenosDozeMeses();
            return false;
        } m.aguarde(doador);
        return true;
    }
}