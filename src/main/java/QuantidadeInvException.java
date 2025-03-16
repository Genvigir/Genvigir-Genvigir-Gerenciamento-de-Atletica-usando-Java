//Lucas Carvalho Batista Canhadas Genvigir

public class QuantidadeInvException extends Exception {

	private static Leitura l = new Leitura();

	public void impQuantidadeInv() {
		//System.out.println("Quantidade de modalidades inválida. Deve ser um número inteiro entre 1 e 5.");
	}

	public Modalidade corQuantidadeInv(Modalidade modalidade) {
		try {
			String quantidadeStr = l.entDados("\nNova Entrada - Informe a Quantidade de Modalidades: ");
			if (quantidadeStr.isEmpty()) {
				throw new NullPointerException();
			}
			modalidade.setQuantidade(Integer.parseInt(quantidadeStr));
		} catch (QuantidadeInvException qie) {
			qie.impQuantidadeInv();
			modalidade = qie.corQuantidadeInv(modalidade);
		} catch (NumberFormatException nfe) {
			System.out.println("\nA quantidade deve ser um número inteiro.");
			modalidade = corQuantidadeInv(modalidade);
		} catch (NullPointerException npe) {
			System.out.println("\nA quantidade não pode ser vazia.");
			modalidade = corQuantidadeInv(modalidade);
		}
		return modalidade;
	}
}
