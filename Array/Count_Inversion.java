package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Count_Inversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(countInversions(arr));
        System.out.println(Arrays.toString(arr));
    }

    static int countInversions(int[] nums) {
        return sort(nums, 0, nums.length - 1);
    }

    static int sort(int[] arr, int low, int high) {
        int sum = 0;
        if (low < high) {
            int mid = (low + high) >> 1;
            sum += sort(arr, low, mid);
            sum += sort(arr, mid + 1, high);
            sum += merge(arr, low, mid, high);
        }

        return sum;
    }

    static int merge(int[] arr,int low,int mid,int high){
        int[] newArr = new int[high+1];
        int i=low,j=mid+1,k=low, inversions = 0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j])
                newArr[k++] = arr[i++];
            else{
                newArr[k++] = arr[j++];
                inversions+= (mid+1)-i;r
            }
        }
        while(i<=mid) newArr[k++] = arr[i++];
        while(j<=high){
            newArr[k++] = arr[j++];
        }
        for(int index=low;index<=high;index++){
            arr[index]= newArr[index];
        }
        return inversions;
    }
}
