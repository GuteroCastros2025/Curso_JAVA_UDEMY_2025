package Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		
		JButton botao = new JButton("Clicar");
		janela.add(botao);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); // centralizar na tela
		
		janela.setVisible(true);
		janela.add(botao);
		
		botao.addActionListener(e ->  {
		
				System.out.println("Evento ocorreu !!!!");
			});
				
		janela.setVisible(true);
				
	}
}