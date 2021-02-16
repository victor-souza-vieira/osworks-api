package com.algaworks.osworks.api.model;

import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.algaworks.osworks.domain.model.OrdemServico;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@EqualsAndHashCode(of = {"id"})
public class Comentario {

	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Getter
	@Setter
	@ManyToOne
	private OrdemServico ordemServico;
	@Getter
	@Setter
	private String descricao;
	@Getter
	@Setter
	private OffsetDateTime dataEnvio;

}
