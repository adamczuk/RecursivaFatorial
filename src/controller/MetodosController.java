package controller;

public class MetodosController {

	public MetodosController() {
		super();
	}
	
	public int calculaFatorial (int valor) {
		if (valor == 0) {
			//condição de parada: o cálculo para e retorna 1 quando chegar em fatorial de 0
			return 1;
		}
		else {
			//a função chama a si mesma, multiplicando o valor atual pelo fatorial do anterior imediato, até 0
			
			//EXEMPLO: para fatorial de 5, o método abaixo multiplica 5 pelo fatorial de 4, 
			//que vai fazer o mesmo várias vezes, até chegar em fatorial de 0, que retorna 1
			return valor * calculaFatorial (--valor);
		}
	}

}
