package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập mảng từ bàn phím và sắp xếp lại mảng
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        // Bước 2: Nhập giá trị cần tìm
        System.out.print("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();

        // Bước 3: Gọi hàm tìm kiếm nhị phân
        int result = binarySearch(array, 0, n - 1, value);

        // Bước 4: In kết quả
        if (result == -1) {
            System.out.println("Không tìm thấy giá trị " + value + " trong mảng.");
        } else {
            System.out.println("Giá trị " + value + " được tìm thấy tại vị trí " + result);
        }

        scanner.close();
    }

    // Bước 3: Định nghĩa hàm tìm kiếm nhị phân sử dụng đệ quy
    private static int binarySearch(int[] array, int left, int right, int value) {
        if (left <= right) {
            int middle = left + (right - left) / 2;

            // Trường hợp tìm thấy giá trị
            if (array[middle] == value) {
                return middle;
            }

            // Nếu giá trị cần tìm nhỏ hơn giá trị ở giữa, tìm bên trái
            if (value < array[middle]) {
                return binarySearch(array, left, middle - 1, value);
            }

            // Nếu giá trị cần tìm lớn hơn giá trị ở giữa, tìm bên phải
            return binarySearch(array, middle + 1, right, value);
        }

        // Trường hợp không tìm thấy
        return -1;
    }
}
