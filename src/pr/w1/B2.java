package pr.w1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Nguyễn Văn Diên - 16022428
2. Viết chương trình nhập tên file cần tạo mới và các chuỗi ký tự từ bàn phím cho đến khi nhập ký tự kết thúc.
 Lưu các chuỗi ký tự đã nhập vào file được tạo mới và xuất kích thước file ra màn hình.
*/
public class B2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten file:");
        String sf = sc.nextLine();
        try {
            FileOutputStream f=new FileOutputStream(sf);
            System.out.println("Nhap chuoi ky tu:");
            String s;
            do {
                s = sc.nextLine();
                if(!s.isEmpty()) {f.write((s + '\n').getBytes());}
            } while (!s.isEmpty());
            System.out.println("Kich thuoc file: "+Files.size(Paths.get(sf))+ " bytes");
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
