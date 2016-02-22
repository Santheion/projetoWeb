package projetoWeb;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCurso;
	
	@NotNull(message = "Informe o nome")
	private String nome;
	
	@OneToMany(mappedBy = "Turma")
	private List<Turma> turma;

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Turma> getTurma() {
		return turma;
	}

	public void setTurma(List<Turma> turma) {
		this.turma = turma;
	}
	
	
}
