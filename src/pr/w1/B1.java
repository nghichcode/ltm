package pr.w1;

import java.util.Scanner;

/*
Nguyễn Văn Diên - 16022428
1. Viết chương trình nhập chuỗi ký tự từ bàn phím và xuất ra số ký tự là chữ cái,
 số ký tự là số và số ký tự là các ký hiệu.
*/
public class B1 {
    public static void main(String[] args) {
        System.out.println("Nhap chuoi ky tu:");
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();

        int c_alp=0, c_num=0, c_sym=0;
        for (int i = 0; i<s.length(); i++){
            if (Character.isLetter(s.charAt(i))){
                c_alp++;
            } else if (Character.isDigit(s.charAt(i))){
                c_num++;
            } else if (Character.isWhitespace(s.charAt(i))){
                c_sym++;
            }
        }

        System.out.println("So ky tu la chu: "+c_alp);
        System.out.println("So ky tu la so: "+c_num);
        System.out.println("So ky tu la ky hieu: "+c_sym);
    }
}
