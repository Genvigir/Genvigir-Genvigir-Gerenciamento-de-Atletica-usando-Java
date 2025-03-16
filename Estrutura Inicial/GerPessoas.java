//Lucas Carvalho Batista Canhadas Genvigir

import java.util.List;
import java.util.ArrayList;

public class GerPessoas {
	private Leitura l = new Leitura();
	private Aluno a;
	private List < Aluno > bdA = new ArrayList < Aluno > ();
	private ExAluno ex;
	private List < ExAluno > bdEx = new ArrayList < ExAluno > ();
	private Servidor s;
	private List < Servidor > bdS = new ArrayList < Servidor > ();
	private int op, op1;
	
//------------------------------------------------------------------------------------------------------------------------------------------------
	public void listarPessoas() {
		System.out.println("Listar todas as Pessoas.");
		
		if(bdA.isEmpty()) {
			System.out.println("Nenhum Aluno cadastrado.");
		} else {
			System.out.println("Alunos:");
			for(int i = 0; i < bdA.size(); i++) {
				System.out.println("Cpf: " + bdA.get(i).getCpf() + " - Nome: " + bdA.get(i).getNome());
			}
		}
		
		if(bdEx.isEmpty()) {
			System.out.println("Nenhum Ex-Aluno cadastrado.");
		} else {
			System.out.println("Ex-Alunos:");
			for(int i = 0; i < bdEx.size(); i++) {
				System.out.println("Cpf: " + bdEx.get(i).getCpf() + " - Nome: " + bdEx.get(i).getNome());
			}
		}
		
		if(bdS.isEmpty()) {
			System.out.println("Nenhum Servidor cadastrado.");
		} else {
			System.out.println("Servidores:");
			for(int i = 0; i < bdS.size(); i++) {
				System.out.println("Cpf: " + bdS.get(i).getCpf() + " - Nome: " + bdS.get(i).getNome());
			}
		}
	}
//------------------------------------------------------------------------------------------------------------------------------------------------
	public Pessoa consPesCod(int cpf) {
		for(Aluno aluno: bdA) {
			if(aluno.getCpf() == cpf) {
				return aluno;
			}
		}
		for(ExAluno exAluno: bdEx) {
			if(exAluno.getCpf() == cpf) {
				return exAluno;
			}
		}
		for(Servidor servidor: bdS) {
			if(servidor.getCpf() == cpf) {
				return servidor;
			}
		}
		return null;
	}
//------------------------------------------------------------------------------------------------------------------------------------------------
	public void impOnePes(Pessoa pes) {
		if(pes != null) {
			System.out.println("Cpf: " + pes.getCpf() + " - Nome: " + pes.getNome());
		} else {
			System.out.println("Pessoa não encontrada.");
		}
	}
//------------------------------------------------------------------------------------------------------------------------------------------------
	public void removerPessoaPorCpf() {
		System.out.println("Remover pessoa pelo CPF.");
		int cpfRemover = Integer.parseInt(l.entDados("Informe o CPF: "));
		boolean removido = false;
		for(Aluno aluno: bdA) {
			if(aluno.getCpf() == cpfRemover) {
				bdA.remove(aluno);
				System.out.println("Aluno removido com sucesso.");
				removido = true;
				break;
			}
		}
		if(!removido) {
			for(ExAluno exAluno: bdEx) {
				if(exAluno.getCpf() == cpfRemover) {
					bdEx.remove(exAluno);
					System.out.println("Ex-Aluno removido com sucesso.");
					removido = true;
					break;
				}
			}
		}
		if(!removido) {
			for(Servidor servidor: bdS) {
				if(servidor.getCpf() == cpfRemover) {
					bdS.remove(servidor);
					System.out.println("Servidor removido com sucesso.");
					removido = true;
					break;
				}
			}
		}
		if(!removido) {
			System.out.println("Pessoa com CPF " + cpfRemover + " não encontrada.");
		}
	}
//------------------------------------------------------------------------------------------------------------------------------------------------
	public void atualizaDadosPorCpf() {
		System.out.println("Atualizar dados de Pessoa.");
		int cpfAtualizar = Integer.parseInt(l.entDados("Informe o CPF: "));
		boolean atualizado = false;

		for(int i = 0; i < bdA.size(); i++) {
			if(bdA.get(i).getCpf() == cpfAtualizar) {
				Aluno aluno = bdA.get(i);
				aluno.setNome(l.entDados("Informe o novo nome: "));
				bdA.set(i, aluno);
				impAluno(aluno);
				System.out.println("Dados do Aluno atualizados com sucesso.");
				atualizado = true;
				break;
			}
		}
		if(!atualizado) {
			for(int i = 0; i < bdEx.size(); i++) {
				if(bdEx.get(i).getCpf() == cpfAtualizar) {
					ExAluno exAluno = bdEx.get(i);
					exAluno.setNome(l.entDados("Informe o novo nome: "));
					bdEx.set(i, exAluno);
					impExAluno(exAluno);
					System.out.println("Dados do Ex-Aluno atualizados com sucesso.");
					atualizado = true;
					break;
				}
			}
		}
		if(!atualizado) {
			for(int i = 0; i < bdS.size(); i++) {
				if(bdS.get(i).getCpf() == cpfAtualizar) {
					Servidor servidor = bdS.get(i);
					servidor.setNome(l.entDados("Informe o novo nome: "));
					bdS.set(i, servidor);
					impServ(servidor);
					System.out.println("Dados do Servidor atualizados com sucesso.");
					atualizado = true;
					break;
				}
			}
		}
		if(!atualizado) {
			System.out.println("Pessoa com CPF " + cpfAtualizar + " não encontrada.");
		}
	}
//------------------------------------------------------------------------------------------------------------------------------------------------
	public void menuCadastro() {
		int op = 0;
		while(op != 4) {
			System.out.println("\nVocê deseja: ");
			System.out.println("1 - Cadastrar Aluno");
			System.out.println("2 - Cadastrar Ex Aluno");
			System.out.println("3 - Cadastrar Servidor");
			System.out.println("4 - Voltar ao menu anterior");
			System.out.println("5 - Sair do Programa\n ");
			String input = l.entDados("Informe a opção: ");
			boolean isValid = false;
			while(!isValid) {
				try {
					op = Integer.parseInt(input);
					isValid = true;
				} catch (NumberFormatException e) {
					System.out.println("Entrada inválida. Por favor, informe um número.");
					input = l.entDados("Informe a opcao: ");
				}
			}
			Participante participante;
			switch(op) {
				case 1:
					participante = entradaDadosAluno();
					System.out.println("\n-----Cadastro realizado com sucesso!-----");
					break;
				case 2:
					participante = entradaDadosExAluno();
					System.out.println("\n-----Cadastro realizado com sucesso!-----");
					break;
				case 3:
					participante = entradaDadosServidor();
					System.out.println("\n-----Cadastro realizado com sucesso!-----");
					break;
				case 4:
					System.out.println("Voltando ao menu principal.");
					break;
				case 5:
					System.out.println("Saindo do Sistema.");
					System.exit(0);
					break;
				default:
					System.out.println("Opcao inválida.");
			}
		}
	}
//------------------------------------------------------------------------------------------------------------------------------------------------
	public Aluno entradaDadosAluno() {
		a = new Aluno();
		System.out.println("\n---------------------------------");
		System.out.println("Preencha os seus dados cadastrais");
		System.out.println("---------------------------------");
		try {
			// Usa o método entDados para obter e converter o CPF
			int cpf = (Integer.parseInt(l.entDados("\nInforme o CPF: ")));
			// Verifica se o CPF já está cadastrado
			boolean cpfExistente = false;
			for(Aluno aluno: bdA) {
				if(aluno.getCpf() == cpf) {
					cpfExistente = true;
					break;
				}
			}
			// Verifica em ExAluno
			if(!cpfExistente) {
				for(ExAluno exAluno: bdEx) {
					if(exAluno.getCpf() == cpf) {
						cpfExistente = true;
						break;
					}
				}
			}
			// Verifica em Servidor
			if(!cpfExistente) {
				for(Servidor servidor: bdS) {
					if(servidor.getCpf() == cpf) {
						cpfExistente = true;
						break;
					}
				}
			}
			if(cpfExistente) {
				System.out.println("\nCPF já cadastrado. Por favor, informe um CPF válido.");
				return entradaDadosAluno(); // Chama o método novamente para nova entrada
			}
			// Define o CPF no objeto Aluno
			a.setCpf(cpf);
		} catch (CpfInvException cpi) {
			cpi.impCpfInv();
			a = cpi.corCpfInv(a);
		} catch (NumberFormatException nfe) {
			System.out.println("\nO CPF deve ser um número inteiro.");
			a = new CpfInvException().corCpfInv(a);
		} catch (NullPointerException npe) {
			System.out.println("\nO CPF não pode ser vazio.");
			a = new CpfInvException().corCpfInv(a);
		}
		try {
			String nome = l.entDados("\nInforme o Nome: ");
			if(nome == null || nome.trim().isEmpty() || nome.matches("\\d+")) {
				throw new EntradaInvalidaException();
			}
			a.setNome(nome);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			String nomeCorrigido = eie.corEntradaInvalida(a.getNome());
			a.setNome(nomeCorrigido);
		}
		try {
			String idadeStr = l.entDados("\nInforme a Idade: ");
			if(idadeStr.isEmpty()) {
				throw new NullPointerException();
			}
			a.setIdade(Integer.parseInt(idadeStr));
		} catch (IdadeInvException iie) {
			iie.impIdadeInv();
			a = iie.corIdadeInv(a);
		} catch (NumberFormatException nfe) {
			System.out.println("\nA idade deve ser um número inteiro.");
			a = new IdadeInvException().corIdadeInv(a);
		} catch (NullPointerException npe) {
			System.out.println("\nA idade não pode ser vazia.");
			a = new IdadeInvException().corIdadeInv(a);
		}
		try {
			String sexo = l.entDados("\nInforme o Sexo: ");
			if(sexo == null || sexo.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			a.setSexo(sexo);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			String sexoCorrigido = eie.corEntradaInvalida(a.getSexo());
			a.setSexo(sexoCorrigido);
		}
		System.out.println("\n----------------------------");
		System.out.println("Preencha seus dados de Aluno");
		System.out.println("----------------------------");
		try {
			String raStr = l.entDados("\nInforme o Ra: ");
			if(raStr.isEmpty()) {
				throw new NullPointerException();
			}
			int ra = Integer.parseInt(raStr);
			if(ra < 1800 || ra > 2600) {
				throw new RAInvException();
			}
			a.setRa(ra);
		} catch (RAInvException raie) {
			raie.impRAInv();
			a = raie.corRAInv(a);
		} catch (NumberFormatException nfe) {
			System.out.println("\nO RA deve ser um número inteiro.");
			a = new RAInvException().corRAInv(a);
		} catch (NullPointerException npe) {
			System.out.println("\nO RA não pode ser vazio.");
			a = new RAInvException().corRAInv(a);
		}
		try {
			String curso = l.entDados("\nInforme o Curso: ");
			if(curso == null || curso.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			a.setCurso(curso);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			String cursoCorrigido = eie.corEntradaInvalida(a.getCurso());
			a.setCurso(cursoCorrigido);
		}
		System.out.println("\n-------------------------------");
		System.out.println("Preencha os dados do campeonato");
		System.out.println("-------------------------------");
		try {
			String campeonato = l.entDados("\nNome do Campeonato: ");
			if(campeonato == null || campeonato.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			a.getEvento().setCampeonato(campeonato);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			a.getEvento().setCampeonato(eie.corEntradaInvalida(a.getEvento().getCampeonato()));
		}
		try {
			String cidade = l.entDados("\nQual a cidade: ");
			if(cidade == null || cidade.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			a.getEvento().setCidade(cidade);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			String cidadeCorrigida = eie.corEntradaInvalida(a.getEvento().getCidade());
			a.getEvento().setCidade(cidadeCorrigida);
		}
		System.out.println("-------------------------------");
		System.out.println("Preencha os dados da modalidade");
		System.out.println("-------------------------------");
		try {
			int quantidade = Integer.parseInt(l.entDados("\nQuantidade de Modalidades: "));
			if(quantidade < 1 || quantidade > 5) {
				throw new QuantidadeInvException();
			}
			a.getEvento().getModalidade().setQuantidade(quantidade);
		} catch (QuantidadeInvException qie) {
			qie.impQuantidadeInv();
			a.getEvento().setModalidade(qie.corQuantidadeInv(a.getEvento().getModalidade()));
		} catch (NumberFormatException nfe) {
			System.out.println("\nA quantidade deve ser um número inteiro.");
			a.getEvento().setModalidade(new QuantidadeInvException().corQuantidadeInv(a.getEvento().getModalidade()));
		} catch (NullPointerException npe) {
			System.out.println("\nA quantidade não pode ser vazia.");
			a.getEvento().setModalidade(new QuantidadeInvException().corQuantidadeInv(a.getEvento().getModalidade()));
		}
		try {
			String nomeMod = l.entDados("\nNome da Modalidade: ");
			if(nomeMod == null || nomeMod.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			a.getEvento().getModalidade().setNomeMod(nomeMod);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			a.getEvento().getModalidade().setNomeMod(eie.corEntradaInvalida(a.getEvento().getModalidade().getNomeMod()));
		}
		bdA.add(a);
		return a;
	}
//------------------------------------------------------------------------------------------------------------------------------------------------
	public  ExAluno entradaDadosExAluno() {
		ex = new ExAluno();
		System.out.println("\n---------------------------------");
		System.out.println("Preencha os seus dados cadastrais");
		System.out.println("---------------------------------");
		try {
			// Usa o método entDados para obter e converter o CPF
			int cpf = (Integer.parseInt(l.entDados("\nInforme o CPF: ")));
			// Verifica se o CPF já está cadastrado
			boolean cpfExistente = false;
			for(Aluno aluno: bdA) {
				if(aluno.getCpf() == cpf) {
					cpfExistente = true;
					break;
				}
			}
			// Verifica em ExAluno
			if(!cpfExistente) {
				for(ExAluno exAluno: bdEx) {
					if(exAluno.getCpf() == cpf) {
						cpfExistente = true;
						break;
					}
				}
			}
			// Verifica em Servidor
			if(!cpfExistente) {
				for(Servidor servidor: bdS) {
					if(servidor.getCpf() == cpf) {
						cpfExistente = true;
						break;
					}
				}
			}
			if(cpfExistente) {
				System.out.println("\nCPF já cadastrado. Por favor, informe um CPF válido.");
				return entradaDadosExAluno(); // Chama o método novamente para nova entrada
			}
			// Define o CPF no objeto Aluno
			ex.setCpf(cpf);
		} catch (CpfInvException cpi) {
			cpi.impCpfInv();
			ex = cpi.corCpfInv(ex);
		} catch (NumberFormatException nfe) {
			System.out.println("\nO CPF deve ser um número inteiro.");
			ex = new CpfInvException().corCpfInv(ex);
		} catch (NullPointerException npe) {
			System.out.println("\nO CPF não pode ser vazio.");
			ex = new CpfInvException().corCpfInv(ex);
		}
		try {
			String nome = l.entDados("\nInforme o Nome: ");
			if(nome == null || nome.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			ex.setNome(nome);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			ex.setNome(eie.corEntradaInvalida(ex.getNome()));
		}
		try {
			String idadeStr = l.entDados("\nInforme a Idade: ");
			if(idadeStr.isEmpty()) {
				throw new NullPointerException();
			}
			ex.setIdade(Integer.parseInt(idadeStr));
		} catch (IdadeInvException iie) {
			iie.impIdadeInv();
			ex = iie.corIdadeInv(ex);
		} catch (NumberFormatException nfe) {
			System.out.println("\nA idade deve ser um número inteiro.");
			ex = new IdadeInvException().corIdadeInv(ex);
		} catch (NullPointerException npe) {
			System.out.println("\nA idade não pode ser vazia.");
			ex = new IdadeInvException().corIdadeInv(ex);
		}
		try {
			String sexo = l.entDados("\nInforme o Sexo: ");
			if(sexo == null || sexo.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			ex.setSexo(sexo);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			String sexoCorrigido = eie.corEntradaInvalida(ex.getSexo());
			ex.setSexo(sexoCorrigido);
		}
		System.out.println("\n-------------------------------");
		System.out.println("Preencha seus dados de Ex Aluno");
		System.out.println("-------------------------------");
		try {
			String curso = l.entDados("\nInforme o Curso: ");
			if(curso == null || curso.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			ex.setCurso(curso);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			ex.setCurso(eie.corEntradaInvalida(ex.getCurso()));
		}
		try {
			String anoFormStr = l.entDados("\nInforme o Ano de Formatura: ");
			if(anoFormStr.isEmpty()) {
				throw new NullPointerException();
			}
			ex.setAnoForm(Integer.parseInt(anoFormStr));
		} catch (AnoFormInvException afie) {
			afie.impAnoFormInv();
			ex = afie.corAnoFormInv(ex);
		} catch (NumberFormatException nfe) {
			System.out.println("\nO Ano de Formatura deve ser um número inteiro.");
			ex = new AnoFormInvException().corAnoFormInv(ex);
		} catch (NullPointerException npe) {
			System.out.println("\nO Ano de Formatura não pode ser vazio.");
			ex = new AnoFormInvException().corAnoFormInv(ex);
		}
		System.out.println("\n-------------------------------");
		System.out.println("Preencha os dados do campeonato");
		System.out.println("-------------------------------");
		try {
			String campeonato = l.entDados("\nNome do Campeonato: ");
			if(campeonato == null || campeonato.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			ex.getEvento().setCampeonato(campeonato);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			ex.getEvento().setCampeonato(eie.corEntradaInvalida(ex.getEvento().getCampeonato()));
		}
		try {
			String cidade = l.entDados("\nQual a Cidade: ");
			if(cidade == null || cidade.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			ex.getEvento().setCidade(cidade);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			ex.getEvento().setCidade(eie.corEntradaInvalida(ex.getEvento().getCidade()));
		}
		System.out.println("-------------------------------");
		System.out.println("Preencha os dados da modalidade");
		System.out.println("-------------------------------");
		try {
			int quantidade = Integer.parseInt(l.entDados("Quantidade de Modalidades: "));
			if(quantidade < 1 || quantidade > 5) {
				throw new QuantidadeInvException();
			}
			ex.getEvento().getModalidade().setQuantidade(quantidade);
		} catch (QuantidadeInvException qie) {
			qie.impQuantidadeInv();
			ex.getEvento().setModalidade(qie.corQuantidadeInv(ex.getEvento().getModalidade()));
		} catch (NumberFormatException nfe) {
			System.out.println("\nA quantidade deve ser um número inteiro.");
			ex.getEvento().setModalidade(new QuantidadeInvException().corQuantidadeInv(ex.getEvento().getModalidade()));
		} catch (NullPointerException npe) {
			System.out.println("\nA quantidade não pode ser vazia.");
			ex.getEvento().setModalidade(new QuantidadeInvException().corQuantidadeInv(ex.getEvento().getModalidade()));
		}
		try {
			String nomeMod = l.entDados("Nome da Modalidade: ");
			if(nomeMod == null || nomeMod.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			ex.getEvento().getModalidade().setNomeMod(nomeMod);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			ex.getEvento().getModalidade().setNomeMod(eie.corEntradaInvalida(ex.getEvento().getModalidade().getNomeMod()));
		}
		bdEx.add(ex);
		return ex;
	}
//------------------------------------------------------------------------------------------------------------------------------------------------
	public  Servidor entradaDadosServidor() {
		s = new Servidor();
		System.out.println("\n---------------------------------");
		System.out.println("Preencha os seus dados cadastrais");
		System.out.println("---------------------------------");
		try {
			// Usa o método entDados para obter e converter o CPF
			int cpf = (Integer.parseInt(l.entDados("\nInforme o CPF: ")));
			// Verifica se o CPF já está cadastrado
			boolean cpfExistente = false;
			for(Aluno aluno: bdA) {
				if(aluno.getCpf() == cpf) {
					cpfExistente = true;
					break;
				}
			}
			// Verifica em ExAluno
			if(!cpfExistente) {
				for(ExAluno exAluno: bdEx) {
					if(exAluno.getCpf() == cpf) {
						cpfExistente = true;
						break;
					}
				}
			}
			// Verifica em Servidor
			if(!cpfExistente) {
				for(Servidor servidor: bdS) {
					if(servidor.getCpf() == cpf) {
						cpfExistente = true;
						break;
					}
				}
			}
			if(cpfExistente) {
				System.out.println("\nCPF já cadastrado. Por favor, informe um CPF válido.");
				return entradaDadosServidor(); // Chama o método novamente para nova entrada
			}
			// Define o CPF no objeto Aluno
			s.setCpf(cpf);
		} catch (CpfInvException cpi) {
			cpi.impCpfInv();
			s = cpi.corCpfInv(s);
		} catch (NumberFormatException nfe) {
			System.out.println("\nO CPF deve ser um número inteiro.");
			s = new CpfInvException().corCpfInv(s);
		} catch (NullPointerException npe) {
			System.out.println("\nO CPF não pode ser vazio.");
			s = new CpfInvException().corCpfInv(s);
		}
		try {
			String nome = l.entDados("\nInforme o Nome: ");
			if(nome == null || nome.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			s.setNome(nome);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			s.setNome(eie.corEntradaInvalida(s.getNome()));
		}
		try {
			String idadeStr = l.entDados("\nInforme a Idade: ");
			if(idadeStr.isEmpty()) {
				throw new NullPointerException();
			}
			s.setIdade(Integer.parseInt(idadeStr));
		} catch (IdadeInvException iie) {
			iie.impIdadeInv();
			s = iie.corIdadeInv(s);
		} catch (NumberFormatException nfe) {
			System.out.println("\nA idade deve ser um número inteiro.");
			s = new IdadeInvException().corIdadeInv(s);
		} catch (NullPointerException npe) {
			System.out.println("\nA idade não pode ser vazia.");
			s = new IdadeInvException().corIdadeInv(s);
		}
		try {
			String sexo = l.entDados("\nInforme o Sexo: ");
			if(sexo == null || sexo.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			s.setSexo(sexo);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			s.setSexo(eie.corEntradaInvalida(s.getSexo()));
		}
		System.out.println("\n-------------------------------");
		System.out.println("Preencha seus dados de Servidor");
		System.out.println("-------------------------------");
		try {
			String setor = l.entDados("\nInforme o Setor: ");
			if(setor == null || setor.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			s.setSetor(setor);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			s.setSetor(eie.corEntradaInvalida(s.getSetor()));
		}
		try {
			String funcao = l.entDados("\nInforme a Funcao: ");
			if(funcao == null || funcao.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			s.setFuncao(funcao);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			s.setFuncao(eie.corEntradaInvalida(s.getFuncao()));
		}
		System.out.println("\n-------------------------------");
		System.out.println("Preencha os dados do campeonato");
		System.out.println("-------------------------------");
		try {
			String campeonato = l.entDados("Nome do Campeonato: ");
			if(campeonato == null || campeonato.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			s.getEvento().setCampeonato(campeonato);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			s.getEvento().setCampeonato(eie.corEntradaInvalida(s.getEvento().getCampeonato()));
		}
		try {
			String cidade = l.entDados("Qual a Cidade: ");
			if(cidade == null || cidade.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			s.getEvento().setCidade(cidade);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			s.getEvento().setCidade(eie.corEntradaInvalida(s.getEvento().getCidade()));
		}
		System.out.println("-------------------------------");
		System.out.println("Preencha os dados da modalidade");
		System.out.println("-------------------------------");
		try {
			int quantidade = Integer.parseInt(l.entDados("Quantidade de Modalidades: "));
			if(quantidade < 1 || quantidade > 5) {
				throw new QuantidadeInvException();
			}
			s.getEvento().getModalidade().setQuantidade(quantidade);
		} catch (QuantidadeInvException qie) {
			qie.impQuantidadeInv();
			s.getEvento().setModalidade(qie.corQuantidadeInv(s.getEvento().getModalidade()));
		} catch (NumberFormatException nfe) {
			System.out.println("\nA quantidade deve ser um número inteiro.");
			s.getEvento().setModalidade(new QuantidadeInvException().corQuantidadeInv(s.getEvento().getModalidade()));
		} catch (NullPointerException npe) {
			System.out.println("\nA quantidade não pode ser vazia.");
			s.getEvento().setModalidade(new QuantidadeInvException().corQuantidadeInv(s.getEvento().getModalidade()));
		}
		try {
			String nomeMod = l.entDados("Nome da Modalidade: ");
			if(nomeMod == null || nomeMod.trim().isEmpty()) {
				throw new EntradaInvalidaException();
			}
			s.getEvento().getModalidade().setNomeMod(nomeMod);
		} catch (EntradaInvalidaException eie) {
			eie.impEntradaInvalida();
			s.getEvento().getModalidade().setNomeMod(eie.corEntradaInvalida(s.getEvento().getModalidade().getNomeMod()));
		}
		bdS.add(s);
		return s;
	}
//------------------------------------------------------------------------------------------------------------------------------------------------
	public void impAluno(Aluno a) {
		for(int i = 0; i < bdA.size(); i++) {
			System.out.println("\nDados Pessoais:");
			System.out.println("CPF: " + bdA.get(i).getCpf());
			System.out.println("Nome: " + bdA.get(i).getNome());
			System.out.println("Idade: " + bdA.get(i).getIdade());
			System.out.println("Sexo: " + bdA.get(i).getSexo());
			System.out.println("\nDados do Aluno:");
			System.out.println("RA: " + bdA.get(i).getRa());
			System.out.println("Curso: " + bdA.get(i).getCurso());
			System.out.println("\nDados do Evento:");
			System.out.println("Campeonato: " + bdA.get(i).getEvento().getCampeonato());
			System.out.println("Cidade: " + bdA.get(i).getEvento().getCidade());
			System.out.println("\nDados da Modalidade:");
			System.out.println("Quantidade: " + bdA.get(i).getEvento().getModalidade().getQuantidade());
			System.out.println("Nome da Modalidade: " + bdA.get(i).getEvento().getModalidade().getNomeMod());
		}
	}
//------------------------------------------------------------------------------------------------------------------------------------------------
	public void impExAluno(ExAluno ex) {
		for(int i = 0; i < bdEx.size(); i++) {
			System.out.println("\nDados Pessoais:");
			System.out.println("CPF: " + bdEx.get(i).getCpf());
			System.out.println("Nome: " + bdEx.get(i).getNome());
			System.out.println("Idade: " + bdEx.get(i).getIdade());
			System.out.println("Sexo: " + bdEx.get(i).getSexo());
			System.out.println("\nDados do Ex Aluno:");
			System.out.println("Ano de Formatura: " + bdEx.get(i).getAnoForm());
			System.out.println("Curso: " + bdEx.get(i).getCurso());
			System.out.println("\nDados do Evento:");
			System.out.println("Campeonato: " + bdEx.get(i).getEvento().getCampeonato());
			System.out.println("Cidade: " + bdEx.get(i).getEvento().getCidade());
			System.out.println("\nDados da Modalidade:");
			System.out.println("Quantidade: " + bdEx.get(i).getEvento().getModalidade().getQuantidade());
			System.out.println("Nome da Modalidade: " + bdEx.get(i).getEvento().getModalidade().getNomeMod());
		}
	}
//------------------------------------------------------------------------------------------------------------------------------------------------
	public void impServ(Servidor s) {
		for(int i = 0; i < bdS.size(); i++) {
			System.out.println("\nDados Pessoais:");
			System.out.println("CPF: " + bdS.get(i).getCpf());
			System.out.println("Nome: " + bdS.get(i).getNome());
			System.out.println("Idade: " + bdS.get(i).getIdade());
			System.out.println("Sexo: " + bdS.get(i).getSexo());
			System.out.println("\nDados do Servidor:");
			System.out.println("Setor: " + bdS.get(i).getSetor());
			System.out.println("Funcao: " + bdS.get(i).getFuncao());
			System.out.println("\nDados do Evento:");
			System.out.println("Campeonato: " + bdS.get(i).getEvento().getCampeonato());
			System.out.println("Cidade: " + bdS.get(i).getEvento().getCidade());
			System.out.println("\nDados da Modalidade:");
			System.out.println("Quantidade: " + bdS.get(i).getEvento().getModalidade().getQuantidade());
			System.out.println("Nome da Modalidade: " + bdS.get(i).getEvento().getModalidade().getNomeMod());
		}
	}
}