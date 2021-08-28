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
	}   
}
