//Lucas Carvalho Batista Canhadas Genvigir

public class Aluno extends Pessoa {

	private int ra;
	private String curso;

	//Metodo todo Construtor
	public Aluno() {
		ra = 0;
		curso = "";
	}

	//Sobrecarga
	public Aluno(int ra, String curso) {
		this.ra = ra;
		this.curso = curso;
	}

	//Sobrescrita
	public String getTipo() {
		return "Aluno";
	}

	//Sobrescrita
	public String getIdentificacao() {
		return "RA: " + getRa();
	}

	//Sobrescrita
	public String getDetalhes() {
		return "Curso: " + getCurso();
	}

	public int getRa() {
		return ra;
	}

	public String getCurso() {
		return curso;
	}

	public void setRa(int ra) throws RAInvException {
		if (ra < 1800 || ra > 2600) {
			throw new RAInvException();
		}
		this.ra = ra;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

    void setCampeonato(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setCamp(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setCid(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setNumeroMod(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setNomeMod(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
