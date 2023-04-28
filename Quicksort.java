import java.util.*;
class Quicksort
{
   
    
        int partition(int[] arr,int low,int high)
        {
            
            int pivot=arr[(low+high)/2];
            
            while(low <= high)
            {
                while(arr[low]<pivot)
                {
                    low++;
                }
                while(arr[high]>pivot)
                {
                    high--;
                }
                if(low<=high)
                {
                    int temp=arr[low];
                    arr[low]=arr[high];
                    arr[high]=temp;
                    
                    low++;
                    high--;
                }
            }
            return low;
        }
        void quickSortRecursion(int[] arr,int low,int high)
        {
            int pi = partition(arr,low,high);
            if(low<pi-1)
            {
                quickSortRecursion(arr,low,pi-1);
            }if(pi<high)
            {
                quickSortRecursion(arr,pi,high);
            }
        }
        void printArray(int[] arr)
        {
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
        }
    
}
class main
{
    public static void main(String args[])
    {
        int[] arr = {34,21,54,28,90,2};
        int length = arr.length;
        Quicksort qsm = new Quicksort();
        qsm.quickSortRecursion(arr,0,length-1);
        qsm.printArray(arr);
    }
}