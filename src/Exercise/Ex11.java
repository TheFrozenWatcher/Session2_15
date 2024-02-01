package Exercise;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        // Bước 1: Tạo mảng số thực
        double[] realNumbers = {2.5, 7.8, 3.0, 1.2, 9.4, 5.6};

        // Bước 2: Nhập số cần tìm từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị cần tìm: ");
        double targetValue = scanner.nextDouble();

        // Bước 3: Tìm kiếm tuyến tính và in ra vị trí (nếu có)
        int position = -1;
        for (
                int i = 0;
                i < realNumbers.length; i++) {
            if (realNumbers[i] == targetValue) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Giá trị " + targetValue + " được tìm thấy tại vị trí " + position);
        } else {
            System.out.println("Không tìm thấy giá trị " + targetValue + " trong mảng");
        }

        // Tìm giá trị lớn nhất trong mảng và in ra
        double maxNumber = realNumbers[0];
        for (
                int i = 1;
                i < realNumbers.length; i++) {
            if (realNumbers[i] > maxNumber) {
                maxNumber = realNumbers[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + maxNumber);

        scanner.close();
    }
}