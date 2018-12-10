package fut;
import java.util.List;


public class Time {
	
	private String nome;	
	private int contVitorias;
	private int contDerrotas;	
	private int contEmpates;

	List<Jogador> jogadores;
	
	static private int MINIMO_JOGADORES = 11;
	
	public Time(String nome, List<Jogador> jogadores) {
		
		if(jogadores.size() >= MINIMO_JOGADORES) {
			System.err.println("O numero de Jogadores deve ser maior que 11 para criar um time");
		} else {
			this.nome = nome;
			this.jogadores = jogadores;
		}		
		
	}	
	
	public void contEmpate() {
		this.contEmpates++;
	}

	public void contVitoria() {
		this.contVitorias++;	
	}

	public void contDerrota() {
		this.contDerrotas++;
	}
	
	public void addJogador(Jogador jogador) {
		this.jogadores.add(jogador);	
	}
	
	public boolean removeJogador(Jogador jogador) {
	
		if(this.jogadores.size()-1 < 11) {
			return false;
		} else {
			// Algum codigo inteligente aqui que remove o jogador do time
			jogador.removeTime(this);
			return true;
		}
		
	}
	
	// Getters e Setters
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getContVitorias() {
		return contVitorias;
	}

	public int getContDerrotas() {
		return contDerrotas;
	}

	public int getContEmpates() {
		return contEmpates;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}
	
}
