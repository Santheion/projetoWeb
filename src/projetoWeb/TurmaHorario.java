package projetoWeb;

import java.util.List;

import javax.persistence.*;

public class TurmaHorario {
	
	@ManyToOne
	@JoinColumn(name = "idHorario")
	private List<Horarios> horarios;
	
	@ManyToOne
	@JoinColumn(name = "idTurma")
	private List<Turma> turma;
}
