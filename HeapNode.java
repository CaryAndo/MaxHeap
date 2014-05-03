public class BinaryHeap {
    private int[] array;
    private static final int DEFAULT_SIZE = 101; // default size
    private int root = 0;

    public BinaryHeap(int[] passed) {
        array = new int[2*passed.length];

        for (int i = 0; i < passed.length; i++)
            array[i] = passed[i];
    }

    public BinaryHeap(int root) {
        array = new int[DEFAULT_SIZE];
        array[1] = root;
        for (int i = 2; i < DEFAULT_SIZE; i++)
            array[i] = null;
    }

    // swap the values at two indices 
    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // return the index that holds the greater values
    private int max(int i, int j) {
        if (array[i] > array[j])
            return i;
        else if (array[j] > array[i])
            return j;
        else
            return i;
    }

    // value of parent
    private int parent(int i) {
        return array[(i - 1) / 2];
    }

    // value of left child
    private int left(int i) {
        return array[(2 * i) + 1];
    }

    // value of right child
    private int right(int i) {
        return array[(2 * i) + 2];
    }

    // value at index
    private int value(int i) {
        return array[i];
    }

    // Sift up
    private void heapifyUp() {
        for (int i = (array.length - 1); i >= 0; i--)
        {
            if (value(i) == 0)
                continue;
            else
            {
                
            }
        }
    }

    // Sift down
    private void heapifyDown() {
        int p, k = 0;
        for (int i = 0; i < array.length; i++)
        {
            if ((i*2)+1 > array.length)
                break;
            else
            {
                if (value(i) < left(i) && value(i) < right(i))
                {
                    swap(i, max(((2*i)+1), ((2*i)+2)); // swap(i, max(left, right))
                    i = 0;
                }
                else if (value(i) < left(i))
                {
                    swap(i, (2*i)+1); // swap(i, left)
                    i = 0;
                }
                else if (value(i) < right(i))
                {
                    swap(i, (2*i)+2); // swap(i, right)
                    i = 0;
                }
            }
        }
    }

    public void addNode(int value) {
        for (int j = 1; j < array.length; j++)
        {
            if (array[j] == null)
            {
                array[j] = value;
                break;
            }
            else 
                continue;
        }
        heapify();
    }

    public void removeRoot() {

    }


}