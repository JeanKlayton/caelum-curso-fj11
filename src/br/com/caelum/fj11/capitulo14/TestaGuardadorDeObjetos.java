package br.com.caelum.fj11.capitulo14;

public class TestaGuardadorDeObjetos {

	public static void main(String[] args) {
		GuardadorDeObjetos guardadorDeObjetos = new GuardadorDeObjetos();
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Alexandre Gama");
		//Podemos adicionar qualquer objeto, já que o método espera receber um objeto
		guardadorDeObjetos.adiciona(funcionario); 
		
		//Obrigatoriamente precisamos fazer o Cast aqui. Caso façamos o Cast para o tipo errado, um lindo ClassCastException aparecerá
		Funcionario objetoDevoldido = (Funcionario) guardadorDeObjetos.pegaObjetoDaPosicao(0);
		
		//Podemos chamar normalmente o getNome() pois garantimos ao compilador que o Objeto retornado é um Funcionário
		System.out.println(objetoDevoldido.getNome());
	}
}
