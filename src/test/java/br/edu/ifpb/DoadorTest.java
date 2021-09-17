package br.edu.ifpb;

import org.junit.Assert;
import org.junit.Test;

public class DoadorTeste {
    @Test
    public void testGetsAndSets(){
        Doador homem = new Doador();
        homem.setNome("Micael");
        homem.setIdade(22);
        homem.setPeso(115);
        homem.setSexo("M");
        homem.setGravida(false);
        homem.setAmamenta(false);
        homem.setPartoAMaisDozeMeses(false);
        homem.setDoaSangue(true);
        homem.setTemFebre(false);

        Doador mulher = new Doador();
        mulher.setNome("Beatriz");
        mulher.setIdade(21);
        mulher.setPeso(55);
        mulher.setSexo("F");
        mulher.setGravida(false);
        mulher.setAmamenta(false);
        mulher.setPartoAMaisDozeMeses(false);
        mulher.setDoaSangue(true);
        mulher.setTemFebre(false);


        Assert.assertEquals(homem.getNome(), "Micael");
        Assert.assertEquals(homem.getIdade(), 22);
        Assert.assertEquals(homem.getPeso(), 115);
        Assert.assertEquals(homem.getSexo(), "M");
        Assert.assertFalse(homem.isGravida());
        Assert.assertFalse(homem.isAmamenta());
        Assert.assertFalse(homem.isPartoAMaisDozeMeses());
        Assert.assertTrue(homem.isDoaSangue());
        Assert.assertFalse(homem.isTemFebre());

        Assert.assertEquals(mulher.getNome(), "Beatriz");
        Assert.assertEquals(mulher.getIdade(), 21);
        Assert.assertEquals(mulher.getPeso(), 55);
        Assert.assertEquals(mulher.getSexo(), "F");
        Assert.assertFalse(mulher.isGravida());
        Assert.assertFalse(mulher.isAmamenta());
        Assert.assertFalse(mulher.isPartoAMaisDozeMeses());
        Assert.assertTrue(mulher.isDoaSangue());
        Assert.assertFalse(mulher.isTemFebre());
    }
}