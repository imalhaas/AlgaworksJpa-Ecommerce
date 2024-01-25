package com.algaworks.ecommerce.model.Util.Model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "item_pedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @ManyToOne
    @Column(name = "pedido_id")
    private Pedido pedidoId;

    @ManyToOne
    @Column(name = "produto_id")
    private Produto produtoid;

    @Column(name = "preco_produto")
    private BigDecimal precoProduto;

    private Integer quantidade;


}
