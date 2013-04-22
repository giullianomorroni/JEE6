package com.giullianomorroni.cdi;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import com.giullianomorroni.beanValidation.Cpf;

public class Conta {

	private Long id;
	private String conta;
	private Banco banco;
	@NotNull
	private String nomeCliente;
	@Cpf
	private String cpfCliente;
	private BigDecimal credito;

	/**
	 * 
	 * @param conta
	 * @param banco
	 * @param nomeCliente
	 * @param cpfCliente
	 */
	public Conta(String conta, Banco banco, String nomeCliente, String cpfCliente) {
		this.conta = conta;
		this.banco = banco;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
	}

	/**
	 * 
	 * @param quantia
	 */
	public void creditar (BigDecimal quantia) {
		this.credito = this.credito.add(quantia);
	}

	/**
	 * 
	 * @param quantia
	 */
	public void debitar (BigDecimal quantia) {
		this.credito = this.credito.subtract(quantia);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public BigDecimal getCredito() {
		return credito;
	}

	public void setCredito(BigDecimal credito) {
		this.credito = credito;
	}
	
}
