import java.security.spec.RSAOtherPrimeInfo;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Kth_smallest_Elements {

    public static int KthMAxHeap(int []arr,int k)
    {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        System.out.println("Enter the Elements:");
        for(int i=0;i<arr.length;i++)
        {
            maxheap.add(arr[i]);
            if(maxheap.size()>k)
            {
                maxheap.remove();
            }
        }

        return maxheap.peek();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the kth smallest elements you want to find then enter the K:");
        int k=sc.nextInt();
        System.out.println("The kth smallest is :"+KthMAxHeap(arr,k));
    }
}
