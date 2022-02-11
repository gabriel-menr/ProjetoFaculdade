package Model;

public class JavaBeans {

	private String usnome;

	private String senha;

	private String email;

	private String cpf;

	public JavaBeans() {
		super();
	}

	
	public JavaBeans(String usnome, String senha, String email, String cpf) {
		super();
		this.usnome = usnome;
		this.senha = senha;
		this.email = email;
		this.cpf = cpf;
	}

	public String getUsnome() {
		return usnome;
	}

	public void setUsnome(String usnome) {
		this.usnome = usnome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}