package com.algaworks.osworks.api.model;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

public class ComentarioModel {

	@Getter @Setter private Long id;
	@Getter @Setter private String descricao;
	@Getter @Setter private OffsetDateTime dataEnvio;
	
}
