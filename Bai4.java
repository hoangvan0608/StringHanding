package StringHanding;

import java.util.Locale;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một sâu bất kỳ: ");
        String str = scanner.nextLine();
        String[] split = str.toLowerCase(Locale.ROOT).split("[ ,.\\?\\!\n\t]+");
        getIndex(split);

    }
    public static void getIndex(String[] strings)
    {
        int max = 0;
        int index = 0;
        String s = "";
        for (int i = 0; i < strings.length; i++) {
            int temp = strings[i].length();
            if(temp > max)
            {
                max = temp;
                index = i;
                s = strings[i];
            }
        }
        System.out.println(String.format("Từ có dài nhất đầu tiên trong chuỗi là '%s' tại\nvị trí %d với độ dài là: %d",s,index,max));

    }
}
