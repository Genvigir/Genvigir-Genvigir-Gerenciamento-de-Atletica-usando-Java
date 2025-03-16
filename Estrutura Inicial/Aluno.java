//Lucas Carvalho Batista Canhadas Genvigir

public class Aluno extends Pessoa {

	private int ra;
	private String curso;

	//Metodo todo Construtor
	public Aluno() {
		ra = 0;
		curso = "";
	}

	//Sobrecarga
	public Aluno(int ra, String curso) {
		this.ra = ra;
		this.curso = curso;
	}

	//Sobrescrita
	public String getTipo() {
		return "Aluno";
	}

	//Sobrescrita
	public String getIdentificacao() {
		return "RA: " + getRa();
	}

	//Sobrescrita
	public String getDetalhes() {
		return "Curso: " + getCurso();
	}

	public int getRa() {
		return ra;
	}

	public String getCurso() {
		return curso;
	}

	public void setRa(int ra) {
		if (ra < 1800 || ra > 2600) {
			throw new IllegalArgumentException("RA inválido. Deve ser um número entre 1800 e 2600.");
		}
		this.ra = ra;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
