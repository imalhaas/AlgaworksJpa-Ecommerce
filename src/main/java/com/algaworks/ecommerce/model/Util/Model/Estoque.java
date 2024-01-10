package com.algaworks.ecommerce.model.Util.Model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Estoque {

    @EqualsAndHashCode.Include
    @Id
    private Long id;

    private Integer produtoId;

    private Integer quantidade;

}
