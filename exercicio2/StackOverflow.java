package exercicio2;
//exercicio 2

public class StackOverflow {
	public static void main (String[] args){
		//chamando a recursiva
		RecursivaInfinita(1);
	}
	//criando o overflow
	public static int recursivaInfinita(int valor){
		//criando um loop
		return valor + RecursivaInfinita(valor);
	}
}