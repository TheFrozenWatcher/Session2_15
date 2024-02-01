package Exercise;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        String[] string = {"Chuoi1", "Chuoi2", "Chuoi3", "Chuoi4", "Chuoi5"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi cần tìm kiếm: ");
        String stringToFind = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < string.length; i++) {
            if (string[i].equals(stringToFind)) {
                System.out.println("Chuỗi được tìm thấy tại vị trí " + i);
                found = true;
                break; // Dừng vòng lặp khi tìm thấy chuỗi
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy chuỗi trong danh sách.");
        }


    }
}
