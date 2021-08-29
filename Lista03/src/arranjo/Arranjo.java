package arranjo;

public class Arranjo<T> {

    private T[] Data;
    @SuppressWarnings("unchecked")
    public Arranjo(int tam) {
        this.Data = (T[]) new Object[tam];
    }

    public T Get(int i) {
        return this.Data[i];
    }

    public void Set(int i, T obj) {
        this.Data[i] = obj;
    }

    public void Imprime() {
        System.out.print("[");
        for (int i=0; i < this.Data.length; i++) {
            System.out.print(this.Data[i]+" ");
        }
        System.out.println("]");
    }
    /*
    3. a. Construa um método para inserir um dado na 
    última posição não ocupada do arranjo. 
    O dado é parâmetro do método. 
    */
    public void insertLast(T obj){
        int n = 0;
        for (int i=0;i<this.Data.length;i++){
            n=i;
        }
        if(this.Data[n]==null){
            this.Data[n] = obj;
        }
        
    }
    /*
    3. b. Construa um método para inserir um dado na primeira posição do arranjo. 
    Movimente os dados pré-existentes preservando seu conteúdo e ordem. 
    O dado é parâmetro do método.
    */
    public void insertFirst(T obj){
        int n = 0;
        // aqui pega o número de elementos
        for (int i=0;i<this.Data.length;i++){
            n=i;
        }
        // aqui adiciona cada elemento
        for (int i=n-1;i>-1;i--){
            
                   if(this.Data[i]==null){
                       
                   }else{
                       this.Data[i+1] = this.Data[i];
                   }
                        
        } 
        this.Data[0] = obj;
    }
    
    /*   
    3. c. Construa um método para inserir um dado em uma dada posição do arranjo. 
    Preserve o conteúdo e a ordem dos dados subsequentes à posição desejada 
    quando os mover de posição. O dado e a posição desejada são parâmetros 
    do método.
    */
    public void add(int pos, T obj) {
    	T data1 = Data[pos];	//recebe o dado que esta na posição a ser ocupada.
    	T data2;				//variável auxiliar.
    	this.Data[pos] = obj;
    	//Laço que muda a posição dos dados subsequentes.
    	for (int i = pos+1 ; i< this.Data.length; i++) {
    		data2 = Data[i];
    		this.Data[i] = data1;
    		data1 = data2;
    	}
    }
    
    /*
    3. d. Construa um método para remover e retornar o dado da última posição 
    ocupada do arranjo.     
    */
    public T remove(){
    	T data = Data[Data.length-1];
    	this.Data[Data.length-1] = null;
        return data;
    }

    /*
    3. e. Construa um método para remover e retornar o dado da primeira posição 
    do arranjo. Movimente os dados restantes preservando o conteúdo e a ordem 
    dos dados existentes.
    */
    public T Q3_e(){
    	T Pos0 = this.Data[0];
    	this.Data[0] = null;
        
        for (int i = 0; i < (this.Data.length - 1); i++){
            if (this.Data[i] == null){
                this.Data[i] = this.Data[i+1];
                this.Data[i+1] = null;
            }
        }
        
        return Pos0;
    }
    
    /*
    3. f. Construa um método para remover um dado em uma dada posição do 
    arranjo. Preserve o conteúdo e a ordem dos dados subsequentes à posição 
    desejada quando os mover de posição. A posição desejada é parâmetro do 
    método.
    */
    public void Q3_f (int pos){
        System.out.format("Remover dado da posição: [%d]\n", pos);
        this.Data[pos] = null;
        
        for (int i = pos; i < (this.Data.length - 1); i++){
            if (this.Data[i] == null){
                this.Data[i] = this.Data[i+1];
                this.Data[i+1] = null;
            }
        }
    }
}
