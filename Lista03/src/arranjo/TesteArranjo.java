package arranjo;

import java.util.Scanner;

public class TesteArranjo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        Arranjo<String> arr1 = new Arranjo<String>(5);
        
        System.out.println("Qual o último dado a ser inserido?");
        /*
        a. Construa um método para inserir um dado na 
        última posição não ocupada do arranjo. 
        O dado é parâmetro do método. 
        */  
        arr1.insertLast(sc.nextLine());
        
        arr1.Set(0,"a");
        
        arr1.Set(1,"b");
        System.out.println(arr1.Get(1));
        
        arr1.Set(2,"c");
        
        arr1.Imprime();
        arr1.Set(3,"d");
                
        arr1.Imprime();
        
        System.out.println("Qual o dado a ser inserido na primeira posição do arranjo?");
        /*
        3. b. Construa um método para inserir um dado na primeira posição do arranjo. 
        Movimente os dados pré-existentes preservando seu conteúdo e ordem. 
        O dado é parâmetro do método.
        */
        arr1.insertFirst(sc.nextLine());
        arr1.Imprime();
        
        /*
        3. c. Construa um método para inserir um dado em uma dada posição do arranjo. 
        Preserve o conteúdo e a ordem dos dados subsequentes à posição desejada 
        quando os mover de posição. O dado e a posição desejada são parâmetros 
        do método.
        */
        arr1.add(0, "e");
        arr1.Imprime();
        
        /*
        3. d. Construa um método para remover e retornar o dado da última posição 
        ocupada do arranjo.     
        */
        System.out.println(arr1.remove());
        arr1.Imprime();

        /*
        3. e. Construa um método para remover e retornar o dado da primeira posição 
        do arranjo. Movimente os dados restantes preservando o conteúdo e a ordem 
        dos dados existentes.
        */
        System.out.println("\n==== Questão 3.e ====");
        System.out.print("Dado da Primeira Posição: ");
        System.out.println(arr1.Q3_e());
        System.out.print("Arranjo reordenado: ");
        arr1.Imprime();
        
        /*
        3. f. Construa um método para remover um dado em uma dada posição do 
        arranjo. Preserve o conteúdo e a ordem dos dados subsequentes à posição 
        desejada quando os mover de posição. A posição desejada é parâmetro do 
        método.
        */
        System.out.println("\n==== Questão 3.f ====");
        arr1.Q3_f(0);
        System.out.print("Arranjo reordenado: ");
        arr1.Imprime();

	}   
}
