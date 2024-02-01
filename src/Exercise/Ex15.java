package Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String string = scanner.nextLine();
        if (string.length() == 0) {
            System.out.println("Không thể thao tác với chuỗi rỗng!");
        } else {
            List<String> arrayString = new ArrayList<>();
            for (int i = 0; i < string.length(); i++) {
                Set<Character> charSet = new HashSet<>();
                StringBuilder stringBuilder = new StringBuilder();

                for (int j = i; j < string.length(); j++) {
                    char currentChar = string.charAt(j);
                    if (!charSet.contains(currentChar)) {
                        charSet.add(currentChar);
                        stringBuilder.append(currentChar);
                    } else {
                        break;
                    }
                }
                arrayString.add(stringBuilder.toString());
            }
            Map<String, Integer> lengthCount = arrayString.stream().collect(Collectors.toMap(s -> s, String::length));
            String longestString = lengthCount.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).orElse("");
            System.out.println("Chuỗi dài nhất là " + longestString);
        }

    }
}
