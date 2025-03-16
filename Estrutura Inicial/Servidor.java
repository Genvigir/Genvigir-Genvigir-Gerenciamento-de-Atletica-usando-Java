//Lucas Carvalho Batista Canhadas Genvigir

public class Servidor extends Pessoa {

	private String setor;
	private String funcao;

	//Metodo Construtor
	public Servidor() {
		setor = "";
		funcao = "";
	}

	//Sobrecarga
	public Servidor(String setor, String funcao) {
		this.setor = setor;
		this.funcao = funcao;
	}

	//Sobrescrita
	public String getTipo() {
		return "Servidor";
	}

	//Sobrescrita
	public String getIdentificacao() {
		return "Setor: " + getSetor();
	}

	//Sobrescrita
	public String getDetalhes() {
		return "Funcao: " + getFuncao();
	}

	public String getSetor() {
		return setor;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
