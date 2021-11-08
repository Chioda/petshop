package com.thiago.petshop.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.thiago.petshop.domain.enuns.SituacaoPagamento;

@Entity
public class PagDinheiro extends Pagamento {

	private static final long serialVersionUID = 1L;
	
	private Date dataPgamento; 
	private Double desconto;
	
	public PagDinheiro() {
		
	}

	public PagDinheiro(Integer id, Double valor, SituacaoPagamento situacao, Servico servico, Date dataPagamento, Double desconto) {
		super(id, valor, situacao, servico);
		this.dataPgamento = dataPagamento;
		this.desconto = desconto;
		
	}

	public Date getDataPgamento() {
		return dataPgamento;
	}

	public void setDataPgamento(Date dataPgamento) {
		this.dataPgamento = dataPgamento;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	
	
	
}
