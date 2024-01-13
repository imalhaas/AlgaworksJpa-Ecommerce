package com.algaworks.ecommerce.model.Util.Model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "estoque")
public class Estoque {

    @EqualsAndHashCode.Include
    @Id
    private Long id;

    @Column(name = "produto_id")
    private Integer produtoId;

    private Integer quantidade;

}
