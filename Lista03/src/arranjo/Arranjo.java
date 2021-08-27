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
    O dado é parâmetro do método. (João)
    */
    public void insertFirst(T obj){
        int n = 0;
        for (int i=0;i<this.Data.length;i++){
            n=i;
        }
    }
}
