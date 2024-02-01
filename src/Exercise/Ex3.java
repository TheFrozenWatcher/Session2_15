package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int[][] newArr = getArr();
        Scanner sc = new Scanner(System.in);
        System.out.println(arrayToString(newArr));
        System.out.println("Nhập giá trị cần tìm");
        int value = sc.nextInt();
        List<String> found = findValue(value, newArr);
        if (found==null) {
            System.out.println("Không tìm thấy giá trị");
        } else {
            System.out.println("Danh sách vị trí: "+found);

        }
    }

    private static int[][] getArr() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr;
    }

    private static String arrayToString(int[][] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += "{";
            for (int j = 0; j < arr[i].length - 2; j++) {
                result += arr[i][j] + ",";
            }
            result += arr[i][arr.length - 1] + "}";
        }
        result += "]";
        return result;
    }

    private static List<String> findValue(int num, int[][] arr) {
        boolean check = false;
        List<String> indexList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    indexList.add("(" + i + "," + j + ")");
                    check = true;
                }
            }
        }
        if (check) {
            return indexList;

        } else {
            return null;
        }
    }
}

