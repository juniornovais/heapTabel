public class App {
    public static void main(String[] args) {

        Heap heap = new Heap(15);

        // Inserindo valores
        heap.inserir(10);
        heap.inserir(5);
        heap.inserir(20);
        heap.inserir(2);
        heap.inserir(15);
        heap.inserir(30);
        heap.inserir(25);

        System.out.println("Heap por níveis:");
        heap.imprimir();

        // Testando remoção
        System.out.println("\nRemovendo raiz...");
        int removido = heap.remover();
        System.out.println("Valor removido: " + removido);

        System.out.println("\nHeap após remoção:");
        heap.imprimir();
    }
}