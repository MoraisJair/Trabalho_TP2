package Model;

public class Deposito {
	int idDeposito, id_conta; 
    float valorDeposito; 

    public Deposito() {}

	public int getIdDeposito() {
		return idDeposito;
	}

	public void setIdDeposito(int idDeposito) {
		this.idDeposito = idDeposito;
	}

	public float getValorDeposito() {
		return valorDeposito;
	}

	public void setValorDeposito(float valorDeposito) {
		this.valorDeposito = valorDeposito;
	}

	public int getId_conta() {
		return id_conta;
	}

	public void setId_conta(int id_conta) {
		this.id_conta = id_conta;
	}
}
