package com.challenge.mottu.model;

import org.springframework.hateoas.RepresentationModel;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Schema(description = "Esta classe irá representar a entidade Patio")
@Data
@Entity
@Table(name = "PATIO")
public class Patio extends RepresentationModel<Patio>{

	@Schema(description = "Este atributo representa a chave primária ID", example = "1")
	@Id
	private Long id;
	@ManyToOne
	@JoinColumn(name= "ANDAR_ID")
	private Andar andar;
	@NotEmpty(message = "Não é permitido a inserção de patio sem número de identificação")
	private Long numero_patio;
}
