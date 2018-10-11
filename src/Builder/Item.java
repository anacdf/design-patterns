package Builder;

public class Item {

	
	private String nome;
	private boolean foraCaixa;
	
	
	public Item(String nome, boolean onde) {
		
		
		this.nome = nome;
		this.foraCaixa = onde;
			
	}
	
	public boolean getLocal() {
		return foraCaixa;
	}
	
	public String getNome() {
		return nome;
	}
	
}
