//Lucas Carvalho Batista Canhadas Genvigir

public class CpfInvException extends Exception {

	Leitura l = new Leitura();

	public void impCpfInv() {
		System.out.println("CPF inválido. Deve ser um número entre 1 e 1000.");
	}

	public Aluno corCpfInv(Aluno a1) {
		try {
			String cpfStr = l.entDados("\nNova Entrada - Informe o Cpf: ");
			if (cpfStr.isEmpty()) {
				throw new NullPointerException();
			}
			a1.setCpf(Integer.parseInt(cpfStr));
		} catch (CpfInvException cpi) {
			cpi.impCpfInv();
			a1 = cpi.corCpfInv(a1);
		} catch (NumberFormatException nfe) {
			System.out.println("\nO CPF deve ser um número inteiro.");
			a1 = corCpfInv(a1);
		} catch (NullPointerException npe) {
			System.out.println("\nO CPF não pode ser vazio.");
			a1 = corCpfInv(a1);
		}
		return a1;
	}

	public ExAluno corCpfInv(ExAluno ex1) {
		try {
			String cpfStr = l.entDados("\nNova Entrada - Informe o Cpf: ");
			if (cpfStr.isEmpty()) {
				throw new NullPointerException();
			}
			ex1.setCpf(Integer.parseInt(cpfStr));
		} catch (CpfInvException cpi) {
			cpi.impCpfInv();
			ex1 = cpi.corCpfInv(ex1);
		} catch (NumberFormatException nfe) {
			System.out.println("\nO CPF deve ser um número inteiro.");
			ex1 = corCpfInv(ex1);
		} catch (NullPointerException npe) {
			System.out.println("\nO CPF não pode ser vazio.");
			ex1 = corCpfInv(ex1);
		}
		return ex1;
	}

	public Servidor corCpfInv(Servidor s1) {
		try {
			String cpfStr = l.entDados("\nNova Entrada - Informe o Cpf: ");
			if (cpfStr.isEmpty()) {
				throw new NullPointerException();
			}
			s1.setCpf(Integer.parseInt(cpfStr));
		} catch (CpfInvException cpi) {
			cpi.impCpfInv();
			s1 = cpi.corCpfInv(s1);
		} catch (NumberFormatException nfe) {
			System.out.println("\nO CPF deve ser um número inteiro.");
			s1 = corCpfInv(s1);
		} catch (NullPointerException npe) {
			System.out.println("\nO CPF não pode ser vazio.");
			s1 = corCpfInv(s1);
		}
		return s1;
	}
}
