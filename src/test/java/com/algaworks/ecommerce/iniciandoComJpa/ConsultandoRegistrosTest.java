package com.algaworks.ecommerce.iniciandoComJpa;

import com.algaworks.ecommerce.EntityManagerTest;
import com.algaworks.ecommerce.model.Produto;
import org.junit.*;


public class ConsultandoRegistrosTest extends EntityManagerTest {


    @Test
    public void buscarPorIdentificador(){
        Produto produto = entityManager.find(Produto.class, 1);

        System.out.println(">>>>>>>" + produto.getNome());

        Assert.assertNotNull(produto);
        Assert.assertEquals("Kindle", produto.getNome());
    }

    @Test
    public void atualizarAreferencia(){
        Produto produto = entityManager.find(Produto.class, 1);

        produto.setNome("Monitor LG");

        entityManager.refresh(produto);

        Assert.assertEquals("Kindle", produto.getNome());

    }
}
