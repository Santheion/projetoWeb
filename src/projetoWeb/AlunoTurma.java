package projetoWeb;

import java.util.List;

import javax.persistence.*;

public class AlunoTurma {
	
	@ManyToOne
	@JoinColumn(name = "matricula")
	private List<Aluno> aluno;
	
	@ManyToOne
	@JoinColumn(name = "idTurma")
	private List<Turma> turma;
}
