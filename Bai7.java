package StringHanding;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào xâu s1: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập vào xâu s2: ");
        String str2 = scanner.nextLine();
        if (str1.contains(str2)) {
            str1 = str1.replace(str2, "");
        }
        System.out.println( str1);

    }
}
