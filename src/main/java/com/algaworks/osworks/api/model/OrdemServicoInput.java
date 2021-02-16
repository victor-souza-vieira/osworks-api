package com.algaworks.osworks.api.model;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

public class OrdemServicoInput {

	@NotBlank
	@Getter
	@Setter
	private String descricao;
	
	@NotNull
	@Getter
	@Setter
	private BigDecimal preco;
	
	@Valid
	@NotNull
	@Getter
	@Setter
	private ClienteIdInput cliente;
}
