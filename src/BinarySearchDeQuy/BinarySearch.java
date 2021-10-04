package BinarySearchDeQuy;

public class BinarySearch {
    public static int binarySearch(int[]arr,int low, int high, int value){
        if(high>=low){
            int mid = low+(high-low)/2;
            if(arr[mid]==value)
                return mid;
            if(arr[mid]>value)
                return binarySearch(arr,low,mid-1,value);
            if(arr[mid]<value)
                return  binarySearch(arr,mid+1,high,value);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};

        System.out.println(binarySearch(arr,0,10,8));
    }
}
