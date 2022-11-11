package cofrinho;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
	
	private List<Moeda> listaMoedas = new ArrayList<Moeda>();	
	private List<Dolar> listaDolar = new ArrayList<Dolar>();
	private List<Real> listaReal = new ArrayList<Real>();
	private List<Euro> listaEuro = new ArrayList<Euro>();
		
	public void add(Moeda m) {
		listaMoedas.add(m);
				
	}
	public double listagemMoedas() {
		double total = 0;
		for (Moeda m : listaMoedas) {
			total += m.getValor();
			
		}
		return total;
	}
	
	public List<Moeda> getListaMoedas() {
		return listaMoedas;
	}
	
	public List<Dolar> getListaDolar() {
		return listaDolar;
	}
	
	public List<Real> getListaReal() {
		return listaReal;
	}
	
	public List<Euro> getListaEuro() {
		return listaEuro;
	}
			
}
