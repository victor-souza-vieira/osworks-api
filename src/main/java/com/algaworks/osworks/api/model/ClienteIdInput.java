package com.algaworks.osworks.api.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

public class ClienteIdInput {

	@NotNull
	@Getter
	@Setter
	private Long id;	
}
