package br.edu.ifpb;

public class Cadastro {
    public static void main( String[] args ) {
        Triagem t = new Triagem();
        Doador d1 = new Doador("Micael", 22, 115, "M", false, false, false, true, false);
        Doador d2 = new Doador("Misael", 27, 100, "M", false, false, false, true, true);
        Doador d3 = new Doador("Beatriz", 22, 80, "F", false, false, false, false, false);
        Doador d4 = new Doador("Ana", 71, 45, "F", false, false, false, true, false);
        Doador d5 = new Doador("Maria", 22, 80, "F", false, false, false, true, false);
        Doador d6 = new Doador("José", 61, 90, "M", false, false, false, false, false);
        Doador d7 = new Doador("Isabel", 22, 45, "F", false, false, false, true, false);
        Doador d8 = new Doador("Rayanne", 15, 51, "F", false, false, false, true, false);
        Doador d9 = new Doador("Isaque", 16, 59, "M", false, false, false, true, false);
        Doador d10 = new Doador("Pamella", 69, 115, "F", false, false, false, true, false);
        Doador d11 = new Doador("Expedito", 61, 95, "M", false, false, false, true, false);
        Doador d12 = new Doador("Erick", -1, 61, "M", false, false, false, true, false);
        Doador d13 = new Doador("Kilvia", 22, 61, "F", true, false, false, true, false);
        Doador d14 = new Doador("Joana", 22, 61, "F", false, true, false, true, false);
        Doador d15 = new Doador("Marcela", 22, 61, "F", false, true, true, true, false);
        Doador d16 = new Doador("Luana", 22, 61, "F", false, true, true, true, true);
        Doador d17 = new Doador("Marilia", 75, 61, "F", false, false, false, false, false);
        Doador d18 = new Doador("Pamella", 71, 115, "F", false, false, false, true, false);
        Doador d19 = new Doador("Luana", 22, 61, "F", true, true, true, true, false);

        t.etapa2(d19);
    }
}
