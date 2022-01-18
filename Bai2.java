package StringHanding;

import java.util.Locale;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi bất kỳ: ");
        String input = scanner.nextLine();
        System.out.println();
        System.out.println(toUpandDown(input.trim()));
    }

    public static String toUpandDown(String str)
    {
        String[] split = str.split("");
        StringBuilder b =new StringBuilder();
        boolean check = true;
        for (String s : split)
        {
            if(check)
            {
                s = s.toUpperCase(Locale.ROOT);
                b.append(s);
                check =false;
            }
            else {
                s.toLowerCase(Locale.ROOT);
                b.append(s);
                check = true;
            }

        }

        return b.toString();
    }
}
