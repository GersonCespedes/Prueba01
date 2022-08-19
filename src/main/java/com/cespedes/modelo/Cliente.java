package com.cespedes.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	
	@Id
	private int id_Cliente;
	
	@Column(name="nombres",length=100)
	private String nombres;
	
	@Column(name="apellidos",length=100)
	private String apellidos;
	
	@Column(name="numerodni",length=30)
	private String numero_dni;
	
	@Column(name="telefono",length=100)
	private String telefono;
	
	public int getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNumerodni() {
		return numero_dni;
	}

	public void setNumerodni(String numerodni) {
		this.numero_dni = numerodni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getAfp() {
		return afp;
	}

	public void setAfp(int afp) {
		this.afp = afp;
	}

	@Column(name="correo",length=30)
	private String correo;
	
	@Column(name="id_afp")
	private int afp;
}
