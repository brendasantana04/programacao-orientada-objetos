package exercicio7;

public class Caixa{
	
	double valorProduto;
	double saldo;
	String nomeProduto;
	
	Caixa (double valorProduto, String nomeProduto){
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		this.saldo = 0;
	}
	
	public static void main (String[] args){
		Caixa caixa = new Caixa(0, "caixa");
		caixa.criandoVendas();
	}
	
	public void venda (Caixa c){
		this.saldo = this.saldo + c.valorProduto;
		System.out.println("O produto " + c.nomeProduto + " de valor R$" + c.valorProduto + " foi adicionado ao seu saldo. == R$" + this.saldo);
	}
	
	public void criandoVendas(){
		Caixa p1 = new Caixa(2, "macarrao");
		Caixa p2 = new Caixa(10, "coca-cola");
		Caixa p3 = new Caixa(5, "molho de tomate");
		
		venda(p1);
		venda(p2);
		venda(p3);
		
		System.out.println("Saldo final: R$" + this.saldo);		
	}
}