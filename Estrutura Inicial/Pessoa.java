//Lucas Carvalho Batista Canhadas Genvigir

public class Pessoa implements Participante {

	private int cpf;
	private int idade;
	private String nome;
	private String sexo;
	private Evento evento;

	// Metodo Construtor
	public Pessoa() {
		cpf = 0;
		idade = 0;
		nome = "";
		sexo = "";
		evento = new Evento();
	}

	//Sobrecarga
	public Pessoa(int cpf, int idade, String nome, String sexo, Evento evento) {
		this.cpf = cpf;
		this.idade = idade;
		this.nome = nome;
		this.sexo = sexo;
		this.evento = evento;
	}

	//Sobrescrita
	public String getTipo() {
		return "Pessoa";
	}

	//Sobrescrita
	public String getIdentificacao() {
		return "CPF: " + getCpf();
	}

	//Sobrescrita
	public String getDetalhes() {
		return "Nome: " + getNome() + " \nIdade: " + getIdade() + " \nSexo: " + getSexo();
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) throws CpfInvException {
		if (cpf < 1 || cpf > 1000) {
			throw new CpfInvException();
		}
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) throws IdadeInvException {
		if (idade < 17 || idade > 70) {
			throw new IdadeInvException();
		}
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

}
