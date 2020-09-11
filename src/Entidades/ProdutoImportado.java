package Entidades;

public class ProdutoImportado extends Produto {
	
	private Double alfandega;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double alfandega) {
		super(nome, preco);
		this.alfandega = alfandega;
	}

	public Double getAlfandega() {
		return alfandega;
	}

	public void setAlfandega(Double alfandega) {
		this.alfandega = alfandega;
	}
	
	public Double precoTotal() {
		return preco += alfandega;
	}

	@Override
	public String toString() {
		return getNome() 
				+ " $ "
				+ precoTotal()
				+ " (Taxa da Alfandega: $ " 
				+ alfandega 
				+ ")";
	}
	
}
