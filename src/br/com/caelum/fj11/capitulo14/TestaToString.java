package br.com.caelum.fj11.capitulo14;

public class TestaToString {

	public static void main(String[] args) {
		contaSemToStringImplementado();
		
		contaComToStringImplementado();
	}

	private static void contaSemToStringImplementado() {
		//Apesar da conta não ter o toString() em sua classe, este é herdado da classe Object
		ContaSemToString contaSemToString = new ContaSemToString();
		System.out.println(contaSemToString.toString());
		
		//Poderíamos usar o toString() sem uma chamada explícita. Caso a classe não implemente, será impresso o NomeDaClasse@codigo
		System.out.println(contaSemToString);
	}
	
	private static void contaComToStringImplementado() {
		//Agora a classe Conta implementa o método toString()
		ContaNormal conta = new ContaNormal();
		conta.setNumero(12345);
		
		System.out.println(conta);
		
		//Caso tenhamos uma string sendo concatenada o Java chama o toString() concatenando os dois
		System.out.println(conta + " concatenado");
	}
	
}
