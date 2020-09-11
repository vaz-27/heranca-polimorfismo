package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date dataFabricado;
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date dataFabricado) {
		super(nome, preco);
		this.dataFabricado = dataFabricado;
	}

	public Date getDataFabricado() {
		return dataFabricado;
	}

	public void setDataFabricado(Date dataFabricado) {
		this.dataFabricado = dataFabricado;
	}
	
	@Override
	public String toString() {
		return super.toString() 
				+ "(Usado, Data de Fabricação: " 
				+ sdf.format(dataFabricado) 
				+ ")";
	}
	
	
}
