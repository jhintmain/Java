package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인 메소드에서 해결할게요");
        }
    }

    public static void writeFile() throws IOException {
    /*    try {
            FileWriter fileWriter = new FileWriter("test.txt");
            throw new IOException("파일 쓰기에 실패했어요");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("writeFile 파일 메소드 내에서 해결했어요");
        }*/


        FileWriter fileWriter = new FileWriter("test.txt");
        throw new IOException("파일 쓰기에 실패했어요");
    }
}


