package fut;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Estadio {
	
	private String nome;
	private String cidade;
	private int capacidade;
	
	private Time donoDaCasa;
	
	private List<Jogo> jogos = new ArrayList<>();
	
	public void cadastrarJogo(Jogo jogo) {
		this.jogos.add(jogo);
	}
	
	public List<Jogo> getJogosDoDia(Date data) {		
		List<Jogo> jogosDoDia = new ArrayList<>();
		
		//Um codigo inteligente aqui		
		return jogosDoDia;
	}
	
	// Getters e Setters
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public Time getDonoDaCasa() {
		return donoDaCasa;
	}
	
	public void setDonoDaCasa(Time donoDaCasa) {
		this.donoDaCasa = donoDaCasa;
	}
	
	public List<Jogo> getJogos() {
		return jogos;
	}

}
