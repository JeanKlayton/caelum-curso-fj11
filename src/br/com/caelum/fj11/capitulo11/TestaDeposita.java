package br.com.caelum.fj11.capitulo11;

public class TestaDeposita {

	public static void main(String[] args) {
		Conta conta = new ContaPoupanca();
		try {
			conta.deposita(-100);
		} catch (ValorInvalidoException e) { //Neste caso a Exception eh unchecked e nao somos obrigados a tratar
			System.out.println(e.getMessage());
		}
	}
}
