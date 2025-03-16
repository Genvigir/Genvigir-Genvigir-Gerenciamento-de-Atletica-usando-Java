//Lucas Carvalho Batista Canhadas Genvigir

public class IdadeInvException extends Exception {

	Leitura l = new Leitura();

	public void impIdadeInv() {
		System.out.println("Idade inválida. Deve ser um número inteiro entre 17 e 70.");
	}

	public Aluno corIdadeInv(Aluno a1) {
		try {
			String idadeStr = l.entDados("\nNova Entrada - Informe a Idade: ");
			if (idadeStr.isEmpty()) {
				throw new NullPointerException();
			}
			a1.setIdade(Integer.parseInt(idadeStr));
		} catch (IdadeInvException iie) {
			iie.impIdadeInv();
			a1 = iie.corIdadeInv(a1);
		} catch (NumberFormatException nfe) {
			System.out.println("\nA idade deve ser um número inteiro.");
			a1 = corIdadeInv(a1);
		} catch (NullPointerException npe) {
			System.out.println("\nA idade não pode ser vazia.");
			a1 = corIdadeInv(a1);
		}
		return a1;
	}

	public ExAluno corIdadeInv(ExAluno ex1) {
		try {
			String idadeStr = l.entDados("\nNova Entrada - Informe a Idade: ");
			if (idadeStr.isEmpty()) {
				throw new NullPointerException();
			}
			ex1.setIdade(Integer.parseInt(idadeStr));
		} catch (IdadeInvException iie) {
			iie.impIdadeInv();
			ex1 = iie.corIdadeInv(ex1);
		} catch (NumberFormatException nfe) {
			System.out.println("\nA idade deve ser um número inteiro.");
			ex1 = corIdadeInv(ex1);
		} catch (NullPointerException npe) {
			System.out.println("\nA idade não pode ser vazia.");
			ex1 = corIdadeInv(ex1);
		}
		return ex1;
	}

	public Servidor corIdadeInv(Servidor s1) {
		try {
			String idadeStr = l.entDados("\nNova Entrada - Informe a Idade: ");
			if (idadeStr.isEmpty()) {
				throw new NullPointerException();
			}
			s1.setIdade(Integer.parseInt(idadeStr));
		} catch (IdadeInvException iie) {
			iie.impIdadeInv();
			s1 = iie.corIdadeInv(s1);
		} catch (NumberFormatException nfe) {
			System.out.println("\nA idade deve ser um número inteiro.");
			s1 = corIdadeInv(s1);
		} catch (NullPointerException npe) {
			System.out.println("\nA idade não pode ser vazia.");
			s1 = corIdadeInv(s1);
		}
		return s1;
	}
}
