package projetoWeb;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Turma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTurma;
	
	@NotNull(message = "Informe o nome")
	private String nome;
	
	
	@ManyToOne
	@JoinColumn(name = "idCurso")
	private List<Curso> curso;
	
	@OneToMany(mappedBy = "TurmaHorario")
	private List<TurmaHorario> turmaHorario;
	
	public List<TurmaHorario> getTurmaHorario() {
		return turmaHorario;
	}


	public void setTurmaHorario(List<TurmaHorario> turmaHorario) {
		this.turmaHorario = turmaHorario;
	}


	public List<AlunoTurma> getAlunoTurma() {
		return alunoTurma;
	}


	public void setAlunoTurma(List<AlunoTurma> alunoTurma) {
		this.alunoTurma = alunoTurma;
	}


	@OneToMany(mappedBy = "AlunoTurma")
	private List<AlunoTurma> alunoTurma;


	public Integer getIdTurma() {
		return idTurma;
	}


	public void setIdTurma(Integer idTurma) {
		this.idTurma = idTurma;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public List<Curso> getCurso() {
		return curso;
	}


	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}
	
	
	
	

}
