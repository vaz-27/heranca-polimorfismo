package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Produto;
import Entidades.ProdutoImportado;
import Entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto prod = new Produto();
		List<Produto> lista = new ArrayList<>();
		
		
		System.out.print("Entre com o número de produtos: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Produto #" + i + " dados: ");
			System.out.print("Comum, usado ou importado (c/u/i): ");
			char c = sc.nextLine().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
			sc.nextLine();
			
			if (c == 'i') {
				System.out.print("Taxa da alfandega: ");
				Double alfandega = sc.nextDouble();
				prod = new ProdutoImportado(nome,preco,alfandega);
			}
			
			else if (c == 'u') {
				System.out.print("Data de Fabricação: ");
				Date data = sdf.parse(sc.nextLine());
				prod = new ProdutoUsado(nome,preco,data);
			}
			
			else {
				prod = new Produto(nome,preco);
			}
			
			lista.add(prod);
		}
		
		for(Produto i : lista) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
