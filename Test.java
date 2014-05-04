import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[100];
        BinaryHeap heap = new BinaryHeap(0);
        BinaryHeap heap2;
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        boolean flag = false;
        int result = 0;
        
        while (!flag)
        {
            System.out.println("\nEnter option 1, 2 or 3 for:" + 
                            "\n1.) Report on 20 sets of 100 random integers" +
                            "\n2.) Print first 10 values, stats, remove 10, first 10" + 
                            "\n3.) Exit");
            result = 0;
            a = new int[100];
            try
            {
                result = kb.nextInt();
                if (result == 1)
                {
                    double total, totalOp;
                    total = totalOp = 0;

                    for (int p = 0; p < 20; p++)
                    {
                        heap = new BinaryHeap(0);

                        while (!heap.isFull())
                        {
                            int temp = r.nextInt(1000 -1) + 1;
                            // This is so we don't add duplicates
                            if (!heap.contains(temp))
                            {
                                heap.addNode(temp);
                                // append temp to a
                                for (int k = 0; k < 100; k++)
                                {
                                    if (a[k] == 0)
                                    {
                                        a[k] = temp;
                                        break;
                                    }
                                }       
                            }
                        }
                        total += heap.getSwaps();
                        //System.out.println("number of swaps for insertion: " + heap.getSwaps());

                        heap2 = new BinaryHeap(a);
                        totalOp += heap2.getSwaps();
                        //System.out.println("number of swaps for optimal: "+ heap2.getSwaps());
                    }

                    System.out.println("Average swaps for insertions: " + total/20);
                    System.out.println("Average swaps for optimal method: " + totalOp/20);
                }   
                else if (result == 2)
                {
                    heap = new BinaryHeap(0);

                    while (!heap.isFull())
                    {
                        int temp = r.nextInt(1000 - 1) + 1;
                        if (!heap.contains(temp))
                        {
                            heap.addNode(temp);

                            for (int t = 0; t < 100; t++)
                            {
                                if (a[t] == 0)
                                {
                                    a[t] = temp;
                                    break;
                                }
                            }
                        }
                    }

                    System.out.print("\nBuilding heap with: ");

                    for (int z = 0; z < 10; z++)
                    {
                        System.out.print(a[z] + " ");
                    }

                    System.out.println("... etc. \nSwaps for insertions: " + heap.getSwaps());

                    heap2 = new BinaryHeap(a);
                    System.out.println("Swaps for optimal method: " + heap2.getSwaps());
                    System.out.println("Now performing 10 removals: ");
                    
                    for (int c = 0; c < 10; c++)
                    {
                        heap.removeRoot();
                        heap2.removeRoot();
                    }

                    System.out.println("Now our heap looks like: ");
                    heap.printXDigits(10);
                    heap2.printXDigits(10);

                } 
                else if (result == 3)
                    flag = true;
                else
                    continue;
            }
            catch (InputMismatchException e) {
                kb.nextLine(); // clear kb
            }
        }
    }
}