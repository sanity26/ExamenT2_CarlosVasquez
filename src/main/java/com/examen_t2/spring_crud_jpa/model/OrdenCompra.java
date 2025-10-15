package com.examen_t2.spring_crud_jpa.model;

import java.time.LocalDate;

import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_orden_compra")
@DynamicInsert
@Getter @Setter

public class OrdenCompra {
	
	@Id
	@Column (name = "nro_orden")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int nroOrden;
	
	@Column(name = "id_proveedor")
	private int idProveedor;
	
	@Column(name = "monto")
	private double monto;
	
	@Column(name = "direccion_entrega")
	private String direcionEntrega;
	
	@Column(name = "fecha_entrega")
	private LocalDate fechaEnrega;
	
	@Column(name = "lote")
	private String lote;
	
	@Column(name = "estado")
	private String estado;

}
