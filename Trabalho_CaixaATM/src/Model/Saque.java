package Model;

public class Saque {
	int idSaque, id_conta; 
    float valorSaque; 

    public Saque() {}

	public int getIdSaque() {
		return idSaque;
	}

	public void setIdSaque(int idSaque) {
		this.idSaque = idSaque;
	}

	public float getValorSaque() {
		return valorSaque;
	}

	public void setValorSaque(float valorSaque) {
		this.valorSaque = valorSaque;
	}

	public int getId_conta() {
		return id_conta;
	}

	public void setId_conta(int id_conta) {
		this.id_conta = id_conta;
	}
}
