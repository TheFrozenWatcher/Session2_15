package Exercise;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int x=sc.nextInt();
        if (x<1){
            System.out.println("Độ dài mảng không hợp lệ");
            return;
        }
        int[] array=getArr(x);
        int maxNumber = linearSearchMax(array);

        // Bước 4: In số lớn nhất ra
        System.out.println("Số lớn nhất trong mảng là: " + maxNumber);
    }
    private static int[] getArr(int length) {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử ở vị trí "+i+":");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Hàm in ra mảng số nguyên
    private static String arrayToString(int[] arr) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            if (i < arr.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
    private static int linearSearchMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
