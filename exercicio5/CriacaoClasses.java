package exercicio5;

public class CriacaoClasses{
	public static void main (String[] args){
		ligarTelevisao();
		assistirConteudo();
		desligarTelevisao();
		
		ligarPessoa();
		mandarMensagem();
		jogar();
	
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
	
	public static void ligarTelevisao(){
		Televisao tv = new Televisao();
		tv.marca = "lg";
		tv.qualidade = "4k";
		System.out.println("\n== TELEVISAO ==\n");
		System.out.println("Ligando a tv " + tv.marca + " com capacidade " + tv.qualidade);
	}
	
	public static void assistirConteudo(){
		Televisao tv = new Televisao();
		tv.marca = "lg";
		tv.conteudo = "desenho";
		System.out.println("Ligando a tv " + tv.marca + " e assistindo " + tv.conteudo);
	}
	
	public static void desligarTelevisao(){
		Televisao tv = new Televisao();
		tv.marca = "lg";
		System.out.println("Desligando a tv " + tv.marca);
	}
	
	public static void ligarPessoa(){
		Celular c = new Celular();
		c.marca = "samsung";
		c.usuario = "joao";
		System.out.println("\n== CELULAR ==\n");
		System.out.println("Fazendo ligacao com o celular " + c.marca + " do usuário " + c.usuario);
	}
	
	public static void mandarMensagem(){
		Celular c = new Celular();
		c.marca = "samsung";
		c.usuario = "joao";
		System.out.println("O usuario " + c.usuario + " esta mandando mensagem com o celular " + c.marca);
	}
	
	public static void jogar(){
		Celular c = new Celular();
		c.marca = "samsung";
		c.usuario = "joao";
		System.out.println("O usuario " + c.usuario + " esta jogando com o celular " + c.marca);
	}
	
	public static void carregarMateriais(){
		Mochila m = new Mochila();
		m.marca = "kipling";
		m.materiais = "caderno, estojo, garrafa";
		System.out.println("\n== MOCHILA ==\n");
		System.out.println("A mochila " + m.marca + " esta carregando os seguintes materiais " + m.materiais);
	}
	
	public static void retirarMateriais(){
		Mochila m = new Mochila();
		m.marca = "kipling";
		m.materiais = "caderno";
		System.out.println("Esta sendo retirado da mochila " + m.marca + " os seguintes materiais " + m.materiais);
	}
	
	public static void verDentroMochila(){
		Mochila m = new Mochila();
		m.marca = "kipling";
		m.materiais = "estojo, garrafa";
		System.out.println("dentro da mochila " + m.marca + " esta os seguintes materiais " + m.materiais);
	}
}