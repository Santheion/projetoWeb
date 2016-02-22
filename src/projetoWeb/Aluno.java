package projetoWeb;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer matricula;
	
	@NotNull(message="Informe o nome")
	private String nome;
	
	@NotNull(message="Informe o CPF")
	private String cpf;
	
	private String email;
	
	@OneToMany(mappedBy = "Boleto")
	private List<Boleto> boleto;
	
	@OneToMany(mappedBy = "AlunoTurma")
	private List<AlunoTurma> alunoTurma;
	
	public Integer getMatricula() {
		return matricula;
	}
	public List<Boleto> getBoleto() {
		return boleto;
	}
	public void setBoleto(List<Boleto> boleto) {
		this.boleto = boleto;
	}
	public List<AlunoTurma> getAlunoTurma() {
		return alunoTurma;
	}
	public void setAlunoTurma(List<AlunoTurma> alunoTurma) {
		this.alunoTurma = alunoTurma;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
