package fut;
import java.util.Date;


public class Jogo {
	
	private Time timeA;
	private Time timeB;
	private int golsTimeA;
	private int golsTimeB;
	private Date data;
	
	private boolean encerrado;
	
	Estadio estadio;
	
	public Jogo(Time timeA, Time timeB, Date data, Estadio estadio) {
		// Atributos necessarios para criar um jogo
		this.timeA = timeA;
		this.timeB = timeB;
		this.data = data;
		this.estadio = estadio;
		
		// Inicializa um jogo com zero a zero
		this.setEncerrado(false);
		this.golsTimeA = 0;
		this.golsTimeB = 0;
	}
	
	public void finalizaJogo(int golsTimeA, int golsTimeB) {
		this.golsTimeA = golsTimeA;
		this.golsTimeB = golsTimeB;
		this.setEncerrado(true);		
		
		// Incrementa os contadores de empates, vitorias ou derrotas do time
		if(golsTimeA == golsTimeB) {
			timeA.contEmpate();
			timeB.contEmpate();
		} else if(golsTimeA > golsTimeB) {
			timeA.contVitoria();
			timeB.contDerrota();
		} else {
			timeA.contDerrota();
			timeB.contVitoria();
		}		
	}

	// Metodo que retorna o Time vencedor, ou null se foi empate	
	public Time getTimeVencedor() {
		if(golsTimeA == golsTimeB) {
			return null;
		} else if(golsTimeA > golsTimeB) {
			return timeA;
		} else {
			return timeB;
		}		
	}
	
	// Getters e Setters
	
	public Time getTimeA() {
		return timeA;
	}

	public void setTimeA(Time timeA) {
		this.timeA = timeA;
	}

	public Time getTimeB() {
		return timeB;
	}

	public void setTimeB(Time timeB) {
		this.timeB = timeB;
	}

	public int getGolsTimeA() {
		return golsTimeA;
	}

	public void setGolsTimeA(int golsTimeA) {
		this.golsTimeA = golsTimeA;
	}

	public int getGolsTimeB() {
		return golsTimeB;
	}

	public void setGolsTimeB(int golsTimeB) {
		this.golsTimeB = golsTimeB;
	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public boolean isEncerrado() {
		return encerrado;
	}

	private void setEncerrado(boolean encerrado) {
		this.encerrado = encerrado;
	}	

}
