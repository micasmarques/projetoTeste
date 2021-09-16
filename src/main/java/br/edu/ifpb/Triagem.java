package br.edu.ifpb;

public class Triagem {
    Mensagem m = new Mensagem();
    public boolean Etapa1(Doador doador) {
        if ((doador.getPeso() >= 60 && doador.getSexo().equalsIgnoreCase("M")) ||
                doador.getPeso() >= 50 && doador.getSexo().equalsIgnoreCase("F")) {
            if (doador.getIdade() >= 16 && doador.getIdade() <= 69) {
                if (doador.getIdade() >= 60 && !doador.isDoaSangue()) {
                    m.reprovado();
                    System.out.println("Doador com idade maior que 60 anos que nunca doou sangue anteriormente!");
                    return false;
                } else {
                    m.aprovado();
                    return true;
                }
            } else {
                m.reprovado();
                System.out.println("Doador não está dentro da faixa-etária permitida");
                return false;
            }
        } else {
            m.reprovado();
            System.out.println("Doador não está dentro da faixa de peso permitida");
            return false;
        }
    }

    public boolean Etapa2 (Doador doador) {
        if (doador.isTemFebre()) {
            m.reprovado();
            System.out.println("Doador está com febre");
            return false;
        } else if (doador.isGravida()) {
            m.reprovado();
            System.out.println("Doador está grávida");
            return false;
        } else if (doador.isAmamenta() && doador.isPartoADozeMeses()) {
            m.reprovado();
            System.out.println("Parto aconteceu a menos de 12 meses");
            return false;
        } System.out.println("Por favor, aguarde na fila de doação!");
        return true;
    }
}