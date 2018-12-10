package fut;

import java.util.List;

public class Jogador {
	
	private String nome;
	private int numero;
	
	List<Time> times;

	public void addTime(Time time) {
		this.times.add(time);
	}
	
	public void removeTime(Time time) {
		// Algum código inteligente aqui que remove time		
	}
	
	// Getters e Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Time> getTimes() {
		return times;
	}

}
