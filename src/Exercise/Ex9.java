package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex9 {
    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }

    private static int findClosestGreaterOrEqual(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    private static int findClosestLesserOrEqual(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Integer[] array = getArr();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mảng hiện tại: " + Arrays.toString(array));

        System.out.print("Nhập số nhỏ nhất: ");
        int min = scanner.nextInt();
        System.out.print("Nhập số lớn nhất: ");
        int max = scanner.nextInt();

        int closestGreaterOrEqualIndex = findClosestGreaterOrEqual(array, min);
        int closestLesserOrEqualIndex = findClosestLesserOrEqual(array, max);

        if (closestGreaterOrEqualIndex == -1 || closestLesserOrEqualIndex == -1
                || closestGreaterOrEqualIndex > closestLesserOrEqualIndex) {
            System.out.println("Không có số nào trong khoảng.");
        } else {
            int count = closestLesserOrEqualIndex - closestGreaterOrEqualIndex + 1;
            System.out.println("Số lượng số trong khoảng: " + count);
            System.out.print("Các số trong khoảng: ");
            for (int i = closestGreaterOrEqualIndex; i <= closestLesserOrEqualIndex; i++) {
                System.out.print(array[i] + " ");
            }
        }


    }
}
