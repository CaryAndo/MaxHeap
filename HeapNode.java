public class HeapNode {
    private int[] children;
    private int root = 1;
    private int current = 1; // Point at root

    public HeapNode(int[] passed) {
        children = new int[2*passed.length];

        for (int i = 0; i < passed.length; i++)
            children[i] = passed[i];
    }

    private void heapify() {
        // TODO
    } 

    public int getLeft(int position) {
        return children[2 * position];
    }

    public int getLeft() {
        return children[2 * current];
    }

    public int getRight(int position) {
        return children[2 * position + 1];
    }

    public int getRight() {
        return children[2 * current + 1];
    }


// FML
    public void addNode(int value) {
        int point = root;
        if (children[root] != null)
        {
            if (getLeft)
        }
    }



}