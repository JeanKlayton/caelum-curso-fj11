package br.com.caelum.fj11.capitulo11;

//Lembrar que esta classe extends de RuntimeException, ou seja, ela e Checked
//Caso usassemos filha de Exception, esta seria unchecked, sendo o metodo obrigado a fazer o tratamento
public class ValorInvalidoException extends RuntimeException {

	private static final long serialVersionUID = -8395707727072135712L;

	//Por padrao nao herdamos o construtor quando fazemos heranca mas podemos chamar super()
	public ValorInvalidoException(double valor) {
		super("Valor invalido encontrado: " + valor);
	}
}
