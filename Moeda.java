package cofrinho;

abstract class Moeda { 
	double valor;

	public Moeda(double valor) {
		super();
		this.valor = valor;
	

		
	}

	protected abstract double getValor();
	
	
}
	
	