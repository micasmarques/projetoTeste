package br.edu.ifpb;

public class Doador {
    private String nome;
    private int idade;
    private long peso;
    private String sexo;
    private boolean gravida;
    private boolean amamenta;
    private boolean partoAMaisDozeMeses;
    private boolean doaSangue;
    private boolean temFebre;

    public Doador(String nome, int idade, long peso, String sexo,
                  boolean gravida, boolean amamenta, boolean partoAMaisDozeMeses,
                  boolean doaSangue, boolean temFebre) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
        this.gravida = gravida;
        this.amamenta = amamenta;
        this.partoAMaisDozeMeses = partoAMaisDozeMeses;
        this.doaSangue = doaSangue;
        this.temFebre = temFebre;
    }

    public Doador() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getPeso() {
        return peso;
    }

    public void setPeso(long peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isGravida() {
        return gravida;
    }

    public void setGravida(boolean gravida) {
        this.gravida = gravida;
    }

    public boolean isAmamenta() {
        return amamenta;
    }

    public void setAmamenta(boolean amamenta) {
        this.amamenta = amamenta;
    }

    public boolean isPartoAMaisDozeMeses() {
        return partoAMaisDozeMeses;
    }

    public void setPartoAMaisDozeMeses(boolean partoAMaisDozeMeses) {
        this.partoAMaisDozeMeses = partoAMaisDozeMeses;
    }

    public boolean isDoaSangue() {
        return doaSangue;
    }

    public void setDoaSangue(boolean doaSangue) {
        this.doaSangue = doaSangue;
    }

    public boolean isTemFebre() {
        return temFebre;
    }

    public void setTemFebre(boolean temFebre) {
        this.temFebre = temFebre;
    }

    @Override
    public String toString() {
        return "Doador{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", sexo='" + sexo + '\'' +
                ", gravida=" + gravida +
                ", amamenta=" + amamenta +
                ", partoADozeMeses=" + partoAMaisDozeMeses +
                ", doaSangue=" + doaSangue +
                ", temFebre=" + temFebre +
                '}';
    }
}