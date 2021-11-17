package realization_heap;

public class Main {
    public static void main(String[] args) {
        MyHeap heap = new MyHeap();
        heap.addNode(6);
        heap.addNode(4);
        heap.addNode(44);
        heap.addNode(5);
        heap.addNode(8);
        heap.addNode(3);
        heap.addNode(12);
        // выводим начальную пирамиду в консоль
        heap.printHeap();
    }
}
