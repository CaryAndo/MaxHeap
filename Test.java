public class Test {
    public static void main(String[] args) {
        int[] a = new int[5];
        BinaryHeap heap = new BinaryHeap(12);
        heap.addNode(13);
        heap.addNode(16);
        heap.addNode(25);
        heap.addNode(1);
        heap.addNode(9);
        heap.addNode(4);
        heap.addNode(2);
        heap.addNode(6);
        heap.addNode(200);
        heap.addNode(65);
        heap.addNode(8);
        heap.addNode(92);
        heap.addNode(19);
        System.out.println("Original: ");
        heap.print();
        heap.removeRoot();
        System.out.println("End Product: ");
        heap.print();

    }
}