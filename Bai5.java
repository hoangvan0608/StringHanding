package StringHanding;

import java.util.Locale;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập họ tên theo cấu trúc (Họ...Đệm...Tên) :");
        String name = scanner.nextLine();
        String[] split = name.split("[ ,.\\?\\!\n\t]+");
        String firstName = split[split.length -1];
        String lastName = split[0];
        String midName = "";
        for (int i = 1; i < split.length -1; i++) {
            midName+= split[i];
            if(i< split.length-2)
                midName+=" ";
        }
        System.out.println("Tên theo cấu trúc Tên...Họ...Đệm là");
        System.out.println(String.format("%s %s %s",firstName,lastName,midName));
    }

}
