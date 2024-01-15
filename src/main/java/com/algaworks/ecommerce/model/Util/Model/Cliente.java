package com.algaworks.ecommerce.model.Util.Model;

import com.algaworks.ecommerce.model.Util.SexoCLiente;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "cliente")
public class Cliente {

    @EqualsAndHashCode.Include
    @Id
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private SexoCLiente sexo;

}
