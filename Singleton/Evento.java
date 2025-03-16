//Lucas Carvalho Batista Canhadas Genvigir

public class Evento {

	private String campeonato;
	private String cidade;
	private Modalidade modalidade;

	// Metodo todo Construtor
	public Evento() {
		campeonato = "";
		cidade = "";
		modalidade = new Modalidade();
	}

	//Sobrecarga
	public Evento(String campeonato, String cidade, Modalidade modalidade) {
		this.campeonato = campeonato;
		this.cidade = cidade;
		this.modalidade = modalidade;
	}

	public String getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(String campeonato) {
		this.campeonato = campeonato;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
}
