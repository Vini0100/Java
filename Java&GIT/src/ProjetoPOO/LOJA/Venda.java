
package ProjetoPOO.LOJA;
public class Venda {
	private Double valor;
	private String formaPagamento;
	private String matricula;

	public Venda(double valor, String formaPagamento, String matricula){
		this.valor = valor;
		this.formaPagamento = formaPagamento;
		this.matricula = matricula;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}

