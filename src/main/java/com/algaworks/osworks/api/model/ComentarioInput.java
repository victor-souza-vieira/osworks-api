package com.algaworks.osworks.api.model;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

public class ComentarioInput {

	@NotBlank
	@Getter @Setter private String descricao;
	
}
