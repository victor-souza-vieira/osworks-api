package com.algaworks.osworks.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.algaworks.osworks.domain.ValidationGroups;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@EqualsAndHashCode(exclude = {"nome", "email", "telefone"})
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;
	
	@NotBlank
	@Size(max = 50)
	@Getter
	@Setter
	private String nome;
	
	@NotBlank
	@Email
	@Size(max = 255)
	@Getter
	@Setter
	private String email;
	
	@NotBlank
	@Size(max = 20)
	@Column(name = "fone")
	@Getter
	@Setter
	private String telefone;
}
