package com.algaworks.ecommerce.model.Util.Model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Produto {

    @EqualsAndHashCode.Include
    @Id
    private Integer id;

    private String nome;

    private String descricao;

    private BigDecimal preco;


}