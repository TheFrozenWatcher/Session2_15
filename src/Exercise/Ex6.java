package Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] array = getArr();
        System.out.println(arrayToString(array));
        System.out.print("Nhập giá trị cần tìm: ");
        int target = scanner.nextInt();

        // Bước 3: Tìm kiếm nhị phân
        int result = binarySearch(array, target);

        // Bước 4: In kết quả
        if (result != -1) {
            System.out.println("Giá trị " + target + " được tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Không tìm thấy giá trị " + target + " trong mảng.");
        }
    }

    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    private static String arrayToString(Integer[] arr) {
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
    private static int binarySearch(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Trả về vị trí nếu tìm thấy
            } else if (arr[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Trả về -1 nếu không tìm thấy
    }


}
