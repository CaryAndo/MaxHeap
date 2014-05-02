public class BinaryHeap {
    private int[] array;
    private int size = 101;
    private int root = 0;

    public BinaryHeap(int[] passed) {
        array = new int[2*passed.length];

        for (int i = 0; i < passed.length; i++)
            array[i] = passed[i];
    }

    public BinaryHeap(int root) {
        array = new int[size];
        array[1] = root;
        for (int i = 2; i < size; i++)
            array[i] = null;
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void heapify() {
        for (int k = 0; k < array.length/2; k++)
        {
            if (array[k] < array[k*2] && array[k] < array[(k*2)+1])
            {
                // TODO
            }
            else if (array[k] < array[k*2] || array[k] < array[(k*2)+1])
            {
                if (array[k] < array[k*2])
                {
                    swap(k, k*2);
                    continue;
                }
                else if (array[k])

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


}