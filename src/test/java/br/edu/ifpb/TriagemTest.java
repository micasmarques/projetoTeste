package br.edu.ifpb;

import org.junit.Assert;
import org.junit.Test;

public class TriagemTest {
    Triagem t = new Triagem();
    Doador d1 = new Doador("Micael", 22, 115, "M", false, false, false, true, false);
    Doador d2 = new Doador("Misael", 27, 100, "M", false, false, false, true, false);
    Doador d3 = new Doador("Beatriz", 22, 80, "F", false, false, false, false, false);
    Doador d4 = new Doador("Ana", 71, 45, "F", false, false, false, true, false);
    Doador d5 = new Doador("Maria", 22, 80, "F", false, false, false, true, false);
    Doador d6 = new Doador("José", 61, 90, "M", false, false, false, false, false);
    Doador d7 = new Doador("Isabel", 63, 45, "F", false, false, false, false, false);
    Doador d8 = new Doador("Rayanne", 15, 51, "F", false, false, false, true, false);
    Doador d9 = new Doador("Isaque", 16, 59, "M", false, false, false, true, false);
    Doador d10 = new Doador("Pamella", 69, 115, "F", false, false, false, true, false);
    Doador d11 = new Doador("Expedito", 61, 95, "M", false, false, false, true, false);
    Doador d12 = new Doador("Erick", -1, 61, "M", false, false, false, true, false);
    Doador d13 = new Doador("Kilvia", 22, 61, "F", false, true, true, true, false);
    Doador d14 = new Doador("Joana", 22, 61, "F", false, true, true, true, false);
    Doador d15 = new Doador("Marcela", 22, 61, "F", false, true, true, true, true);
    Doador d16 = new Doador("Luana", 22, 61, "F", false, true, true, true, true);
    Doador d17 = new Doador("Marilia", 25, 61, "F", false, false, false, false, false);
    Doador d18 = new Doador("Pamella", 31, 115, "F", false, false, false, true, false);
    Doador d19 = new Doador("Luana", 22, 61, "F", true, true, true, true, false);
    Doador d20 = new Doador("Rachel", 25, 69, "F", true, false, false, true, false);
    Doador d21 = new Doador("Suzana", 25, 61, "F", false, true, true, false, false);
    Doador d22 = new Doador("Roberta", 31, 115, "F", false, true, true, true, false);
    Doador d23 = new Doador("Rapunzel", 22, 61, "F", false, true, false, true, false);
    Doador d24 = new Doador("Cinderela", 25, 69, "F", false, true, false, true, false);


    //pronto
    @Test
    public void testPodeDoarIdadeDesesseisSessentaNove(){
        Assert.assertTrue(t.podeDoar(d1));
        Assert.assertTrue(t.podeDoar(d5));
        Assert.assertFalse(t.podeDoar(d8));
        Assert.assertFalse(t.podeDoar(d12));
    }


    // pronto
    @Test
    public void testPodeDoarPessoaAcimaSessentaDoador(){
        Assert.assertTrue(t.podeDoar(d10));
        Assert.assertTrue(t.podeDoar(d11));
        Assert.assertFalse(t.podeDoar(d6));
        Assert.assertFalse(t.podeDoar(d7));
    }


    // feito
    @Test
    public void testPodePeso(){
        Assert.assertTrue(t.podeDoar(d2));
        Assert.assertTrue(t.podeDoar(d3));
        Assert.assertFalse(t.podeDoar(d4));
        Assert.assertFalse(t.podeDoar(d9));
    }


    // feito
    @Test
    public void testPodeDoarFebre(){
        Assert.assertTrue(t.podeDoar(d13));
        Assert.assertTrue(t.podeDoar(d14));
        Assert.assertFalse(t.podeDoar(d15));
        Assert.assertFalse(t.podeDoar(d16));
    }


    // feito
    @Test
    public void testPodeDoarGravida(){
        Assert.assertTrue(t.podeDoar(d17));
        Assert.assertTrue(t.podeDoar(d18));
        Assert.assertFalse(t.podeDoar(d19));
        Assert.assertFalse(t.podeDoar(d20));
    }


    // feito
    @Test
    public void testPodeDoarAmamentaPartoDozeMeses(){
        Assert.assertTrue(t.podeDoar(d21));
        Assert.assertTrue(t.podeDoar(d22));
        Assert.assertFalse(t.podeDoar(d23));
        Assert.assertFalse(t.podeDoar(d24));
    }

    /*
    * Levando em conta que a classe "Mensagem" é usada dentro de "Triagem", o codigo de teste de "Triagem" também testa a classe "Mensagem"
    * */

}
