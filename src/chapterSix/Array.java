package chapterSix;

public class Array {
    public static void main(String[] args) {

        int[] arr;
        arr = new int[5];

        arr[0] = 10;
        arr[1] = 0;
        arr[2] = 15;
        arr[3] = 23;
        arr[4] = 4;


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element of index" + i + " : " + arr[i]);
        }
    }
}
