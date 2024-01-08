package com.algaworks.ecommerce.iniciandoComJpa;

import com.algaworks.ecommerce.EntityManagerTest;
import com.algaworks.ecommerce.model.Produto;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class OperacoesComTransacaoTest extends EntityManagerTest {

    @Test
    public void removerObjeto(){
        Produto produto = entityManager.find(Produto.class, 3);


        entityManager.getTransaction().begin();
        entityManager.remove(produto);
        entityManager.getTransaction().commit();

        Produto produtoVerificado = entityManager.find(Produto.class, 3);
        Assert.assertNull(produtoVerificado);
    }

    @Test
    public void inserirOPrimeiroObjeto(){
        Produto produto = new Produto();

        produto.setId(2);
        produto.setNome("Camera Canon");
        produto.setDescricao("A melhor definicao para suas fotos");
        produto.setPreco(new BigDecimal(5000));

        entityManager.getTransaction().begin();

        entityManager.persist(produto);

        entityManager.getTransaction().commit();

    }

    @Test
    public void abrinEFecharATransacao(){

        entityManager.getTransaction().begin();

        entityManager.getTransaction().commit();
    }
}
