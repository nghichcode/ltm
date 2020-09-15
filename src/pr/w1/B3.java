package pr.w1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Nguyễn Văn Diên - 16022428
3. Viết chương trình đọc dữ liệu từ một file text và lưu các ký tự là chữ cái sang một file khác.
*/
public class B3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten file:");
        String sf = sc.nextLine();
        try {
            FileInputStream fi =new FileInputStream(sf);
            FileOutputStream fo=new FileOutputStream("out_"+sf);
            int i=0;
            while ( (i=fi.read())!=-1 ){
                if ( Character.isLetter((char)i) ) fo.write(i);
            }
            fi.close();
            fo.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
