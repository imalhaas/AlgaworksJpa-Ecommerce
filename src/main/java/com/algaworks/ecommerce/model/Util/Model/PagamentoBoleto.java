package com.algaworks.ecommerce.model.Util.Model;

import com.algaworks.ecommerce.model.Util.StatusPagamento;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PagamentoBoleto {

    @Id
    @EqualsAndHashCode.Include
    private Long id;

    private Integer pedidoId;

    private StatusPagamento status;

    private String codigoBarras;


}
