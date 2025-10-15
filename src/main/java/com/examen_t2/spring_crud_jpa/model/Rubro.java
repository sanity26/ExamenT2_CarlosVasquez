package com.examen_t2.spring_crud_jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_rubro")
@Getter @Setter

public class Rubro {
	
	@ManyToOne
	@JoinColumn(name = "id_rubro")
	private int idRubro;
	
	@Column(name = "denominacion")
	private String denominacion;

}
