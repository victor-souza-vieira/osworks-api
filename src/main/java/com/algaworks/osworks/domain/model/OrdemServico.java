package com.algaworks.osworks.domain.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@EqualsAndHashCode(of = {"id"})
public class OrdemServico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;
	
	@ManyToOne
	@Getter
	@Setter
	private Cliente cliente;
	
	@Getter
	@Setter
	private String descricao;
	
	@Getter
	@Setter
	private BigDecimal preco;
	
	@Enumerated(EnumType.STRING)
	@Getter
	@Setter
	private StatusOrdemServico status;
	
	@Getter
	@Setter
	private OffsetDateTime dataAbertura;
	
	@Getter
	@Setter
	private OffsetDateTime dataFinalizacao;
}
