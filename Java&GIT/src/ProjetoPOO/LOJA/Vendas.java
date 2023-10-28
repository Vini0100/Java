
package ProjetoPOO.LOJA;
import java.util.ArrayList;
import java.util.List;

public final class Vendas {
	
	private static Vendas instance;
	List<Venda> vendas;
	
	public Vendas() {
		this.vendas = new ArrayList<>();
		realizaVenda(230.0, "Cr�dito", "man123");
		realizaVenda(130.0, "Cr�dito", "man123");
		realizaVenda(240.0, "Cr�dito", "man123");
		realizaVenda(230.0, "D�bito", "joa123");
		realizaVenda(30.0, "D�bito", "joa123");
		realizaVenda(300.0, "D�bito", "joa123");
	}
	
	public void gerarRelatorio() {
		System.out.println("|N� |  Matricula  | Valor  |  Pagamento  |");
		for(int i = 0; i < this.vendas.size(); i++) {
			Venda venda = vendas.get(i);
			System.out.println((i+1) + ") " + venda.getMatricula() + " " + venda.getValor() + " " + venda.getFormaPagamento());
		}
	}
	
	public void gerarRelatorioIndividual(String matricula) {
		System.out.println("|N� |  Matricula  | Valor  |  Pagamento  |");
		for(int i = 0; i < this.vendas.size(); i++) {
			Venda venda = vendas.get(i);
			if(vendas.get(i).getMatricula().equals(matricula)) {
				System.out.println((i+1) + ") " + venda.getMatricula() + " " + venda.getValor() + " " + venda.getFormaPagamento());
			}
		}
	}
	
	public void realizaVenda(double valor, String formaPagamento, String matricula) {
		Venda venda = new Venda(valor, formaPagamento, matricula);
		vendas.add(venda);
	}
	
	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}
	
	public static Vendas getInstance() {
        if (instance == null) {
            instance = new Vendas();
        }
        return instance;
    }
}
