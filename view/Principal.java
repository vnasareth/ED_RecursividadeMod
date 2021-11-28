package view;

import javax.swing.JOptionPane;

import Controller.DivisaoController;

public class Principal {

	public static void main(String[] args) {
		
		DivisaoController dc = new DivisaoController();
		
		int dividendo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero desejado de 0 ate 999999: "));
		int divisor = 20;
		int resultado = 0 ;
		int resto = 5 ;
		int incremento = 0;
		
		int div = dc.div(dividendo,divisor,resultado,resto,incremento);
		System.out.println(div);		
		JOptionPane.showMessageDialog(null, div);
		
	}

}
