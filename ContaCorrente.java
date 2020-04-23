
public class ContaCorrente {
	
	int numero;
	String titular;
	double saldo;
	double salario;
	
	
	
	public double getSaldo() {
		return this.saldo;
	}

	void deposita(double valor)
	{
		if(valor<0) {
			throw new IllegalArgumentException(" Voce tentou depositar um valor negativo na conta corrente !");
			
		}else {
			this.saldo += valor;
		}
		
		
	}
		

	public void saca(double valor)
	{
		if(valor > this.saldo)
		{	
			throw new SaldoInsuficienteException(valor);		
		}
		else
		{
			this.saldo -= valor;
			
		}
		 
	}
	
	

	
	

}
