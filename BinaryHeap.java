public class BinaryHeap {
    private int[] array;
    private static final int DEFAULT_SIZE = 100; // default size
    private int totalSwaps = 0;

    // Init given an unsorted array (optimal method)
    public BinaryHeap(int[] passed) {
        array = new int[passed.length];

        for (int i = 0; i < passed.length; i++)
            array[i] = passed[i];
        heapifyDown();
    }

    // Init givin root node
    public BinaryHeap(int root) {
        array = new int[DEFAULT_SIZE];
        array[0] = root;
    }

    // Getter for analyzing complexity
    public int getSwaps() {
        return totalSwaps;
    }

    // Swap the values at two indices 
    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        totalSwaps += 1;
    }

    // Return the index that holds the greater value
    private int max(int i, int j) {
        if (array[i] > array[j])
            return i;
        else if (array[j] > array[i])
            return j;
        else
            return i;
    }

    // Value of parent (For readability)
    private int parent(int i) {
        return array[(i - 1) / 2];
    }

    // Value of left child (For readability)
    private int left(int i) {
        return array[(2 * i) + 1];
    }

    // Value of right child (For readability)
    private int right(int i) {
        return array[(2 * i) + 2];
    }

    // Value at index (For readability)
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
                if (value(i) > parent(i))
                {
                    swap(i, (i-1)/2); // swap(i, parent)
                    i = array.length - 1;
                }
            }
        }
    }

    // Sift down
    private void heapifyDown() {
        for (int i = 0; i < array.length; i++)
        {
            if ((i*2)+1 > array.length - 1)
                break;
            else
            {
                if (!((i*2)+2 > array.length - 1))
                {
                    if (value(i) < left(i) && value(i) < right(i))
                    {
                        swap(i, max(((2*i)+1), ((2*i)+2))); // swap(i, max(left, right))
                        i = 0;
                    }
                    else if (value(i) < right(i))
                    {
                        swap(i, (2*i)+2); // swap(i, right)
                        i = 0;
                    }
                }
                if (value(i) < left(i))
                {
                    swap(i, (2*i)+1); // swap(i, left)
                    i = 0;
                }
                
            }
        }
    }

    // Print the array for debugging
    public void print() {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    // Add a new node
    public void addNode(int value) {
        for (int j = 0; j < array.length; j++)
        {
            if (array[j] == 0)
            {
                array[j] = value;
                break;
            }
            else 
                continue;
        }
        heapifyUp();
    } 

    // Remove the root
    public void removeRoot() {
        array[0] = 0;
        heapifyDown();
    }
}