package StringHanding;

import java.util.Scanner;

public class Bai6 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       String str = "";
       do {
           str = inputStr();
           if(!checkSentence(str))
               System.out.println("Nhập quá 20 từ! Vui lòng nhập lại!");
       }while (!checkSentence(str));
        String split[] = str.split(" ");

        for (int i = 0; i < split.length-1; i++)
        {
            if(!checkWord(split[i]))
            {
                System.out.println("Nhấp quá số ký tự trong 1 từ! Một từ tối đa 10 ký tự!");
                return;
            }
            else
            {
                String temp ="";
                for (int j = i+1; j < split.length; j++) {
                    if(split[i].compareToIgnoreCase(split[j]) > 0)
                    {
                        temp = split[i];
                        split[i] = split[j];
                        split[j] = temp;
                    }
                }
            }
        }
        System.out.println("Các từ trong câu sau khi sắp xếp là: ");
        for (String s :
                split) {
            System.out.print(s+" ");
        }

    }
    public static String inputStr()
    {
        String str = "";
        System.out.println("Mời bạn nhập vào một câu bất kỳ: ");
        str = scanner.nextLine();
        return str;
    }
    public static boolean checkSentence(String str)
    {
        String[] temp = str.split(" ");
        int length = temp.length;
        if(length <= 20)
            return true;
        return false;
    }
    public static boolean checkWord(String str)
    {
        if(str.length() <=10)
            return true;
        return false;
    }
}
