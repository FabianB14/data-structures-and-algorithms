package code401challenges;

public class ArrayShift {
    public static  int [] arrayShift(int[] arrTOBeshifted, int intToBeshifted){
        int[] newArr = new int[arrTOBeshifted.length + 1];
        newArr[(arrTOBeshifted.length+1)/2] = intToBeshifted;
        System.out.println(newArr[(arrTOBeshifted.length+1)/2]);
        int front = 0;
        int back = arrTOBeshifted.length -1;
        while(front <= back) {
            if (front < back) {
                newArr[front] = arrTOBeshifted[front];

                newArr[back + 1] = arrTOBeshifted[back];
            } else {
                newArr[front] = arrTOBeshifted[front];
            }
            front++;
            back--;
        }
        return newArr;
    }
}
