//Lucas Carvalho Batista Canhadas Genvigir

public class ExAluno extends Pessoa {

	private int anoform;
	private String curso = "";

	//Metodo Construtor
	public ExAluno() {
		anoform = 0;
		curso = "";
	}

	//Sobrecarga
	public ExAluno(int anoform, String curso) {
		this.anoform = anoform;
		this.curso = curso;
	}

	//Sobrescrita
	public String getTipo() {
		return "Ex Aluno";
	}

	//Sobrescrita
	public String getIdentificacao() {
		return "Ano de Formatura: " + getAnoForm();
	}

	//Sobrescrita
	public String getDetalhes() {
		return "Curso: " + getCurso();
	}

	public int getAnoForm() {
		return anoform;
	}

	public String getCurso() {
		return curso;
	}

	public void setAnoForm(int anoform) throws AnoFormInvException {
		if (anoform < 1990 || anoform > 2024) {
			throw new AnoFormInvException();
		}
		this.anoform = anoform;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
