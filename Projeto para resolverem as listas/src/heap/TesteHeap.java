package heap;

public class TesteHeap {
    public static void main(String[] args) throws Exception {
        /*MaxHeap h = new MaxHeap(10);
        try {
            h.Insert(10);
            h.Insert(20);
            h.Insert(40);
            h.Insert(15);
            h.Insert(25);
            h.Insert(50);
            h.Imprime();
            System.out.println(h.ExtractMax());
            System.out.println(h.ExtractMax());
            h.Imprime();
        } catch (Exception e) {
            System.out.println(e);
        }*/
        /* Questão 7
        MaxHeap H = new MaxHeap(10);
        try {
            H.Insert(18);
            H.Insert(12);
            H.Insert(14);
            System.out.print(H.ExtractMax());
            System.out.print(H.ExtractMax());
            H.Insert(15);
            System.out.print(H.ExtractMax());
            H.Insert(10);
            System.out.print(H.ExtractMax());
            System.out.print(H.ExtractMax());
        } catch (Exception e) {
            System.out.println(e);
        }*/
        MinHeap mH = new MinHeap(10);
        try{
            mH.Insert(10);
            mH.Insert(20);
            mH.Insert(40);
            mH.Insert(15);
            mH.Insert(25);
            mH.Insert(50);
            mH.Imprime();
            System.out.println(mH.ExtractMin());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

