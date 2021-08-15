package controller;

public class MetodosController {

	public MetodosController() {
		super();
	}
	
	public int calculaFatorial (int valor) {
		if (valor == 0) {
			//condi��o de parada: o c�lculo para e retorna 1 quando chegar em fatorial de 0
			return 1;
		}
		else {
			//a fun��o chama a si mesma, multiplicando o valor atual pelo fatorial do anterior imediato, at� 0
			
			//EXEMPLO: para fatorial de 5, o m�todo abaixo multiplica 5 pelo fatorial de 4, 
			//que vai fazer o mesmo v�rias vezes, at� chegar em fatorial de 0, que retorna 1
			return valor * calculaFatorial (--valor);
		}
	}

}
