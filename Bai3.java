package StringHanding;

import java.util.Locale;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi muốn chuẩn hóa");
        String str = scanner.nextLine();
        str = strStandar(str);
        System.out.println(str);

    }

    public static String strStandar(String str) {
        String newStr = str.trim().toLowerCase();
        newStr = newStr.replaceAll("\\s+"," ");
        String[] temps = newStr.split(" ");
        newStr = "";
        for (int i = 0; i < temps.length; i++)
        {
            newStr += String.valueOf(temps[i].charAt(0)).toUpperCase(Locale.ROOT) + temps[i].substring(1);
            if(i<temps.length-1)
                newStr+=" ";
        }
        return newStr;
    }
}
