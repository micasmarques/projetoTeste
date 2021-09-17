package br.edu.ifpb;

public class Mensagem {
    public void reprovado(){ System.out.println("Não é possivel doar sangue.");
    }

    public void aprovado(){
         System.out.println("Você foi aprovado para doação.");
    }

    public void etapa1Aprovado(){ System.out.println("Você foi aprovado na etapa 1.");}
    public void etapa1Reprovado(){ System.out.println("Não é possivel doar sangue.");}

    public void doadorMaiorSessentaENDoador(){System.out.print("Doador com idade maior que 60 anos que nunca doou sangue anteriormente!");}

    public void idadeNPermitida(){
        System.out.println("Doador não está dentro da faixa-etária permitida.");
    }

    public void pesoNPermitido(){
        System.out.println("Doador não está dentro da faixa de peso permitida.");
    }

    public void febre(){ System.out.println("Doador está com febre.");}

    public void gravida(){System.out.println("Doador está grávida.");}

    public void partoMenosDozeMeses(){System.out.println("Parto aconteceu a menos de 12 meses.");}

    public void aguarde(Doador d){ System.out.println(d.getNome() + ", por favor, aguarde na fila de doação!");}
}