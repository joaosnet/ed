package heap;

public class MinHeap {
    
    private int size;
    private int maxSize;
    private int H[];

    public MinHeap(int max) {
        this.maxSize = max;
        this.size = 0;

        H = new int[max + 1];
	H[0] = Integer.MIN_VALUE;
    }

    public int Parent(int i) {
        return i/2;
    }

    public int LeftChild(int i) {
        return 2*i + 1; //2i para arranjo começando em 1
    }

    public int RightChild(int i) {
        return 2*i + 2; //2i+2 para arranjo começando em 1
    }
    
    public void Swap(int i, int j) {
        int tmp = H[i];
        H[i] = H[j];
        H[j] = tmp;
    }

    public void ChangeUp(int i) {
        if (i>0 && H[i]<H[Parent(i)]) {
            Swap(i,Parent(i));
            ChangeUp(Parent(i));
        }
    }

    public void ChangeDown(int i) {
        int maxIndex = i;
        int l = LeftChild(i);
        if (l <= size-1 && H[l] > H[maxIndex]) {
            maxIndex = l;
        }
        int r = RightChild(i);
        if (r <= size-1 && H[r] > H[maxIndex]) {
            maxIndex = r;
        }
        if (i != maxIndex) {
            Swap(i,maxIndex);
            ChangeDown(maxIndex);
        }
    }

    public int getMin() {
        if (size > 0) {
            return H[0];
        } else {
            return -1;
        }
    }    

    public void Insert (int p) throws Exception {
        if (size == maxSize) {
            throw new Exception("heap cheia");
        }
        H[size++] = p;
        
        ChangeUp(size-1);
    }

    public int ExtractMin() {
        int result = H[0];
        H[0] = H[size-1];
        size = size - 1;
        ChangeDown(0);
        return result;
    }

    public void Remove (int i) {
        H[i] = Integer.MIN_VALUE;
        ChangeUp(i);
        ExtractMin();
    }

    public void ChangeValue(int i, int p) {
        int oldp = H[i];
        H[i] = p;
        if (p > oldp) {
            ChangeUp(i);
        } else {
            ChangeDown(i);
        }
    }

    public void Imprime() {
        System.out.print("[");
        for (int i=0; i <= size; i++) {
            System.out.print(this.H[i]+" ");
        }
        System.out.println("]");
    }

}
