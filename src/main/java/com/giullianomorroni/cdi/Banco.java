package com.giullianomorroni.cdi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

@Named
@SessionScoped
public class Banco implements Serializable {

	private static final long serialVersionUID = -4519956066624046950L;

	private String id;
	private String nome;
	private String agencia;

	@Produces
	@Agencias
	@ApplicationScoped
	public List<String> agencias() {
		List<String> agencias = new ArrayList<String>();
		agencias.add("340");
		agencias.add("341");
		agencias.add("342");
		return agencias;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

}
