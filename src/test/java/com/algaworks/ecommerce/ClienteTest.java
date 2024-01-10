package com.algaworks.ecommerce;

import com.algaworks.ecommerce.model.Util.Model.Produto;
import com.algaworks.ecommerce.model.Util.Model.Cliente;
import org.junit.Assert;
import org.junit.Test;

public class ClienteTest extends EntityManagerTest {

    @Test
    public void inserir(){
        Cliente cliente = new Cliente();

        cliente.setId(4L);
        cliente.setNome("Lucas de Cassia");

        entityManager.getTransaction().begin();
        entityManager.merge(cliente);
        entityManager.getTransaction().commit();

        entityManager.clear();

        Cliente clienteVerificacao = entityManager.find(Cliente.class, cliente.getId());
        Assert.assertNotNull(clienteVerificacao);

    }

    @Test
    public void buscarPorId(){
        Produto produto = entityManager.find(Produto.class, 1);

        Assert.assertNotNull(produto);
        Assert.assertEquals("Kindle", produto.getNome());
    }

    @Test
    public void atualizarRegistro() {
        Cliente cliente = new Cliente();

        cliente.setId(1L);
        cliente.setNome("Manu");

        entityManager.getTransaction().begin();
        entityManager.merge(cliente);
        entityManager.getTransaction().commit();

        entityManager.clear();

        Cliente clienteVerificacao = entityManager.find(Cliente.class, cliente.getId());
        Assert.assertEquals("Manu", clienteVerificacao.getNome());
        System.out.println(clienteVerificacao);
    }

    @Test
    public void removerRegistro() {
        Cliente cliente = entityManager.find(Cliente.class, 2);

        entityManager.getTransaction().begin();
        entityManager.remove(cliente);
        entityManager.getTransaction().commit();

        entityManager.clear();

        Cliente clienteVerificacao = entityManager.find(Cliente.class, cliente.getId());
        Assert.assertNull(clienteVerificacao);
    }

}