public class Heap {
    private int vetor[];
    private int n;

    public Heap(int tamanho) {
        this.vetor = new int[tamanho];
        this.n = 0;
    }

    public void inserir(int element) {
        this.vetor[this.n] = element;
        subir(n);
        this.n++;
    }

    public void subir(int filho) {
        if (filho > 0) {
            int pai = (filho - 1) / 2;
            if (this.vetor[filho] > this.vetor[pai]) {
                int aux = this.vetor[pai];
                this.vetor[pai] = this.vetor[filho];
                this.vetor[filho] = aux;

                subir(pai);
            }
        }
    }

    public void imprimir() {
        int nivel = 0;
        int elements = 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
            count++;

            if (count == elements) {
                System.out.println();
                nivel++;
                elements *= 2;
                count = 0;
            }
        }
    }

    public int remover() {
        int removed = this.vetor[0];
        this.vetor[0] = this.vetor[n -1];
        n--; 
        descer(0);

        return removed;
    }

    public void descer(int pai) {
        int filhoEsq = pai * 2 + 1;
        int filhoDir = pai * 2 + 2;
        int maior = pai;

        if (filhoEsq < n && vetor[filhoEsq] > vetor[maior]) {
            maior = filhoEsq;
        }
        if(filhoDir < n && vetor[filhoDir] > vetor[maior]) {
            maior = filhoDir;
        }
        if (maior !=pai) {
            int aux = vetor[pai];
            vetor[pai] = vetor[maior];
            vetor[maior] = aux;

            descer(maior);
        }
    }
} 
