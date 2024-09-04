package exercicio4;

public class InicializacaoVariaveis{
	public static void main (String[] args){
		criandoEmpresa();
		criandoCarroMultado();
		criandoNumeroOuro();
		criandoSala();
		criandoArmario();
	}
	
	public static class Empresa{
		String nomeEmpresa;
		int totalSalarios;
		int diasFaturamento = 20;
	}
	
	private static class CarroMultado{
		String placa;
		String chassi;
		String modelo;
		int ano;
		String cor;
		String nomeDono;
	}
	
	private static class Armario{
		int paresTenis;
	}
	
	public static void criandoEmpresa(){
		Empresa empresa = new Empresa();
		empresa.nomeEmpresa = "Empresa Multinacional";
		empresa.totalSalarios = 1123897;
		System.out.println("\nDados da empresa --> Nome:: " + empresa.nomeEmpresa + ", Total de salários pagos:: " + empresa.totalSalarios + ", Dias de faturamento:: " + empresa.diasFaturamento);
	}
	
	public static void criandoCarroMultado(){
		CarroMultado cm = new CarroMultado();
		cm.placa = "ABC123";
		cm.chassi = "12398712398712398";
		cm.modelo = "Sedan";
		cm.ano = 2011;
		cm.cor = "prata";
		cm.nomeDono = "Joao";
		System.out.println("\nDados do carro multado --> Placa:: " + cm.placa + ", Chassi:: " + cm.chassi + ", Modelo:: " + cm.modelo + ", Ano:: " + cm.ano);
	}
	
	public static void criandoSala(){
		String[] alunos = {"Goku", "Vegeta", "Piccolo", "Gohan", "Goten", "Trunks", "Kuririn", "Videl", "Majin Boo", "Freeza"};
		int [] notas = {4, 6, 7, 10};
		System.out.println("\nNomes dos alunos::");
		for (int i = 0; i < alunos.length; i++){
			System.out.println(alunos[i]);
		}
		System.out.println("\nNotas do aluno::");
		for (int i = 0; i < notas.length; i++){
			System.out.println("Bimestre " + (i + 1) + " = " + notas[i]);
		}
	}
	
	public static void criandoArmario(){
		Armario arm = new Armario();
		arm.paresTenis = 10;
		System.out.println("\nExistem " + arm.paresTenis + " pares de tênis\n");
	}
	
	private static void criandoNumeroOuro(){
		//criar o valor do numero de ouro
		double valor = (1 + Math.sqrt(5)) / 2;
		System.out.println("\nNúmero de ouro da matemática:: " + valor);
	
		
	}
}
