package SingletonSession;

public class Sessao {
	public static Sessao sessao; 
    String nomeCliente; 
    Float saldo; 
    int id; 

    public int getId() {
        return sessao.id;
    }

    public void setId(int id) {
        sessao.id = id;
    }
     
    public Sessao(){}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}
    
    //Instancia a variavel ao fazer login
    public static synchronized Sessao getSessao(){ 
        if(sessao == null)
            sessao = new Sessao(); 
        
        return sessao; 
    }
}
