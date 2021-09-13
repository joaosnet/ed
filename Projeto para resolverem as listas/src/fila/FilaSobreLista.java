package fila;

import lista.Elemento;
import lista.ListaDuplaCauda;

public class FilaSobreLista<T>{
    ListaDuplaCauda ListaDuplaCauda = new ListaDuplaCauda();
    /*
    5 - Implemente a classe FilaSobreLista. Esta é uma reimplementação da classe 
    Fila (disponível em nosso repositório) utilizando um objeto da classe 
    ListaDuplaCauda para armazenar os elementos da Lista. 
    Implemente os métodos Enqueue(Elemento<T> e), Dequeue(), QueueFull() 
    e QueueEmpty(). Procure utilizar chamadas aos métodos da classe 
    ListaDuplaCauda nos métodos que você criar. (João)
    */
    public boolean QueueEmpty() {
       return ListaDuplaCauda.vazia();
    }

    public boolean QueueFull() {
        if (!ListaDuplaCauda.vazia()) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(Elemento<T> e) throws Exception {
        ListaDuplaCauda.insereInicio(0, e);
    }

    public Elemento Dequeue() throws Exception {
        return ListaDuplaCauda.getFim();
    }
}
