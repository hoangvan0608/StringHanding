package StringHanding;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        StringBuilder list = new StringBuilder();
        for (int i = 100000; i < 1000000; i++) {
            StringBuilder temp = new StringBuilder();
            temp.append(i);
            boolean check = kiemTraSoThuanNgich(temp);
            if(check)
            {
                list.append(i).append(" ");
            }
        }
        System.out.println("Danh sách số thuận nghịch có 6 chữ số là: ");
        System.out.println(list.toString());
    }
    public static boolean kiemTraSoThuanNgich(StringBuilder builder1)
    {
        String str1 = builder1.toString();
        String str2 = builder1.reverse().toString();
        if(str1.equals(str2))
            return true;
        return false;
    }
}
