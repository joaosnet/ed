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
        
        this.Data[n] = obj;
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
        
}
