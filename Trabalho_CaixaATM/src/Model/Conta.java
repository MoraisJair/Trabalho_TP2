package Model;

public class Conta {
	int idConta; 
    String nomeCliente; 
    String cpfCliente; 
    String rgCliente; 
    int agencia, login, senha;
    Float saldo; 

    public Conta() {}
    
    public int getIdConta() {
		return idConta;
	}
    
    public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
    
    public String getNomeCliente() {
		return nomeCliente;
	}
    
    public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
    
    public String getCpfCliente() {
		return cpfCliente;
	}
    
    public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
    
    public String getRgCliente() {
		return rgCliente;
	}
    
    public void setRgCliente(String rgCliente) {
		this.rgCliente = rgCliente;
	}
    
    public int getAgencia() {
		return agencia;
	}
    
    public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
    
    public int getLogin() {
		return login;
	}
    
    public void setLogin(int login) {
		this.login = login;
	}
    
    public int getSenha() {
		return senha;
	}
    
    public void setSenha(int senha) {
		this.senha = senha;
	}
    
    public Float getSaldo() {
		return saldo;
	}
    
    public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}
}
