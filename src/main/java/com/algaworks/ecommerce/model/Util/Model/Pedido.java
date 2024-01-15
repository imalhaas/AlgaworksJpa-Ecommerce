package com.algaworks.ecommerce.model.Util.Model;

import com.algaworks.ecommerce.model.Util.StatusPedido;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "pedido")
public class Pedido {

    @EqualsAndHashCode.Include
    @Id
    private Long id;

    @Column(name = "data_pedido")
    private LocalDateTime dataPedido;

    @Column(name = "data_conclusao")
    private LocalDateTime dataConclusao;

    @Column(name = "notaFiscal")
    private Integer notaFiscalId;

    private BigDecimal total;

    @Enumerated(EnumType.STRING)
    private StatusPedido statusPedido;

    @Embedded
    private EnderecoEntregaPedido enderecoEntregaPedido;





}
