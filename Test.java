public class Test {
    public static void main(String[] args) {
        int[] a = new int[5];
        BinaryHeap heap = new BinaryHeap(12);
        heap.addNode(13);
        heap.addNode(16);
        heap.addNode(25);
        heap.addNode(1);
        heap.print();
    }
}