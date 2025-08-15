// 

import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            int digit = sb.charAt(i) - '0';
            int inverted = 9 - digit;

            // first digit cannot become 0
            if (i == 0 && inverted == 0) {
                continue;
            }
            if (inverted < digit) {
                sb.setCharAt(i, (char)(inverted + '0'));
            }
        }

        System.out.println(sb.toString());
    }
}
