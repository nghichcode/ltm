package pr.w1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
Nguyễn Văn Diên - 16022428
4. Viết chương trình đọc dữ liệu từ một file ảnh và lưu dữ liệu đó sang một file khác.
 Sử dụng hàm  md5 hoặc md5sum để kiểm tra xem dữ liệu của 2 file có trùng nhau không.
*/
public class B4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten file:");
        String sf = sc.nextLine();
        try {

            FileInputStream fi =new FileInputStream(sf);
            FileOutputStream fo=new FileOutputStream("out_" + sf);
            int i=0;
            while ( (i=fi.read())!=-1 ){ fo.write(i); }
            fi.close();
            fo.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
