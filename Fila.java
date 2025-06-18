package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// offer e add adicionam elementos na fila
		//diferença é o comportamento ocorre quando a fila estiver cheia
		fila.add("Ana"); // retorna false
		fila.offer("Bia");// lança excecão
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e element  -> obter o proximo elementos 
		//da fila (sem remover)
		
		//Diferenca é o comportamento ocorre
		//quando a fila esta vazia		
		System.out.println(fila.peek());// retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element());// retorna uma exceção
		System.out.println(fila.element());
		
		//Poll e Remove -> obter o proximo elemento
		// da fila e remove
		
		//Diferença é o comportamento ocorre 
		//quando a fila está vazia
		
		System.out.println(fila.poll());//retorna null
		System.out.println(fila.remove());//lança exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());// lança exceção
		
		//fila.clear()
		//fila size()
		//fila.isEmpty()
		//fila.contains()
	}
}