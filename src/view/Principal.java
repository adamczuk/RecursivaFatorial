package view;

import javax.swing.JOptionPane;

import controller.MetodosController;

public class Principal {

	public static void main(String[] args) {
		int valor = -1;
		int fatorial = 0;		
		MetodosController metodos = new MetodosController();
		
		do {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Inserir um valor entre 0 e 12 para obter seu fatorial"));
		} while (valor < 0 || valor > 12);
		
		fatorial = metodos.calculaFatorial(valor);
		
		JOptionPane.showMessageDialog(null, "O fatorial de "+valor+ " é ==> "+fatorial);
	}

}
