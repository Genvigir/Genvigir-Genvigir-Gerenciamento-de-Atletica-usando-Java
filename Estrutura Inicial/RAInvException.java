//Lucas Carvalho Batista Canhadas Genvigir

public class RAInvException extends Exception {

	Leitura l = new Leitura();

	public void impRAInv() {
		System.out.println("RA inválido. Deve ser um número inteiro entre 1800 e 2600.");
	}

	public Aluno corRAInv(Aluno a1) {
		try {
			String raStr = l.entDados("\nNova Entrada - Informe o RA: ");
			if (raStr.isEmpty()) {
				throw new NullPointerException();
			}
			int ra = Integer.parseInt(raStr);
			if (ra < 1800 || ra > 2600) {
				throw new RAInvException();
			}
			a1.setRa(ra);
		} catch (RAInvException raie) {
			raie.impRAInv();
			a1 = raie.corRAInv(a1);
		} catch (NumberFormatException nfe) {
			System.out.println("\nO RA deve ser um número inteiro.");
			a1 = corRAInv(a1);
		} catch (NullPointerException npe) {
			System.out.println("\nO RA não pode ser vazio.");
			a1 = corRAInv(a1);
		}
		return a1;
	}

}
