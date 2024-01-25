package com.algaworks.ecommerce.relacionalmentos;

import com.algaworks.ecommerce.EntityManagerTest;
import com.algaworks.ecommerce.model.Util.Model.Cliente;
import com.algaworks.ecommerce.model.Util.Model.ItemPedido;
import com.algaworks.ecommerce.model.Util.Model.Pedido;
import com.algaworks.ecommerce.model.Util.Model.Produto;
import com.algaworks.ecommerce.model.Util.StatusPedido;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RelacionamentosManyToOneTest  extends EntityManagerTest {

    @Test
    public void verificarRelacionamento(){
       Cliente cliente = entityManager.find(Cliente.class, 1);

        Pedido pedido = new Pedido();

        pedido.setStatusPedido(StatusPedido.AGUARDANDO);
        pedido.setDataPedido(LocalDateTime.now());
        pedido.setTotal(BigDecimal.TEN);

        pedido.setCliente(cliente);

        entityManager.getTransaction().begin();
        entityManager.persist(pedido);
        entityManager.getTransaction().commit();

        entityManager.clear();

        Pedido pedidoVerificacao = entityManager.find(Pedido.class, pedido.getId());
        Assert.assertNotNull(pedidoVerificacao.getCliente());
//lm
    }

    @Test
    public void verificarRelacionamentoItemPedido(){
        Cliente cliente = entityManager.find(Cliente.class, 1);
        Produto produto = entityManager.find(Produto.class, 1);

        Pedido pedido = new Pedido();
        pedido.setStatusPedido(StatusPedido.AGUARDANDO);
        pedido.setDataPedido(LocalDateTime.now());
        pedido.setTotal(BigDecimal.TEN);
        pedido.setCliente(cliente);

        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setPrecoProduto(produto.getPreco());
        itemPedido.setQuantidade(1);
        itemPedido.setPedido(pedido);
        itemPedido.setProduto(produto);

        entityManager.getTransaction().begin();
        entityManager.persist(pedido);
        entityManager.persist(itemPedido);
        entityManager.getTransaction().commit();




    }


}
