public class Pessoa {

	private String nome;
	private String email;
	private String cpf;
	private String rg;
	
	public Pessoa(String nome, String email, String cpf, String rg) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.rg = rg;
		
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
}
