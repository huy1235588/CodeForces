package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static String convertToAlphabet(int number) {
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            number--;
            int remainder = number % 26;
            result.append(Character.toString((char) (remainder + 'A')));
            number /= 26;
        }
        return result.reverse().toString();
    }

    static int convertToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Pattern pattern = Pattern.compile("^R([1-9]\\d{0,6})C([1-9]\\d{0,6})$");

        for (int i = 0; i < n; i++) {
            String cell = sc.next();
            Matcher matcher = pattern.matcher(cell);
            if (matcher.matches()) {
                int row = Integer.parseInt(matcher.group(1));
                int column = Integer.parseInt(matcher.group(2));

                String columnString = convertToAlphabet(column);
                System.out.println(columnString + row);
            } else {
                StringBuilder row = new StringBuilder();
                StringBuilder column = new StringBuilder();

                for (int j = 0; j < cell.length(); j++) {
                    if (Character.isLetter(cell.charAt(j))) {
                        column.append(cell.charAt(j));
                    } else {
                        row.append(cell.charAt(j));
                    }
                }
                int columnNumber = convertToNumber(column.toString());
                System.out.println("R" + row + "C" + columnNumber);
            }
        }
    }
}