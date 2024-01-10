package com.algaworks.ecommerce.model.Util.Model;

import com.algaworks.ecommerce.model.Util.SexoCLiente;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;


@Entity
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente {

    @EqualsAndHashCode.Include
    @Id
    private Long id;

    private String nome;

    private SexoCLiente sexoCLiente;

}
