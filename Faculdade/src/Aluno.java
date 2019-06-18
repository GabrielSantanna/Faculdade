
public class Aluno extends Pessoa{
	
	private String semAtual;
	private String curso;
	private String matricula;
	
	public Aluno(String semAtual, String curso, String matricula, String nome, String email, String cpf, String rg) {
		super(nome, email, cpf, rg);
		this.setSemAtual(semAtual);
		this.setCurso(curso);
		this.setMatricula(matricula);
		
	}

	public String getSemAtual() {
		return semAtual;
	}

	public void setSemAtual(String semAtual) {
		this.semAtual = semAtual;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
