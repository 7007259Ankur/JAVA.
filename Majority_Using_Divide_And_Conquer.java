import java.util.Scanner;

public class Majority_Using_Divide_And_Conquer {

    public static int Majority(int arr[],int low,int high)
    {
        if(low==high)
        {
            return arr[low];
        }

        int mid=low+(high-low)/2;
        int leftMajority=Majority(arr,low,mid);
        int rightMajority=Majority(arr,mid+1,high);
        if(leftMajority==rightMajority)
        {
            return leftMajority;
        }
        int leftcount=count(arr,leftMajority,low,mid);
        int rightcount=count(arr,rightMajority,mid+1,high);


        if (leftcount > (high - low + 1) / 2) {
            return leftMajority;
        } else if (rightcount > (high - low + 1) / 2) {
            return rightMajority;
        } else {
            return -1; // No majority element
        }
    }
    public static int count(int arr[],int target,int low,int high)
    {
        int count=0;
        for(int i=low;i<=high;i++)
        {
            if(arr[i]==target)
            {
                count++;
            }
        }
        return count;
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
        System.out.println("The majority ELement is ="+Majority(arr,0,n-1));
    }



}
