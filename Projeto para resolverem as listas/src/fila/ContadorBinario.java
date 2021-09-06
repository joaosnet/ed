package fila;

import java.util.LinkedList;
import java.util.Queue;

public class ContadorBinario {
	Queue<String> count;
	
	public ContadorBinario(){
		this.count = new LinkedList<String>();
	}
	
	//Método em que o usuário define até que número será contado
	public void ContaBin(int n) {
		for(int i=1; i<=n; i++) {
			this.count.add(Integer.toString(i,2));
		}
	}
	
	//Percorre e exibe toda a fila
	public void Imprime() {
		for(String bin:count) {
			System.out.println(bin);
		}
	}	
}
