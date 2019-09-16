package code401challenges;

public class ArrayShift {
    public static  int [] arrayShift(int[] arrTOBeshifted, int intToBeshifted){
        int[] newArr = new int[arrTOBeshifted.length + 1];
        newArr[(arrTOBeshifted.length+1)/2] = intToBeshifted;
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
        System.out.println(newArr[0]);
//        System.out.println(newArr[1]);
//        System.out.println(newArr[2]);
//        System.out.println(newArr[3]);
//        System.out.println(newArr[4]);
        return newArr;
    }
}
