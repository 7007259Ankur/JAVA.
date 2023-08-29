import java.util.Scanner;

public class peakEle {

    public static int peak(int arr[],int low,int high,int n)
    {
        int mid=low+(high-low)/2;

        if((mid==0||arr[mid-1] <=arr[mid])&& (mid==n-1||arr[mid+1]<=arr[mid]))
        {
            return mid;
        }
        else if(mid>0&&(arr[mid-1]>arr[mid]))
        {
            return peak(arr,low,mid-1,n);
        }
        else {
            return peak(arr,mid+1,high,n);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The peak element is "+arr[peak(arr,0,n-1,n)]+" And "+" Index is "+peak(arr,0,n-1,n));

    }
}
