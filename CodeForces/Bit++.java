import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;

        for (int i = 0; i < n; i++) {
            String statement = sc.next();
            if (statement.contains("+")) {
                x++;
            } else {
                x--;
            }
        }

        System.out.println(x);
    }
}
