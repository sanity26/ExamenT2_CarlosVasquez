package com.examen_t2.spring_crud_jpa.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_proveedor")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter @Setter

public class Proveedor {
	
	@ManyToOne
	@JoinColumn(name = "id_proveedor")
	@EqualsAndHashCode.Include
	private int idProveedor;
	
	@Column(name = "ruc")
	private int ruc;
	
	@Column(name = "razon_social")
	private String razonSocial;
	
	@Column(name = "fecha_registro")
	private LocalDate fechaRegistro;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "pagina_web")
	private String paginaWeb;
	
	@Column(name = "id_rubro")
	private int idRubro;

}
