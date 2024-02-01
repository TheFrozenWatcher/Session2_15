package Exercise;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        String longestIncreasingSubstring = findLongestIncreasingSubstring(input);

        System.out.println("Chuỗi tăng dần lớn nhất: " + longestIncreasingSubstring);

        scanner.close();
    }

    private static String findLongestIncreasingSubstring(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }

        String currentSubstring = String.valueOf(input.charAt(0));
        String longestSubstring = currentSubstring;

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar >= currentSubstring.charAt(currentSubstring.length() - 1)) {
                currentSubstring += currentChar;
            } else {
                currentSubstring = String.valueOf(currentChar);
            }

            if (currentSubstring.length() > longestSubstring.length()) {
                longestSubstring = currentSubstring;
            }
        }

        return longestSubstring;
    }
}
