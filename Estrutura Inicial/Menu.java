//Lucas Carvalho Batista Canhadas Genvigir

import java.util.List;
import java.util.ArrayList;

public class Menu{

	private GerPessoas gerPessoas = new GerPessoas();	
	
	private Leitura l = new Leitura();
	private Aluno a;
	//private List < Aluno > bdA = new ArrayList < Aluno > ();
	private ExAluno ex;
	//private List < ExAluno > bdEx = new ArrayList < ExAluno > ();
	private Servidor s;
	//private List < Servidor > bdS = new ArrayList < Servidor > ();
	private int op, op1;

	public void geraMenu() {
		Principal principal = new Principal();
		while(op1 != 6) {
			System.out.println("\n1) Cadastro de Pessoa");
			System.out.println("2) Listar todas as Pessoa");
			System.out.println("3) Consultar Pessoa pelo Cpf");
			System.out.println("4) Remover Pessoa pelo Cpf");
			System.out.println("5) Atualizar dados de Pessoa pelo Cpf");
			System.out.println("6) Sair do Sistema");
			try {
				op1 = Integer.parseInt(l.entDados("\nEscolha uma opcao"));
			} catch (NumberFormatException nfe) {
				l.entDados("\nO valor de escolha deve ser um inteiro. Press <Enter> para continuar");
				continue;
			}
			switch(op1) {
				case 1:
					System.out.println("\n-------------------");
					System.out.println("Cadastro de Pessoas");
					System.out.println("-------------------");
					gerPessoas.menuCadastro();
					break;
				case 2:
					System.out.println("\n-----------------------");
					System.out.println("Listar todas as Pessoas Cadastradas.");
					System.out.println("-----------------------");
					gerPessoas.listarPessoas();
					break;
				case 3:
					System.out.println("\n--------------------------");
					System.out.println("Consultar pessoa pelo Cpf.");
					System.out.println("--------------------------");
					int cpfConsulta = Integer.parseInt(l.entDados("Informe o CPF: "));
					Pessoa pessoaEncontrada = gerPessoas.consPesCod(cpfConsulta);
					gerPessoas.impOnePes(pessoaEncontrada);
					break;
				case 4:
					System.out.println("\n-----------------");
					System.out.println("Remover pelo Cpf.");
					System.out.println("-----------------");
					gerPessoas.removerPessoaPorCpf();
					break;
				case 5:
					System.out.println("\n----------------");
					System.out.println("Atualizar Dados.");
					System.out.println("----------------");
					gerPessoas.atualizaDadosPorCpf();
					break;
				case 6:
					String resp = l.entDados("\nDeseja realmente sair do Sistema? <s/n>");
					if(resp.equalsIgnoreCase("s")) {
						System.out.println("Saindo do Sistema...");
						op1 = 6;
					} else {
						op1 = 0;
					}
					break;
				default:
					l.entDados("\nA opcao deve estar entre 1 e 6");
					op1 = 0;
			} // fecha switch op1
		} //fecha while op1
	} //fecha menu
} //fecha classe