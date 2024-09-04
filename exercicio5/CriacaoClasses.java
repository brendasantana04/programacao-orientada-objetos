package exercicio5;

public class CriacaoClasses{
	public static void main (String[] args){
		//fazendo televisoes
		Televisao tvA = new Televisao("lg","4k","desenho");
		Televisao tvB = new Televisao("toshiba","8k","show");
		
		ligarTelevisao(tvA);
		assistirConteudo(tvA);
		desligarTelevisao(tvA);
		
		ligarTelevisao(tvB);
		assistirConteudo(tvB);
		desligarTelevisao(tvB);
		
		//fazendo celulares
		Celular cA = new Celular("joao", "iphone");
		Celular cB = new Celular("maria", "motorola");
		
		ligarPessoa(cA);
		mandarMensagem(cA);
		jogar(cA);
		
		ligarPessoa(cB);
		mandarMensagem(cB);
		jogar(cB);
		
		//fazendo mochilas
		Mochila mA = new Mochila ("Kipling", "Caderno, lapis, borracha);
		
		carregarMateriais();
		retirarMateriais();
		verDentroMochila();	
	}
	
	public static class Televisao{
		int tamanho;
		String marca;
		String conteudo;
		String modelo;
		String qualidade;
	}
	
	public static class Celular{
		String processador;
		int polegadas;
		String marca;
		int armazenamento;
		String usuario;
	}
	
	public static class Mochila{
		String marca;
		int capacidade;
		String cor;
		int numero_bolsos;
		String materiais;
	}
	
	public static void ligarTelevisao(Televisao tv){
		System.out.println("\n== TELEVISAO ==\n");
		System.out.println("Ligando a tv " + tv.marca + " com capacidade " + tv.qualidade);
	}
	
	public static void assistirConteudo(Televisao tv){
		System.out.println("Ligando a tv " + tv.marca + " e assistindo " + tv.conteudo);
	}
	
	public static void desligarTelevisao(Televisao tv){
		System.out.println("Desligando a tv " + tv.marca);
	}
	
	public static void ligarPessoa(Celular c){
		System.out.println("\n== CELULAR ==\n");
		System.out.println("Fazendo ligacao com o celular " + c.marca + " do usuário " + c.usuario);
	}
	
	public static void mandarMensagem(Celular c){
		System.out.println("O usuario " + c.usuario + " esta mandando mensagem com o celular " + c.marca);
	}
	
	public static void jogar(Celular c){
		System.out.println("O usuario " + c.usuario + " esta jogando com o celular " + c.marca);
	}
	
	public static void carregarMateriais(Mochila m){
		System.out.println("\n== MOCHILA ==\n");
		System.out.println("A mochila " + m.marca + " esta carregando os seguintes materiais " + m.materiais);
	}
	
	public static void retirarMateriais(Mochila m){
		System.out.println("Esta sendo retirado da mochila " + m.marca + " os seguintes materiais " + m.materiais);
	}
	
	public static void verDentroMochila(Mochila m){
		System.out.println("dentro da mochila " + m.marca + " esta vazio);
	}
}