package Exercise;

public class Ex2 {
    public static void main(String[] args) {
        // Bước 1: Tạo mảng số nguyên và gọi hàm getArr() để gán
        int[] arr = getArr();

        // Bước 2: In ra mảng số nguyên
        System.out.println("Mảng số nguyên: " + arrayToString(arr));

        // Bước 3: Cài đặt thuật toán tìm kiếm tuyến tính để tìm số lớn nhất
        int minNumber = linearSearchMax(arr);

        // Bước 4: In số lớn nhất ra
        System.out.println("Số lớn nhất trong mảng là: " + minNumber);
    }

    // Hàm trả về một mảng ngẫu nhiên 20 số tự nhiên
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
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

    // Hàm tìm số nhỏ nhất bằng thuật toán tìm kiếm tuyến tính
    private static int linearSearchMax(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <min) {
                min = arr[i];
            }
        }
        return min;
    }
}
