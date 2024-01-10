package com.algaworks.ecommerce.model.Util.Model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ItenPedido {

    @Id
    @EqualsAndHashCode.Include
    private Long id;

    private Integer pedidoId;

    private Integer produtoid;

    private BigDecimal precoProduto;

    private Integer quantidade;


}
