import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[100];
        BinaryHeap heap = new BinaryHeap(0);
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        boolean flag = false;
        int result = 0;
        
        while (!flag)
        {
            System.out.println("Enter option 1, 2 or 3 for:" + 
                            "\n1.) Report on 20 sets of 100 random integers" +
                            "\n2.) Print first 10 values" + 
                            "\n3.) Exit");
            result = 0;
            try
            {
                System.out.println("ENTERING THE TRY BLOCK");
                result = kb.nextInt();
                System.out.println(result);
                if (result == 1)
                {
                    double total, totalOp;
                    total = totalOp = 0;

                    for (int p = 0; p < 20; p++)
                    {
                        heap = new BinaryHeap(0);
                        for (int k = 0; k < 100; k++)
                            a[k] = r.nextInt(500 -1) + 1;

                        for (int i = 0; i < 100; i++)
                            heap.addNode(a[i]);
                        total += heap.getSwaps();
                        System.out.println(p);
                    //System.out.println("number of swaps for insertion: " + heap.getSwaps());

                        BinaryHeap heap2 = new BinaryHeap(a);
                        totalOp += heap2.getSwaps();
                    //System.out.println("number of swaps for optimal: "+ heap2.getSwaps());
                    }

                    System.out.println("Average swaps for insertions: " + total/20);
                    System.out.println("Average swaps for optimal method: " + totalOp/20);
                }   
                else if (result == 2)
                {

                } 
                else if (result == 3)
                    flag = true;
                else
                    continue;
            }
            catch (InputMismatchException e) {
                System.out.println("CAUGHT EXCEPTION");
                kb.nextLine();
            }
        }

        
    }
}