package Exercise;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập mảng từ bàn phím
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập mảng số nguyên tăng dần:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử ở vị trí " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        // Bước 2: Nhập giá trị cần tìm
        System.out.print("Nhập giá trị cần tìm: ");
        int target = scanner.nextInt();

        // Bước 3: Tìm kiếm nhị phân
        int result = binarySearch(arr, target);

        // Bước 4: In kết quả
        if (result != -1) {
            System.out.println("Giá trị " + target + " được tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Không tìm thấy giá trị " + target + " trong mảng.");
        }
    }

    // Phương thức thực hiện tìm kiếm nhị phân
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Trả về vị trí nếu tìm thấy
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Trả về -1 nếu không tìm thấy
    }

}
