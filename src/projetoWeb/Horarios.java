package projetoWeb;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Horarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHorario;
	
	@NotNull(message = "Informe o horarío de aula")
	private Date horarioAula;
	
	@NotNull(message = "Informe o dia da Semana")
	private String diaSemana;
	
	@OneToMany(mappedBy = "TurmaHorario")
	private List<TurmaHorario> turmaHorario;

	public Integer getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}

	public Date getHorarioAula() {
		return horarioAula;
	}

	public void setHorarioAula(Date horarioAula) {
		this.horarioAula = horarioAula;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public List<TurmaHorario> getTurmaHorario() {
		return turmaHorario;
	}

	public void setTurmaHorario(List<TurmaHorario> turmaHorario) {
		this.turmaHorario = turmaHorario;
	}
	
}
