
public class UtenteModel {

	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNomeModelDto() {
		nome = UtenteDto.getNomeDto();
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		// metodo che aggiorna il database...
	}
	
	public void stampaNome() {
		System.out.println(this.getNome());
	}
}
