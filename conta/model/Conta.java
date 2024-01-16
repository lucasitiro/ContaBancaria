package conta.model;

public class Conta {
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
		
	}
	public int getNumero() {
	        return numero;
	    }

	public int getAgencia() {
	        return agencia;
	    }

	public int getTipo() {
	        return tipo;
	    }

	public String getTitular() {
	        return titular;
	    }

	public float getSaldo() {
	        return saldo;
	    }

	    
	public void setNumero(int numero) {
	        this.numero = numero;
	    }

	public void setAgencia(int agencia) {
	        this.agencia = agencia;
	    }

	public void setTipo(int tipo) {
	        this.tipo = tipo;
	    }

	public void setTitular(String titular) {
	        this.titular = titular;
	    }

	public void setSaldo(float saldo) {
	        this.saldo = saldo;
	    }
	}

