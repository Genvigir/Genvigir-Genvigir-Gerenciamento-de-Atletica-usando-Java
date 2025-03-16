//Lucas Carvalho Batista Canhadas Genvigir

public class AnoFormInvException extends Exception {

	Leitura l = new Leitura();

	public void impAnoFormInv() {
		System.out.println("Ano de formatura inválido. Deve ser um número inteiro entre 1990 e 2024.");
	}

	public ExAluno corAnoFormInv(ExAluno ex1) {
		try {
			String anoFormStr = l.entDados("\nNova Entrada - Informe o Ano de Formatura: ");
			if (anoFormStr.isEmpty()) {
				throw new NullPointerException();
			}
			ex1.setAnoForm(Integer.parseInt(anoFormStr));
		} catch (AnoFormInvException afie) {
			afie.impAnoFormInv();
			ex1 = afie.corAnoFormInv(ex1);
		} catch (NumberFormatException nfe) {
			System.out.println("\nO ano de formatura deve ser um número inteiro.");
			ex1 = corAnoFormInv(ex1);
		} catch (NullPointerException npe) {
			System.out.println("\nO ano de formatura não pode ser vazio.");
			ex1 = corAnoFormInv(ex1);
		}
		return ex1;
	}
}
