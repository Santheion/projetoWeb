package projetoWeb;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Boleto {
	
	@Id
	private Integer codigoBoleto;
	
	@NotNull(message="Informe o Valor")
	private Double valor;
	
	@NotNull(message="Informe o Valor")
	private Date vencimento;
	
	private float valorPago;
	
	private Date dataPagamento;

	@ManyToOne
	@JoinColumn(name = "matricula")
	private List<Aluno> aluno;
	
	public List<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}

	public Integer getCodigoBoleto() {
		return codigoBoleto;
	}

	public void setCodigoBoleto(Integer codigoBoleto) {
		this.codigoBoleto = codigoBoleto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public float getValorPago() {
		return valorPago;
	}

	public void setValorPago(float valorPago) {
		this.valorPago = valorPago;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
}
