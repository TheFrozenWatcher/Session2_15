package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex8 {
    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = getArr();
        System.out.println("Mảng hiện tại: "+ Arrays.toString(array));
        System.out.println("Nhập số nhỏ nhất");
        int min = sc.nextInt();
        System.out.println("Nhập số lớn nhất");
        int max = sc.nextInt();
        List<Integer> newArray = new ArrayList<>();
        for (int num:array){
            if (min<=num&&num<=max){
                newArray.add(num);
            }
        }
        System.out.println("Các số thỏa mãn điều kiện là "+newArray);
    }

}
