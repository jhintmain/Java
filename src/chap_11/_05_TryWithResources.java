package chap_11;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.io.BufferedWriter;

public class _05_TryWithResources {
    public static void main(String[] args) {
        MyFileWriter myFileWriter = null;

        try{
            myFileWriter = new MyFileWriter();
            myFileWriter.write("아이스 크림이 먹고 싶어요");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                myFileWriter.close();
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }

        System.out.println("------------------------");

        // try-with-resources AutoCloseable 인터페이스를 구현해준 클래스에서만 사용가능
        // 파일 입출력시 자주사용하는 BufferedWriter 클래스도 AuthCloseable 을 상속받음.
        try(MyFileWriter myFileWriter2 = new MyFileWriter()){
            myFileWriter2.write("빵이 먹고싶어요");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

class MyFileWriter implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다");
    }

    public void write(String line){
        System.out.println("파일 내용을 입력합니다");
        System.out.println("입력 내용 : "+line);
    }
}
