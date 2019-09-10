package code401challenges;

public class MergeSort {
    public static int[] mergeSorter(int[] arr, int len){
        if(len < 2){
            return arr;
        }
        int middle = len / 2;
        int[] left = new int[middle];
        int[] right = new int[len - middle];

        for(int i = 0; i < middle; i++){
            left[i] = arr[i];
        }
        for(int i = middle; i < len; i++){
            right[i - middle] = arr[i];
        }
        mergeSorter(left, middle);
        mergeSorter(right, len - middle);

        merge(arr,left,right,middle,len - middle);

        return arr;
    }
    public static  void merge(int[]arr, int[] left, int[] right, int leftLen, int rightLen){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < leftLen && j < rightLen){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while(i < leftLen){
            arr[k++] = left[i++];
        }
        while(j < leftLen){
            arr[k++] = right[j++];
        }
    }
}
