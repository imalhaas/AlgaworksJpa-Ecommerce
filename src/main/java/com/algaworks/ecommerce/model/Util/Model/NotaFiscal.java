package com.algaworks.ecommerce.model.Util.Model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Entity
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class NotaFiscal {

    @EqualsAndHashCode.Include
    @Id
    private Long id;

    private Integer pedidoId;

    private Integer xml;

    private Date dataEmissao;

    private String Produto;



}
