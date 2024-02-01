package Exercise;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        // Bước 1: Tạo mảng số thực (đã sắp xếp tăng dần)
        double[] realNumbers = {1.2, 2.5, 3.0, 5.6, 7.8, 9.4};

        // Bước 2: Nhập số cần tìm từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị cần tìm: ");
        double targetValue = scanner.nextDouble();

        // Bước 3: Tìm kiếm nhị phân và in ra vị trí (nếu có)
        int position = binarySearch(realNumbers, targetValue);
        if (position != -1) {
            System.out.println("Giá trị " + targetValue + " được tìm thấy tại vị trí " + position);
        } else {
            System.out.println("Không tìm thấy giá trị " + targetValue + " trong mảng");
        }

        // Tìm giá trị lớn nhất trong mảng và in ra
        double maxNumber = realNumbers[realNumbers.length - 1];
        System.out.println("Giá trị lớn nhất trong mảng là: " + maxNumber);

        scanner.close();
    }

    private static int binarySearch(double[] arr, double target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Tìm thấy giá trị, trả về vị trí
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Không tìm thấy giá trị trong mảng
    }
}
