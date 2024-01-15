package com.algaworks.ecommerce.model.Util.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Getter
@Setter
@Embeddable
public class EnderecoEntregaPedido {

    @Column(name = "end_cep")
    private String cep;

    @Column(name = "end_lougradouro")
    private String lougradouro;

    private String numero;

    private String complemento;

    private String bairro;

    private String cidade;

    private String estado;
}
