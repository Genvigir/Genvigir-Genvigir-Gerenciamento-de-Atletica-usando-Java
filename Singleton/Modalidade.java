//Lucas Carvalho Batista Canhadas Genvigir

public class Modalidade {

	private int quantidade;
	private String nomemod;

	//Metodo Construtor
	public Modalidade() {
		quantidade = 0;
		nomemod = "";
	}

	//Sobrecarga
	public Modalidade(int quantidade, String nomemod) {
		this.quantidade = quantidade;
		this.nomemod = nomemod;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public String getNomeMod() {
		return nomemod;
	}

	public void setQuantidade(int quantidade) throws QuantidadeInvException {
		if (quantidade < 1 || quantidade > 5) {
			throw new QuantidadeInvException();
		}
		this.quantidade = quantidade;
	}

	public void setNomeMod(String nomemod) {
		this.nomemod = nomemod;
	}

}
