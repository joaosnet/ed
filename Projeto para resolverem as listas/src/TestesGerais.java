
import java.util.Stack;
import pilha.Pilha;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author joaod
 */
public class TestesGerais {

    public static void main(String[] args) throws Exception{
        /*Questão 5 Lista 04
        int n;
        n=50;
        Stack s = new Stack();
        while (n > 0) {
            s.push(n % 2);
            n = n / 2;
        }while (!s.isEmpty())
            System.out.print(s.pop());

        System.out.print("\n");*/
        //Questão 6 Lista 04
        Pilha p1 = new Pilha(5);// enqueue
        Pilha p2 = new Pilha(5);// dequeue
        p1.Push(1);
        p1.Push(2);
        p1.Push(3);
        p1.Push(4);
        p1.Push(5);
        p2.Push(p1.Pop());
        p2.Push(p1.Pop());
        p2.Push(p1.Pop());
        p2.Push(p1.Pop());
        p2.Push(p1.Pop());
        for (int i=0; i < 5; i++) {
            System.out.println(p2.Pop());
    }
    }   
}
