package code401challenges;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key){
        int front = 0;
        int mid = (arr.length +1)/2;
        int back = arr.length -1;
        if(arr[front] == key ){
            return front;
        }
        else if(arr[back] == key ){
            return back;
        }
        if(back < 2 && back != key){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[mid]!= key && arr[mid] > key  ){
                back = mid ;
                if(front == 0) {
                    mid = (back - front) / 2 +1;
                }
                else{
                    mid = (back - front)/2 + mid -2;
                }
            }
            else if(arr[mid] != key && arr[mid] < key){
                front = mid;
                mid = (back - front)/2 + mid ;
            }
            else if(arr[mid] == key){
                return mid;
            }
        }
        return -1;
    }
}
